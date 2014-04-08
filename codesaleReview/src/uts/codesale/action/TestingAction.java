package uts.codesale.action;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import uts.codesale.beans.Algorithm;
import uts.codesale.beans.Review;
import uts.codesale.beans.Testing;
import uts.codesale.beans.User;
import uts.codesale.commons.AbstractAction;
import uts.codesale.commons.FileExtension;
import uts.codesale.security.SessionUserDetailsUtil;
import uts.codesale.service.AlgorithmService;
import uts.codesale.service.TestingService;
import uts.codesale.service.UserService;

//import com.opensymphony.xwork2.ActionContext;

public class TestingAction extends AbstractAction{

	private static final long serialVersionUID = -5294874904579655334L;
	private static Logger log = LoggerFactory.getLogger(TestingAction.class);
	private Iterator<Algorithm> reviewList;
	private Algorithm algorithm = new Algorithm();
	private long alg_id;
	private long user_id;
	private boolean test;
	private Map<Long,String> userMap = new HashMap<Long,String>();
	private Iterator<Algorithm> testingList;
	private User user;
	private UserService userService;
	private TestingService testingService;
	private AlgorithmService algorithmService;
	private List<String> resultList = new ArrayList<String>();
	private String comments;
	private String result;
	private File test_file;
	private String test_fileFileName;
	private String test_fileContentType;
	private String baseDir;
	private List<Long> testers;
	private Iterator<User> allUsers;
	private Iterator<Review> reviews;
	private Iterator<Testing> testings;
	private boolean admin;
	private String adminComment;
	private String adminResult;
	private Testing current_test;
	private String price;
	private String username;
	private long test_id;
	
	
	public String agl_testingList() throws Exception{
		if (!this.isUserLogin())
			return INPUT;
//		User user = (User) ActionContext.getContext().getSession().get("user");
		User user = this.userService.getUserByUsername(SessionUserDetailsUtil.getLoginUserName());
		testingList = userService.getTestingAlgorithmsByUserID(user.getId()).iterator();
//		waitingTestingList = algorithmService.getWaitingTestingAlgorithms().iterator();
		return SUCCESS;
	}
	
	public String displayTesting_add() throws Exception {
		if (!this.isUserLogin())
			return INPUT;
		algorithm = this.getAlgorithmService().get(getAlg_id());
//		user = (User) ActionContext.getContext().getSession().get("user");
		user = this.userService.getUserByUsername(SessionUserDetailsUtil.getLoginUserName());
		allUsers = userService.getAll().iterator();
		reviews = this.getAlgorithmService().getReviewByAlg_Id(alg_id).iterator();
		if(algorithm.getTest_results().trim().equalsIgnoreCase("Waiting")){
			test = true;
		}else{
			test = false;
		}
		
		return SUCCESS;
	}
	
	public String displayTesting_edit() throws Exception {
		if (!this.isUserLogin())
			return INPUT;
		this.algorithm = this.getAlgorithmService().get(getAlg_id());
//		user = (User) ActionContext.getContext().getSession().get("user");
		user = this.userService.getUserByUsername(SessionUserDetailsUtil.getLoginUserName());
		
		reviews = this.getAlgorithmService().getReviewByAlg_Id(alg_id).iterator();
		
		List<Testing> tests = this.getAlgorithmService().getTestingByAlg_Id(alg_id);
		for(Testing t : tests) {
			if(t.getUser().getId()==user.getId()) {
				this.current_test = t;
				if(t.getStatus().equalsIgnoreCase("Ongoing"))
					test = true;
				else{
					test = false;
				}
			}
		}
		
		return SUCCESS;
	}
	
	
	public String testing_add() throws Exception{
		if (!this.isUserLogin())
			return INPUT;
		
		Algorithm agl = this.getAlgorithmService().get(this.getAlg_id());
		Set<Testing> tests = agl.getTestings();

		for(long userId : testers) {
			
			User cur_session_user = this.getUserService().get(userId);
			Testing testing = new Testing();
			testing.setAlg(agl);
			testing.setUser(cur_session_user);
			testing.setStatus("Ongoing");
			testing.setResults("Ongoing");
			this.testingService.save(testing);
			
			tests.add(testing);
			
			Set<Testing> testings = cur_session_user.getTestings();
			testings.add(testing);
			cur_session_user.setTestings(testings);
			log.info("Admin assign the test to User ("+cur_session_user.getUsername()+"). and the algorithm is id:"+this.getAlg_id());
			this.getUserService().save(cur_session_user);
		}
		
		agl.setTest_results("Ongoing");
		agl.setCurrent_status("Test - Ongoing");
		agl.setTestings(tests);
		this.getAlgorithmService().save(agl);
		
		return SUCCESS;
	}
	
