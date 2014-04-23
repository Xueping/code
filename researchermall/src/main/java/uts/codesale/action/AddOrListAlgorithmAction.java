package uts.codesale.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataIntegrityViolationException;

import uts.codesale.beans.Algorithm;
import uts.codesale.beans.Community;
import uts.codesale.beans.Review;
import uts.codesale.beans.Testing;
import uts.codesale.beans.User;
import uts.codesale.commons.AbstractAction;
import uts.codesale.commons.FileExtension;
import uts.codesale.security.SessionUserDetailsUtil;
import uts.codesale.service.AlgorithmBKPService;
import uts.codesale.service.AlgorithmService;
import uts.codesale.service.CommunityService;
import uts.codesale.service.UserService;

//import com.opensymphony.xwork2.ActionContext;

public class AddOrListAlgorithmAction extends AbstractAction{

	private static final long serialVersionUID = -2128419304989504831L;
	private static Logger log = LoggerFactory.getLogger(AddOrListAlgorithmAction.class);
	private long id;
	private File alg_related_file;
	private File alg_picture_file;
	private String alg_picture_fileFileName;
	private String alg_related_fileFileName;
	private File alg_code_file;
	private String alg_code_fileFileName;
	private Algorithm algorithm = new Algorithm();
	private List<Algorithm> algorithms;
	
	private AlgorithmService algorithmService;
	private CommunityService communityService;
	private List<Community> allComms;
	private AlgorithmBKPService algorithmBKPService;
	private UserService userService;
	private boolean admin;
	private boolean acceptalbe;
	private List<String> resultList = new ArrayList<String>();
	
	private InputStream inputStream;
	private String fileName;
	private String filePath;
	private Long contentLength;
	private String type;
	
	private List<Algorithm> waitingAdminList;
	private List<Algorithm> resubmitList;
	private List<Algorithm> reviewWaitingList;
	private List<Algorithm> testingWaitingList;
	private List<Algorithm> reviewOngoingList;
	private List<Algorithm> testingOngoingList;
	private List<Algorithm> reviewDoneList;
	private List<Algorithm> testingDoneList;
	private List<Algorithm> rejectList;
	private List<Algorithm> publishWaitingList;
	private List<Algorithm> publishedList;
	
	private int length_WaitingAdminList;
	private int length_ResubmitList;
	private int length_ReviewWaitingList;
	private int length_ReviewOngoingList;
	private int length_ReviewDoneList;
	private int length_TestingWaitingList;
	private int length_TestingOngoingList;
	private int length_TestingDoneList;
	private int length_RejectList;
	private int length_PublishWaitingList;
	private int length_PublishedList;
	
	private List<Algorithm> myAllAlgorithms;
	private List<Algorithm> myReviewAlgorithms;
	private List<Algorithm> myTestingAlgorithms;
	
	private String errorMsg;
	private String baseDir ;
	
	private List<Review> reviews;
	private List<Testing> testings;
	
	private User currentUser;

	public Algorithm getAlgorithm() {
		return algorithm;
	}

	public void setAlgorithm(Algorithm algorithm) {
		this.algorithm = algorithm;
	}

	public List<Algorithm> getAlgorithms() {
		return algorithms;
	}

	public void setAlgorithms(List<Algorithm> algorithms) {
		this.algorithms = algorithms;
	}

	public AlgorithmService getAlgorithmService() {
		return algorithmService;
	}

