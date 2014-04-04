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
import uts.codesale.beans.User;
import uts.codesale.commons.AbstractAction;
import uts.codesale.commons.FileExtension;
import uts.codesale.security.SessionUserDetailsUtil;
import uts.codesale.service.AlgorithmService;
import uts.codesale.service.ReviewService;
import uts.codesale.service.UserService;

//import com.opensymphony.xwork2.ActionContext; 

public class ReviewAction extends AbstractAction{

	private static final long serialVersionUID = -5294874904579655334L;
	private static Logger log = LoggerFactory.getLogger(ReviewAction.class);
	private Iterator<Algorithm> reviewList;
	private Algorithm algorithm = new Algorithm();
	private long alg_id;
	private long user_id;
	private String username;
	private long review_id;
	private boolean review;
	private boolean admin;
	private Iterator<Review> reviews;
	private UserService userService;
	private ReviewService reviewService;
	private AlgorithmService algorithmService;
	private List<String> resultList = new ArrayList<String>();
	private Map<Long,String> userMap = new HashMap<Long,String>();
	private String comments;
	private Review current_review;
	private String result;
	private User user;
	private Iterator<User> allUsers;
	private File review_file;
	private String review_fileFileName;
	private String review_fileContentType;
	private String baseDir;
	private List<Long> reviewers;
	private String adminComment;
	private String adminResult;
	private String isTester;
	private String price;
	private String msg;

	public String agl_reviewList() throws Exception{
		if (!this.isUserLogin())
			return INPUT;
//		User user = (User) ActionContext.getContext().getSession().get("user");
		User user = this.userService.getUserByUsername(SessionUserDetailsUtil.getLoginUserName());
		reviewList = userService.getReviewAlgorithmsByUserID(user.getId()).iterator();
		//waitingReviewList = algorithmService.getWaitingReviewAlgorithms().iterator();
		return SUCCESS;
	}
	
	public String displayReview_add() throws Exception {
		if (!this.isUserLogin())
			return INPUT;
		algorithm = this.getAlgorithmService().get(getAlg_id());
//		user = (User) ActionContext.getContext().getSession().get("user");
		user = this.userService.getUserByUsername(SessionUserDetailsUtil.getLoginUserName());
		allUsers = userService.getAll().iterator();
		this.reviews = this.getAlgorithmService().getReviewByAlg_Id(getAlg_id()).iterator();
		if(algorithm.getReview_result().trim().equalsIgnoreCase("Waiting")){
			review = true;
		}else{
			review = false;
		}
		
		return SUCCESS;
	}
	
	public String displayReview_edit() throws Exception {
		if (!this.isUserLogin())
			return INPUT;
		algorithm = this.getAlgorithmService().get(getAlg_id());
//		user = (User) ActionContext.getContext().getSession().get("user");
		user = this.userService.getUserByUsername(SessionUserDetailsUtil.getLoginUserName());
		
		Set<Review> reviews = this.getAlgorithmService().getReviewByAlg_Id(alg_id);
		for(Review r : reviews) {
			if(r.getUser().getId() == user.getId()) {
				this.current_review = r;
				if(r.getStatus().equalsIgnoreCase("Ongoing"))
					review = true;
				else{
					review = false;
				}
			}
		}
		return SUCCESS;
	}
	
	public String review_add() throws Exception{
		if (!this.isUserLogin())
			return INPUT;
		
		this.algorithm = this.getAlgorithmService().get(this.getAlg_id());
		Set<Review> rvws = this.algorithm.getReviews();
			
		
		if(!("true".equalsIgnoreCase(algorithm.getResubmit()))) {
			for(Long userId : reviewers) {
				User cur_session_user = this.getUserService().get(userId);
				
				Review review = new Review();
				review.setAlg(algorithm);
				review.setUser(cur_session_user);
				review.setStatus("Ongoing");
				review.setResults("Ongoing");
				reviewService.save(review);
				
				Set<Review> reviews = cur_session_user.getReviews();
				reviews.add(review);
				cur_session_user.setReviews(reviews);
				log.info("Admin assign the review to User ("+cur_session_user.getUsername()+"). and the algorithm is id:"+this.getAlg_id());
				this.getUserService().save(cur_session_user);
				rvws.add(review);
			}
			this.algorithm.setReview_result("Ongoing");
			this.algorithm.setCurrent_status("Review - Ongoing");
			this.algorithm.setReviews(rvws);
			this.getAlgorithmService().save(this.algorithm);
		}
		else {
			for(Long userId : reviewers) {
				boolean exist = false;
				for(Review r : rvws) {
					if(r.getUser().getId() == userId) {
						r.setStatus("Ongoing");
						r.setResults("Ongoing");
						reviewService.save(r);
						exist = true;
						break;
					}
				}
				if(!exist) {
					Review review = new Review();
					User cur_session_user = this.getUserService().get(userId);
					review.setAlg(algorithm);
					review.setUser(cur_session_user);
					review.setStatus("Ongoing");
					review.setResults("Ongoing");
					reviewService.save(review);
					
					Set<Review> reviews = cur_session_user.getReviews();
					reviews.add(review);
					cur_session_user.setReviews(reviews);
					this.getUserService().save(cur_session_user);
					log.info("Admin assign the review to User ("+cur_session_user.getUsername()+"). and the algorithm is id:"+this.getAlg_id());
					rvws.add(review);
				}
			}
			this.algorithm.setReview_result("Ongoing");
			this.algorithm.setCurrent_status("Review - Ongoing");
			this.algorithm.setReviews(rvws);
			this.getAlgorithmService().save(this.algorithm);
		}
		return SUCCESS;
	}
	