	public String testing_edit() throws Exception{
		if (!this.isUserLogin())
			return INPUT;
		
		Algorithm alg = this.getAlgorithmService().get(this.getAlg_id());
//		user = (User) ActionContext.getContext().getSession().get("user");
		user = this.userService.getUserByUsername(SessionUserDetailsUtil.getLoginUserName());
		Set<Testing> testings = alg.getTestings();
		for(Testing test: testings) {
			if(test.getUser().getId()==this.getUser_id()) {
				Testing testing = test;
				testing.setStatus(this.result);
				testing.setResults(this.comments);
				String fileName = "";
				if(null!=this.test_fileFileName) {
					try {
			        	String filePath = baseDir+"/data/testFiles/";
			        	File basePath = new File(filePath);
			        	if(!basePath.exists()) {
			        		basePath.mkdirs();
			        	}
			        	fileName = System.currentTimeMillis() +"."+ FileExtension.getExtension(test_fileFileName);
			            File fileToCreate = new File(filePath, fileName);
						FileUtils.copyFile(this.test_file, fileToCreate);
					} catch (IOException | NullPointerException e ) {
						
						e.printStackTrace();
						return INPUT;
					}
				}
				testing.setTestFile(test_fileFileName);
				testing.setTestFile_server(fileName);
				testing.setPrice(price);
				testingService.save(testing);
			}
		}
		
		Set<Testing> tests = alg.getTestings();
		String currentStatus = "";
		for(Testing test: tests) {
			if(test.getStatus().equalsIgnoreCase("Ongoing")) {
				currentStatus = "Ongoing";
				break;
			}else {
				currentStatus = "Done";
			}
		}
		
		alg.setTest_results(currentStatus);
		alg.setCurrent_status("Test - "+currentStatus);
		this.getAlgorithmService().save(alg);
		log.info("User ("+user.getUsername()+") edited the the test of the algorithm is id:"+this.getAlg_id());
		this.algorithm = alg;
		return SUCCESS;
	}
	
	public String testing_delete() throws Exception {
		if (!this.isUserLogin())
			return INPUT;
		algorithm = this.getAlgorithmService().get(getAlg_id());
		reviews = this.getAlgorithmService().getReviewByAlg_Id(getAlg_id()).iterator();
		
		Set<Testing> algTestings = algorithm.getTestings();
		
		User user = this.getUserService().getUserByUsername(username);
		Set<Testing> userTestings = user.getTestings();
		
		Testing test = this.getTestingService().get(test_id);
		
		algTestings.remove(test);
		algorithm.setTestings(algTestings);
		this.getAlgorithmService().save(algorithm);
		userTestings.remove(test);
		user.setTestings(userTestings);
		this.getUserService().save(user);
		this.getTestingService().remove(test_id);
		
		testings = this.getAlgorithmService().getTestingByAlg_Id(alg_id).iterator();
		
		List<User> testers = new ArrayList<User>();
		for(Testing t : this.getAlgorithmService().getTestingByAlg_Id(getAlg_id())) {
			testers.add(t.getUser());
		}
		List<User> users = userService.getAll();
		List<User> users_temp = new ArrayList<User>();;
		for(User u : users) {
			if(testers.contains(u)) {
				u.setDisable("true");
			}else {
				u.setDisable("false");
			}
			users_temp.add(u);
		}
		
		allUsers = users_temp.iterator();
		log.info("Admin deleted the test of algorithm "+this.getAlg_id()+", the reviewer is "+username);
		return SUCCESS;
	}
	
	public String testing_ongoing() throws Exception {
		if (!this.isUserLogin())
			return INPUT;
		algorithm = this.getAlgorithmService().get(getAlg_id());
		reviews = this.getAlgorithmService().getReviewByAlg_Id(getAlg_id()).iterator();
		testings = this.getAlgorithmService().getTestingByAlg_Id(alg_id).iterator();
		
		List<User> testers = new ArrayList<User>();
		for(Testing t : this.getAlgorithmService().getTestingByAlg_Id(getAlg_id())) {
			testers.add(t.getUser());
		}
		List<User> users = userService.getAll();
		List<User> users_temp = new ArrayList<User>();;
		for(User u : users) {
			if(testers.contains(u)) {
				u.setDisable("true");
			}else {
				u.setDisable("false");
			}
			users_temp.add(u);
		}
		
		allUsers = users_temp.iterator();
		return SUCCESS;
	}
	