	public void setAlgorithmService(AlgorithmService algorithmService) {
		this.algorithmService = algorithmService;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Override
	public String execute() throws Exception {
		if (!this.isUserLogin())
			return INPUT;
		return super.execute();
	}

	/**
	 * add a new algorithm
	 *
	 */ 
	public String add() {
		
		try {
			if (!this.isUserLogin())
				return "Login";
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		User user = this.userService.getUserByUsername(SessionUserDetailsUtil.getLoginUserName());
		log.info("Username: "+ user.getUsername() + " begins to add a new algorithm.");
		
		String fileName = "";
		String pictName = "";
		String codeName = "";
		
		this.getAlgorithm().setAlg_description(this.getAlgorithm().getAlg_description().replaceAll("[\r\n]", ""));
        try {
        	String filePath = baseDir+"/data/algorithms/";
        	String pictureDir = baseDir+"/data/algorithms/pictures/";
        	String codeDir = baseDir+"/data/algorithms/codes/";
        	
        	//rename of uploaded files!
        	File basePath = new File(filePath);
        	File picturePath = new File(pictureDir);
        	File codePath = new File(codeDir);
        	
        	if(!basePath.exists()) {
        		basePath.mkdirs();
        	}
        	if(!picturePath.exists()) {
        		picturePath.mkdirs();
        	}
        	if(!codePath.exists()) {
        		codePath.mkdirs();
        	}
        	
        	fileName = System.currentTimeMillis() +"."+ FileExtension.getExtension(alg_related_fileFileName);
            File fileToCreate = new File(filePath, fileName);
			FileUtils.copyFile(alg_related_file, fileToCreate);
			
			pictName = System.currentTimeMillis() +"."+ FileExtension.getExtension(alg_picture_fileFileName);
			File pictToCreate = new File(pictureDir, pictName);
			FileUtils.copyFile(alg_picture_file, pictToCreate);
			
			codeName = System.currentTimeMillis() +"."+ FileExtension.getExtension(alg_code_fileFileName);
			File codeToCreate = new File(codeDir, codeName);
			FileUtils.copyFile(alg_code_file, codeToCreate);
			
		} catch (IOException e) {
			
			e.printStackTrace();
			this.errorMsg="Destination directory cannot be created!";
			log.info("Destination directory cannot be created!");
			return INPUT;
		}catch (NullPointerException e) {
			e.printStackTrace();
			this.errorMsg="Please ensure Upload File not empty!";
			log.info(errorMsg);
			return INPUT;
		}
        
        this.getAlgorithm().setAlg_filepath(alg_related_fileFileName);
        this.getAlgorithm().setAlg_picture(alg_picture_fileFileName);
        this.getAlgorithm().setAlg_codepath(alg_code_fileFileName);
        
        this.getAlgorithm().setAlg_filepath_server(fileName);
        this.getAlgorithm().setAlg_picture_server(pictName);
        this.getAlgorithm().setAlg_codepath_server(codeName);
        
        this.getAlgorithm().setPublish("no");
        Set<User> users = new HashSet<User>();
        
        User current_user = this.getUserService().get(user.getId());
        users.add(current_user);
        this.getAlgorithm().setAuthor(user.getUsername());
        this.getAlgorithm().setUsers(users);
        this.getAlgorithm().setCurrent_status("new");
        this.getAlgorithm().setAdmin_result("Waiting");
        this.getAlgorithm().setReview_result("Waiting");
        this.getAlgorithm().setTest_results("Waiting");
        this.getAlgorithm().setAlg_title( this.getAlgorithm().getAlg_name());
        this.getAlgorithm().setAlg_related_algs("NA");
        DateFormat format1 = new java.text.SimpleDateFormat("dd-MM-yyyy");  
        String date = format1.format(new Date());
        this.getAlgorithm().setSubmit_date(date);
        
        if(this.getAlgorithm().getSaleOption()==null) {
        	this.getAlgorithm().setSaleOption("false");
        }
        
        try {
        	this.getAlgorithmService().save(this.getAlgorithm());
        	log.info(user.getUsername() + " add a new algorithm, name: " + getAlgorithm().getAlg_name()+", id: "+ getAlgorithm().getAlg_ID());
        }catch(DataIntegrityViolationException e){
        	e.printStackTrace();
			this.errorMsg="Please ensure you agree with the copyright!";
			log.info(errorMsg);
			return INPUT;
        }
        
        log.info(" Backup an algorithm, name: " + getAlgorithm().getAlg_name()+", id: "+ getAlgorithm().getAlg_ID());
        this.getAlgorithmBKPService().save(EditOrDeleteAlgorithmAction.transtoAlgorithmBKP(this.getAlgorithm()));
		return SUCCESS;
	}
	
	public String dispatcher() throws Exception {
		if (!this.isUserLogin())
			return INPUT;
		List<String> roles =  SessionUserDetailsUtil.getUserRoles();
		if(roles.size()==1) {
			if(roles.contains("ROLE_ADMIN")) {
				return admin();
			}
			else if(roles.contains("ROLE_COMM_ADMIN")) {
				return community_admin();
			}
			else if(roles.contains("ROLE_USER")) {
				return common_user();
			}
			else{
				return publisher();
			}
		}else {
			return common_user_publisher();
		}
	}
	
	public String admin() throws Exception {
		if (!this.isUserLogin())
			return INPUT;
		
		this.setAlgorithms(algorithmService.getAll());
		waitingAdminList = algorithmService.getWaitingAdminAlgorithms();
		reviewWaitingList = algorithmService.getReviewAlgorithms("Waiting");
		testingWaitingList = algorithmService.getTestingAlgorithms("Waiting");
		reviewOngoingList = algorithmService.getReviewAlgorithms("Ongoing");
		testingOngoingList = algorithmService.getTestingAlgorithms("Ongoing");
		reviewDoneList = algorithmService.getReviewAlgorithms("Done");
		testingDoneList = algorithmService.getTestingAlgorithms("Done");
		resubmitList = algorithmService.getWaitingResubmitAlgorithms();
		publishWaitingList = algorithmService.getPublishAlgorithms("no");
		publishedList = algorithmService.getPublishAlgorithms("yes");
		rejectList = algorithmService.getRejectAlgorithms();
		
		this.length_WaitingAdminList = waitingAdminList.size();
		this.length_ResubmitList = resubmitList.size();
		
		this.length_ReviewWaitingList = reviewWaitingList.size();
		this.length_ReviewOngoingList = reviewOngoingList.size();
		this.length_ReviewDoneList = reviewDoneList.size();
		this.length_TestingWaitingList = testingWaitingList.size();
		this.length_TestingOngoingList = testingOngoingList.size();
		this.length_TestingDoneList = testingDoneList.size();
		this.length_PublishWaitingList = publishWaitingList.size();
		this.length_PublishedList = publishedList.size();
		this.length_RejectList = rejectList.size();
		
		return "admin";
	}
	
	public String community_admin() throws Exception {
		if (!this.isUserLogin())
			return INPUT;
		User user  = this.userService.getUserByUsername(SessionUserDetailsUtil.getLoginUserName());
		Set<Community> coms = user.getCommunities_admin();
		long comm_id = 0;
		for(Community com : coms) {
			comm_id = com.getId();
		}
		this.setAlgorithms(algorithmService.getAlgorithmsByCommunity(comm_id));
		reviewWaitingList = algorithmService.getReviewAlgorithms("Waiting",comm_id);
		testingWaitingList = algorithmService.getTestingAlgorithms("Waiting",comm_id);
		reviewOngoingList = algorithmService.getReviewAlgorithms("Ongoing",comm_id);
		testingOngoingList = algorithmService.getTestingAlgorithms("Ongoing",comm_id);
		reviewDoneList = algorithmService.getReviewAlgorithms("Done",comm_id);
		testingDoneList = algorithmService.getTestingAlgorithms("Done",comm_id);
		publishWaitingList = algorithmService.getPublishAlgorithms("no",comm_id);
		publishedList = algorithmService.getPublishAlgorithms("yes",comm_id);
		rejectList = algorithmService.getRejectAlgorithms(comm_id);
		
		this.length_ReviewWaitingList = reviewWaitingList.size();
		this.length_ReviewOngoingList = reviewOngoingList.size();
		this.length_ReviewDoneList = reviewDoneList.size();
		this.length_TestingWaitingList = testingWaitingList.size();
		this.length_TestingOngoingList = testingOngoingList.size();
		this.length_TestingDoneList = testingDoneList.size();
		this.length_PublishWaitingList = publishWaitingList.size();
		this.length_PublishedList = publishedList.size();
		this.length_RejectList = rejectList.size();
		
		return "commAdmin";
	}
	
	public String common_user() throws Exception {
		if (!this.isUserLogin())
			return INPUT;
		
		User user  = this.userService.getUserByUsername(SessionUserDetailsUtil.getLoginUserName());
		
		this.myAllAlgorithms = userService.getAlgorithmsByUserID(user.getId());
		this.myReviewAlgorithms = userService.getReviewAlgorithmsByUserID(user.getId());
		this.myTestingAlgorithms = userService.getTestingAlgorithmsByUserID(user.getId());
		currentUser = user;
		return "user";
	}
	
	public String publisher() throws Exception {
		if (!this.isUserLogin())
			return INPUT;
		return INPUT;
	}
	
	public String common_user_publisher() throws Exception {
		if (!this.isUserLogin())
			return INPUT;
		return INPUT;
	}

	/**
	 * dashboard shows various function depending on user's role
	 */ 
	public String listAll() throws Exception {
		if (!this.isUserLogin())
			return INPUT;
		
		User user  = this.userService.getUserByUsername(SessionUserDetailsUtil.getLoginUserName());
		
		this.myAllAlgorithms = userService.getAlgorithmsByUserID(user.getId());
		this.myReviewAlgorithms = userService.getReviewAlgorithmsByUserID(user.getId());
		this.myTestingAlgorithms = userService.getTestingAlgorithmsByUserID(user.getId());
		
		this.setAlgorithms(algorithmService.getAll());
		waitingAdminList = algorithmService.getWaitingAdminAlgorithms();
		reviewWaitingList = algorithmService.getReviewAlgorithms("Waiting");
		testingWaitingList = algorithmService.getTestingAlgorithms("Waiting");
		reviewOngoingList = algorithmService.getReviewAlgorithms("Ongoing");
		testingOngoingList = algorithmService.getTestingAlgorithms("Ongoing");
		reviewDoneList = algorithmService.getReviewAlgorithms("Done");
		testingDoneList = algorithmService.getTestingAlgorithms("Done");
		resubmitList = algorithmService.getWaitingResubmitAlgorithms();
		publishWaitingList = algorithmService.getPublishAlgorithms("no");
		publishedList = algorithmService.getPublishAlgorithms("yes");
		rejectList = algorithmService.getRejectAlgorithms();
		
		this.length_WaitingAdminList = algorithmService.getWaitingAdminAlgorithms().size();
		this.length_ResubmitList = this.getAlgorithmService().getWaitingResubmitAlgorithms().size();
		this.length_ReviewWaitingList = algorithmService.getReviewAlgorithms("Waiting").size();
		this.length_ReviewOngoingList = algorithmService.getReviewAlgorithms("Ongoing").size();
		this.length_ReviewDoneList = algorithmService.getReviewAlgorithms("Done").size();
		this.length_TestingWaitingList = algorithmService.getTestingAlgorithms("Waiting").size();
		this.length_TestingOngoingList = algorithmService.getTestingAlgorithms("Ongoing").size();
		this.length_TestingDoneList = algorithmService.getTestingAlgorithms("Done").size();
		this.length_PublishWaitingList = algorithmService.getPublishAlgorithms("no").size();
		this.length_PublishedList = algorithmService.getPublishAlgorithms("yes").size();
		this.length_RejectList = algorithmService.getRejectAlgorithms().size();
		
		currentUser = user;
		
		if(user.getAdmin().trim().equalsIgnoreCase("yes")){
			admin = true;
		}else{
			admin = false;
		}
		
		return SUCCESS;
	}

	/**
	 * Display an algorithm based on its Id.
	 */
	public String displayAlgorithm() throws Exception {
		if (!this.isUserLogin())
			return INPUT;
		User user = this.userService.getUserByUsername(SessionUserDetailsUtil.getLoginUserName());
		if(user.getAdmin().trim().equalsIgnoreCase("yes")){
			admin = true;
		}else{
			admin = false;
		}
		algorithm = this.getAlgorithmService().get(getId());
		reviews = this.getAlgorithmService().getReviewByAlg_Id(getId());
		testings = this.getAlgorithmService().getTestingByAlg_Id(getId());
		allComms = this.communityService.getAll();
		if(algorithm.getAdmin_result().equalsIgnoreCase("Accept")){
			acceptalbe = true;
		}else{
			acceptalbe = false;
		}
		log.info("Username:"+user.getUsername() + " browsed the algorithm of ID ("+getId()+").");
		return SUCCESS;
	}
	
	/**
	 * Download file
	 * @return String
	 */
	public String executeFile() {
	
	   try {
		   if (!this.isUserLogin())
					return INPUT;
		} catch (Exception e) {
			return INPUT;
		}
	   User user = this.userService.getUserByUsername(SessionUserDetailsUtil.getLoginUserName());
	   String finalFile = null;
	   if(this.type.equalsIgnoreCase("alg")) {
		   finalFile = baseDir+"/data/algorithms/"+filePath; 
	   }else if(this.type.equalsIgnoreCase("rev")) {
		   finalFile = baseDir+"/data/reviewFiles/"+filePath; 
	   }
	   else if(this.type.equalsIgnoreCase("pict")) {
		   finalFile = baseDir+"/data/algorithms/pictures/"+filePath; 
	   }
	   else if(this.type.equalsIgnoreCase("code")) {
		   finalFile = baseDir+"/data/algorithms/codes/"+filePath; 
	   }else {
		   finalFile = baseDir+"/data/testFiles/"+filePath; 
	   }
       
       File fileToDownload = new File(finalFile);     
       try {
    	   inputStream = new FileInputStream(fileToDownload);
       } catch (FileNotFoundException e) {
		
			e.printStackTrace();
			errorMsg = " The resource can not be download.<p/>Please connect the Administrator!";
			log.info("Username:"+user.getUsername() + errorMsg);
			return "noFile";
       }
       fileName = fileToDownload.getName();
       contentLength = fileToDownload.length();
       
       log.info("Username:"+user.getUsername() + " downloaded the algorithm whose path is "+finalFile);
       return SUCCESS;
	}	
	
	public List<String> getResultList(){
		//resultList.add("Waiting");
		resultList.add("Ongoing");
		resultList.add("Revise");
		resultList.add("Accept");
		resultList.add("Reject");
		return resultList;
	}

	public File getAlg_related_file() {
		return alg_related_file;
	}

	public void setAlg_related_file(File alg_related_file) {
		this.alg_related_file = alg_related_file;
	}

	public String getAlg_related_fileFileName() {
		return alg_related_fileFileName;
	}

	public void setAlg_related_fileFileName(String alg_related_fileFileName) {
		this.alg_related_fileFileName = alg_related_fileFileName;
	}

	public InputStream getInputStream() {
		return inputStream;
	}

	public void setInputStream(InputStream inputStream) {
		this.inputStream = inputStream;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public Long getContentLength() {
		return contentLength;
	}

	public void setContentLength(Long contentLength) {
		this.contentLength = contentLength;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public boolean isAdmin() {
		return admin;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
	}

	public boolean isAcceptalbe() {
		return acceptalbe;
	}

	public void setAcceptalbe(boolean acceptalbe) {
		this.acceptalbe = acceptalbe;
	}

	public List<Algorithm> getWaitingAdminList() {
		return waitingAdminList;
	}

	public void setWaitingAdminList(List<Algorithm> waitingAdminList) {
		this.waitingAdminList = waitingAdminList;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getLength_WaitingAdminList() {
		return length_WaitingAdminList;
	}

	public void setLength_WaitingAdminList(int length_WaitingAdminList) {
		this.length_WaitingAdminList = length_WaitingAdminList;
	}

	public List<Algorithm> getMyAllAlgorithms() {
		return myAllAlgorithms;
	}

	public void setMyAllAlgorithms(List<Algorithm> myAllAlgorithms) {
		this.myAllAlgorithms = myAllAlgorithms;
	}

	public List<Algorithm> getMyReviewAlgorithms() {
		return myReviewAlgorithms;
	}

	public void setMyReviewAlgorithms(List<Algorithm> myReviewAlgorithms) {
		this.myReviewAlgorithms = myReviewAlgorithms;
	}

	public List<Algorithm> getMyTestingAlgorithms() {
		return myTestingAlgorithms;
	}

	public void setMyTestingAlgorithms(List<Algorithm> myTestingAlgorithms) {
		this.myTestingAlgorithms = myTestingAlgorithms;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public String getBaseDir() {
		return baseDir;
	}

	public void setBaseDir(String baseDir) {
		this.baseDir = baseDir;
	}

	public File getAlg_picture_file() {
		return alg_picture_file;
	}

	public void setAlg_picture_file(File alg_picture_file) {
		this.alg_picture_file = alg_picture_file;
	}

	public String getAlg_picture_fileFileName() {
		return alg_picture_fileFileName;
	}

	public void setAlg_picture_fileFileName(String alg_picture_fileFileName) {
		this.alg_picture_fileFileName = alg_picture_fileFileName;
	}

	public File getAlg_code_file() {
		return alg_code_file;
	}

	public void setAlg_code_file(File alg_code_file) {
		this.alg_code_file = alg_code_file;
	}

	public String getAlg_code_fileFileName() {
		return alg_code_fileFileName;
	}

	public void setAlg_code_fileFileName(String alg_code_fileFileName) {
		this.alg_code_fileFileName = alg_code_fileFileName;
	}

	public AlgorithmBKPService getAlgorithmBKPService() {
		return algorithmBKPService;
	}

	public void setAlgorithmBKPService(AlgorithmBKPService algorithmBKPService) {
		this.algorithmBKPService = algorithmBKPService;
	}

	public List<Algorithm> getResubmitList() {
		return resubmitList;
	}

	public void setResubmitList(List<Algorithm> resubmitList) {
		this.resubmitList = resubmitList;
	}

	public int getLength_ResubmitList() {
		return length_ResubmitList;
	}

	public void setLength_ResubmitList(int length_ResubmitList) {
		this.length_ResubmitList = length_ResubmitList;
	}

	public List<Algorithm> getReviewWaitingList() {
		return reviewWaitingList;
	}

	public void setReviewWaitingList(List<Algorithm> reviewWaitingList) {
		this.reviewWaitingList = reviewWaitingList;
	}

	public List<Algorithm> getTestingWaitingList() {
		return testingWaitingList;
	}

	public void setTestingWaitingList(List<Algorithm> testingWaitingList) {
		this.testingWaitingList = testingWaitingList;
	}

	public List<Algorithm> getReviewOngoingList() {
		return reviewOngoingList;
	}

	public void setReviewOngoingList(List<Algorithm> reviewOngoingList) {
		this.reviewOngoingList = reviewOngoingList;
	}

	public List<Algorithm> getTestingOngoingList() {
		return testingOngoingList;
	}

	public void setTestingOngoingList(List<Algorithm> testingOngoingList) {
		this.testingOngoingList = testingOngoingList;
	}

	public List<Algorithm> getReviewDoneList() {
		return reviewDoneList;
	}

	public void setReviewDoneList(List<Algorithm> reviewDoneList) {
		this.reviewDoneList = reviewDoneList;
	}

	public List<Algorithm> getTestingDoneList() {
		return testingDoneList;
	}

	public void setTestingDoneList(List<Algorithm> testingDoneList) {
		this.testingDoneList = testingDoneList;
	}

	public List<Review> getReviews() {
		return reviews;
	}

	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}

	public int getLength_ReviewWaitingList() {
		return length_ReviewWaitingList;
	}

	public void setLength_ReviewWaitingList(int length_ReviewWaitingList) {
		this.length_ReviewWaitingList = length_ReviewWaitingList;
	}

	public int getLength_ReviewOngoingList() {
		return length_ReviewOngoingList;
	}

	public void setLength_ReviewOngoingList(int length_ReviewOngoingList) {
		this.length_ReviewOngoingList = length_ReviewOngoingList;
	}

	public int getLength_ReviewDoneList() {
		return length_ReviewDoneList;
	}

	public void setLength_ReviewDoneList(int length_ReviewDoneList) {
		this.length_ReviewDoneList = length_ReviewDoneList;
	}

	public int getLength_TestingWaitingList() {
		return length_TestingWaitingList;
	}

	public void setLength_TestingWaitingList(int length_TestingWaitingList) {
		this.length_TestingWaitingList = length_TestingWaitingList;
	}

	public int getLength_TestingOngoingList() {
		return length_TestingOngoingList;
	}

	public void setLength_TestingOngoingList(int length_TestingOngoingList) {
		this.length_TestingOngoingList = length_TestingOngoingList;
	}

	public int getLength_TestingDoneList() {
		return length_TestingDoneList;
	}

	public void setLength_TestingDoneList(int length_TestingDoneList) {
		this.length_TestingDoneList = length_TestingDoneList;
	}

	public List<Testing> getTestings() {
		return testings;
	}

	public void setTestings(List<Testing> testings) {
		this.testings = testings;
	}

	public List<Algorithm> getRejectList() {
		return rejectList;
	}

	public void setRejectList(List<Algorithm> rejectList) {
		this.rejectList = rejectList;
	}

	public List<Algorithm> getPublishWaitingList() {
		return publishWaitingList;
	}

	public void setPublishWaitingList(List<Algorithm> publishWaitingList) {
		this.publishWaitingList = publishWaitingList;
	}

	public int getLength_RejectList() {
		return length_RejectList;
	}

	public void setLength_RejectList(int length_RejectList) {
		this.length_RejectList = length_RejectList;
	}

	public int getLength_PublishWaitingList() {
		return length_PublishWaitingList;
	}

	public void setLength_PublishWaitingList(int length_PublishWaitingList) {
		this.length_PublishWaitingList = length_PublishWaitingList;
	}

	public User getCurrentUser() {
		return currentUser;
	}

	public void setCurrentUser(User currentUser) {
		this.currentUser = currentUser;
	}

	public List<Algorithm> getPublishedList() {
		return publishedList;
	}

	public void setPublishedList(List<Algorithm> publishedList) {
		this.publishedList = publishedList;
	}

	public int getLength_PublishedList() {
		return length_PublishedList;
	}

	public void setLength_PublishedList(int length_PublishedList) {
		this.length_PublishedList = length_PublishedList;
	}

	public CommunityService getCommunityService() {
		return communityService;
	}

	public void setCommunityService(CommunityService communityService) {
		this.communityService = communityService;
	}

	public List<Community> getAllComms() {
		return allComms;
	}

	public void setAllComms(List<Community> allComms) {
		this.allComms = allComms;
	}

}