	public String review_edit() throws Exception{
		if (!this.isUserLogin())
			return INPUT;
		
		Algorithm alg = this.getAlgorithmService().get(this.getAlg_id());
//		user = (User) ActionContext.getContext().getSession().get("user");
		user = this.userService.getUserByUsername(SessionUserDetailsUtil.getLoginUserName());
		//edit current review
		Set<Review> reviews = alg.getReviews();
		for(Review r : reviews) {
			if(r.getUser().getId()==this.getUser_id()) {
				Review review = r;
				review.setStatus(this.result);
				review.setResults(this.comments);
				String fileName = "";
				if(null!=this.review_fileFileName) {
					try {
			        	String filePath = baseDir+"/data/reviewFiles/";
			            File basePath = new File(filePath);
			        	if(!basePath.exists()) {
			        		basePath.mkdirs();
			        	}
			        	fileName = System.currentTimeMillis() +"."+ FileExtension.getExtension(review_fileFileName);
			            File fileToCreate = new File(filePath, fileName);
						FileUtils.copyFile(this.review_file, fileToCreate);
					} catch (IOException e ) {
						e.printStackTrace();
						return INPUT;
					}
				}
				review.setReviewFile(this.review_fileFileName);
				review.setReviewFile_server(fileName);
		        if(this.getIsTester()==null) {
		        	review.setIsTester("No");
		        }else {
		        	review.setIsTester("Yes");
		        }
		        review.setPrice(price);
				reviewService.save(review);
				log.info("User ("+user.getUsername()+") edited the the review of the algorithm is id:"+this.getAlg_id());
			}
		}
		//get all review status and then update the current status of algorithm
		Set<Review> revs = alg.getReviews();
		String currentStatus = "";
		for(Review r : revs) {
			if(r.getStatus().equalsIgnoreCase("Ongoing")) {
				currentStatus = "Ongoing";
				break;
			}else {
				currentStatus = "Done";
			}
		}
		
		alg.setReview_result(currentStatus);
		alg.setCurrent_status("Revirew - "+currentStatus);
		this.getAlgorithmService().save(alg);
		log.info("Current_status of the algorithm whose id is "+this.getAlg_id()+" is Revirew - "+currentStatus);
		this.algorithm = alg;
		return SUCCESS;
	}

	public String review_delete() throws Exception{
		if (!this.isUserLogin())
			return INPUT;
		//get algorithm by ID
		algorithm = this.getAlgorithmService().get(getAlg_id());
		
		Set<Review> algReviews = algorithm.getReviews();
		//get user by username
		User user = this.getUserService().getUserByUsername(username);
		Set<Review> userReviews = user.getReviews();
		//get review by review_id
		Review review =  this.getReviewService().get(review_id);
		algReviews.remove(review); //remove review form algorithm
		userReviews.remove(review); //remove review form user
		algorithm.setReviews(algReviews);
		this.getAlgorithmService().save(algorithm); 
		user.setReviews(userReviews);
		this.getUserService().save(user);
		this.getReviewService().remove(review_id);//remove review from review table
		
		this.reviews = this.getAlgorithmService().getReviewByAlg_Id(getAlg_id()).iterator();
		
		List<User> reviewers = new ArrayList<User>();
		for(Review r : this.getAlgorithmService().getReviewByAlg_Id(getAlg_id())) {
			reviewers.add(r.getUser());
		}
		List<User> users = userService.getAll();
		List<User> users_temp = new ArrayList<User>();;
		for(User u : users) {
			if(reviewers.contains(u)) {
				u.setDisable("true");
			}else {
				u.setDisable("false");
			}
			users_temp.add(u);
		}
		log.info("Admin deleted the review of algorithm "+this.getAlg_id()+", the reviewer is "+username);
		allUsers = users_temp.iterator();
		return SUCCESS;
	}
	
	
	public String review_ongoing() throws Exception {
		if (!this.isUserLogin())
			return INPUT;
		algorithm = this.getAlgorithmService().get(getAlg_id());
		this.reviews = this.getAlgorithmService().getReviewByAlg_Id(getAlg_id()).iterator();
		
		List<User> reviewers = new ArrayList<User>();
		for(Review r : this.getAlgorithmService().getReviewByAlg_Id(getAlg_id())) {
			reviewers.add(r.getUser());
		}
		List<User> users = userService.getAll();
		List<User> users_temp = new ArrayList<User>();;
		for(User u : users) {
			if(reviewers.contains(u)) {
				u.setDisable("true");
			}else {
				u.setDisable("false");
			}
			users_temp.add(u);
		}
		
		allUsers = users_temp.iterator();
		
		return SUCCESS;
	}
	