	public String testing_done() throws Exception {
		if (!this.isUserLogin())
			return INPUT;
		algorithm = this.getAlgorithmService().get(getAlg_id());
		reviews = this.getAlgorithmService().getReviewByAlg_Id(getAlg_id()).iterator();
		testings = this.getAlgorithmService().getTestingByAlg_Id(alg_id).iterator();
//		user = (User) ActionContext.getContext().getSession().get("user");
		User user = this.userService.getUserByUsername(SessionUserDetailsUtil.getLoginUserName());
		if(user.getAdmin().equalsIgnoreCase("yes")){
			admin = true;
		}else{
			admin = false;
		}
		return SUCCESS;
	}
	
	public String testing_done_submit() throws Exception {
		if (!this.isUserLogin())
			return INPUT;
		algorithm = this.getAlgorithmService().get(getAlg_id());
		algorithm.setAdmin_comment(this.adminComment);
		algorithm.setTest_results(adminResult);
		algorithm.setCurrent_status(adminResult);
		this.getAlgorithmService().save(algorithm);
		log.info("Admin submited the desision of tests of algorithm "+this.getAlg_id()+", Current_status is Test - " + adminResult);
		return SUCCESS;
	}

	
	public Iterator<Algorithm> getReviewList() {
		return reviewList;
	}
	public void setReviewList(Iterator<Algorithm> reviewList) {
		this.reviewList = reviewList;
	}

	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	public AlgorithmService getAlgorithmService() {
		return algorithmService;
	}
	public void setAlgorithmService(AlgorithmService algorithmService) {
		this.algorithmService = algorithmService;
	}


	public Iterator<Algorithm> getTestingList() {
		return testingList;
	}


	public void setTestingList(Iterator<Algorithm> testingList) {
		this.testingList = testingList;
	}



	public Algorithm getAlgorithm() {
		return algorithm;
	}

	public void setAlgorithm(Algorithm algorithm) {
		this.algorithm = algorithm;
	}

	public long getAlg_id() {
		return alg_id;
	}

	public void setAlg_id(long alg_id) {
		this.alg_id = alg_id;
	}

	public TestingService getTestingService() {
		return testingService;
	}

	public void setTestingService(TestingService testingService) {
		this.testingService = testingService;
	}
		
	public List<String> getResultList(){
		resultList.add("Ongoing");
		resultList.add("Accept");
		resultList.add("Reject");	
		return resultList;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public boolean isTest() {
		return test;
	}

	public void setTest(boolean test) {
		this.test = test;
	}
	
	public Map<Long, String> getUserMap() {
		
		for(User user :this.getUserService().getAll()) {
			userMap.put(user.getId(), user.getUsername());
		}
		return userMap;
	}

	public void setUserMap(Map<Long, String> userMap) {
		this.userMap = userMap;
	}
	
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public File getTest_file() {
		return test_file;
	}

	public void setTest_file(File test_file) {
		this.test_file = test_file;
	}

	public String getTest_fileFileName() {
		return test_fileFileName;
	}

	public void setTest_fileFileName(String test_fileFileName) {
		this.test_fileFileName = test_fileFileName;
	}

	public String getTest_fileContentType() {
		return test_fileContentType;
	}

	public void setTest_fileContentType(String test_fileContentType) {
		this.test_fileContentType = test_fileContentType;
	}

	public String getBaseDir() {
		return baseDir;
	}

	public void setBaseDir(String baseDir) {
		this.baseDir = baseDir;
	}

	public long getUser_id() {
		return user_id;
	}

	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}

	public List<Long> getTesters() {
		return testers;
	}

	public void setTesters(List<Long> testers) {
		this.testers = testers;
	}

	public Iterator<User> getAllUsers() {
		return allUsers;
	}

	public void setAllUsers(Iterator<User> allUsers) {
		this.allUsers = allUsers;
	}

	public Iterator<Review> getReviews() {
		return reviews;
	}

	public void setReviews(Iterator<Review> reviews) {
		this.reviews = reviews;
	}

	public Iterator<Testing> getTestings() {
		return testings;
	}

	public void setTestings(Iterator<Testing> testings) {
		this.testings = testings;
	}

	public boolean isAdmin() {
		return admin;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
	}

	public String getAdminComment() {
		return adminComment;
	}

	public void setAdminComment(String adminComment) {
		this.adminComment = adminComment;
	}

	public String getAdminResult() {
		return adminResult;
	}

	public void setAdminResult(String adminResult) {
		this.adminResult = adminResult;
	}

	public Testing getCurrent_test() {
		return current_test;
	}

	public void setCurrent_test(Testing current_test) {
		this.current_test = current_test;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public long getTest_id() {
		return test_id;
	}

	public void setTest_id(long test_id) {
		this.test_id = test_id;
	}
}