	public String review_done() throws Exception {
		if (!this.isUserLogin())
			return INPUT;
		algorithm = this.getAlgorithmService().get(getAlg_id());
		this.reviews = this.getAlgorithmService().getReviewByAlg_Id(getAlg_id()).iterator();
//		User user = (User) ActionContext.getContext().getSession().get("user");
		User user = this.userService.getUserByUsername(SessionUserDetailsUtil.getLoginUserName());
		if(user.getAdmin().trim().equalsIgnoreCase("yes")){
			admin = true;
		}else{
			admin = false;
		}
		return SUCCESS;
	}
	
	public String review_done_submit() throws Exception {
		if (!this.isUserLogin())
			return INPUT;
		algorithm = this.getAlgorithmService().get(getAlg_id());
		algorithm.setAdmin_comment(this.adminComment);
		algorithm.setReview_result(adminResult);
		if(adminResult.equalsIgnoreCase("Revise")||adminResult.equalsIgnoreCase("Reject")) {
			algorithm.setCurrent_status(adminResult);
		}else {
			algorithm.setCurrent_status("Review - " + adminResult);
		}
		this.getAlgorithmService().save(algorithm);
		log.info("Admin submited the desision of reviews of algorithm "+this.getAlg_id()+", Current_status is Review - " + adminResult);
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

	public boolean isReview() {
		return review;
	}

	public void setReview(boolean review) {
		this.review = review;
	}

	public ReviewService getReviewService() {
		return reviewService;
	}

	public void setReviewService(ReviewService reviewService) {
		this.reviewService = reviewService;
	}
	
	
	public List<String> getResultList(){
		//resultList.add("Waiting");
		resultList.add("Ongoing");
//		resultList.add("Revise");
//		resultList.add("Accept");
//		resultList.add("Reject");
		resultList.add("Strong Accept");
		resultList.add("Accept");
		resultList.add("Weak Accept");
		resultList.add("Weak Reject");
		resultList.add("Reject");
		resultList.add("Strong Reject");
		
		return resultList;
	}
	
	public List<String> getAdminResultList(){
		resultList.add("Revise");
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

	public File getReview_file() {
		return review_file;
	}

	public void setReview_file(File review_file) {
		this.review_file = review_file;
	}

	public void setResultList(List<String> resultList) {
		this.resultList = resultList;
	}

	public String getReview_fileFileName() {
		return review_fileFileName;
	}

	public void setReview_fileFileName(String review_fileFileName) {
		this.review_fileFileName = review_fileFileName;
	}

	public String getReview_fileContentType() {
		return review_fileContentType;
	}

	public void setReview_fileContentType(String review_fileContentType) {
		this.review_fileContentType = review_fileContentType;
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

	public Iterator<User> getAllUsers() {
		return allUsers;
	}

	public void setAllUsers(Iterator<User> allUsers) {
		this.allUsers = allUsers;
	}

	public List<Long> getReviewers() {
		return reviewers;
	}

	public void setReviewers(List<Long> reviewers) {
		this.reviewers = reviewers;
	}

	public Review getCurrent_review() {
		return current_review;
	}

	public void setCurrent_review(Review current_review) {
		this.current_review = current_review;
	}

	public Iterator<Review> getReviews() {
		return reviews;
	}

	public void setReviews(Iterator<Review> reviews) {
		this.reviews = reviews;
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
	
	public String getIsTester() {
		return isTester;
	}

	public void setIsTester(String isTester) {
		this.isTester = isTester;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public long getReview_id() {
		return review_id;
	}

	public void setReview_id(long review_id) {
		this.review_id = review_id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}
