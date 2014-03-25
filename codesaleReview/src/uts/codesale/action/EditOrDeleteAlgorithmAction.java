package uts.codesale.action;

import java.io.File;
import java.text.DateFormat;
import java.util.Date;
import java.util.Iterator;

import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.opensymphony.xwork2.ActionContext;

import uts.codesale.beans.Algorithm;
import uts.codesale.beans.AlgorithmBKP;
import uts.codesale.beans.User;
import uts.codesale.commons.AbstractAction;
import uts.codesale.commons.FileExtension;
import uts.codesale.service.AlgorithmBKPService;
import uts.codesale.service.AlgorithmService;

public class EditOrDeleteAlgorithmAction extends AbstractAction {

	private static final long serialVersionUID = 3573358554837259584L;
	private static Logger log = LoggerFactory.getLogger(EditOrDeleteAlgorithmAction.class);
	private Long alg_id;
	private String adminResult;
	private String adminComment;
	private Algorithm algorithm = new Algorithm();
	private Iterator<Algorithm> algorithms;
	private AlgorithmService algorithmService;
	private AlgorithmBKPService algorithmBKPService;
	
	private File alg_related_file;
	private File alg_picture_file;
	private String alg_picture_fileFileName;
	private String alg_related_fileFileName;
	private File alg_code_file;
	private String alg_code_fileFileName;
	private String errorMsg;

	private String baseDir;
	
	
	
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

	

	public Algorithm getAlgorithm() {
		return algorithm;
	}

	public void setAlgorithm(Algorithm algorithm) {
		this.algorithm = algorithm;
	}

	public Iterator<Algorithm> getAlgorithms() {
		return algorithms;
	}

	public void setAlgorithms(Iterator<Algorithm> algorithms) {
		this.algorithms = algorithms;
	}

	public AlgorithmService getAlgorithmService() {
		return algorithmService;
	}

	public void setAlgorithmService(AlgorithmService algorithmService) {
		this.algorithmService = algorithmService;
	}


	public Long getAlg_id() {
		return alg_id;
	}

	public void setAlg_id(Long alg_id) {
		this.alg_id = alg_id;
	}

	public String getAdminResult() {
		return adminResult;
	}

	public void setAdminResult(String adminResult) {
		this.adminResult = adminResult;
	}

	@Override
	public String execute() throws Exception {
		if (!this.isUserLogin())
			return "Login";
		this.algorithm = this.getAlgorithmService().get(this.getAlg_id());
		return super.execute();
	}
	
	public String edit() throws Exception {
		if (!this.isUserLogin())
			return "Login";
		this.algorithm = this.getAlgorithmService().get(this.getAlg_id());
		if(this.algorithm.getCurrent_status().equalsIgnoreCase("new")||this.algorithm.getCurrent_status().equalsIgnoreCase("Revise")) {
			return super.execute();
		}else {
			errorMsg = "You can not update this algorithm because it is ongoing!";
			return INPUT;
		}
			
		
	}
	
	public String edit_submit() throws Exception {
		if (!this.isUserLogin())
			return "Login";
		User user = (User) ActionContext.getContext().getSession().get("user");
		log.info("Username: "+user.getUsername()+" begin to edit the algorithm of id "+this.getAlgorithm().getAlg_ID());
		this.getAlgorithm().setAlg_description(this.getAlgorithm().getAlg_description().replaceAll("[\r\n]", ""));
		
		if(alg_related_file!=null) {
			String filePath = baseDir+"/data/algorithms/";
			String fileName = System.currentTimeMillis() +"."+ FileExtension.getExtension(alg_related_fileFileName);
        	File fileToCreate = new File(filePath, fileName);
 			FileUtils.copyFile(alg_related_file, fileToCreate);
			this.getAlgorithm().setAlg_filepath(alg_related_fileFileName);
			this.getAlgorithm().setAlg_filepath_server(fileName);
		}
        	
		if(alg_picture_file!=null) {
			String pictureDir = baseDir+"/data/algorithms/pictures/";
			String pictName = System.currentTimeMillis() +"."+ FileExtension.getExtension(alg_picture_fileFileName);
			File pictToCreate = new File(pictureDir, pictName);
			FileUtils.copyFile(alg_picture_file, pictToCreate);
			this.getAlgorithm().setAlg_picture(alg_picture_fileFileName);
			this.getAlgorithm().setAlg_picture_server(pictName);
		}
		
		if(alg_code_file!=null) {
			String codeDir = baseDir+"/data/algorithms/codes/";
			String codeName = System.currentTimeMillis() +"."+ FileExtension.getExtension(alg_code_fileFileName);
			File codeToCreate = new File(codeDir, codeName);
			FileUtils.copyFile(alg_code_file, codeToCreate);
			this.getAlgorithm().setAlg_codepath(alg_code_fileFileName);
			this.getAlgorithm().setAlg_codepath_server(codeName);
		}
		
		this.getAlgorithm().setResubmit("true");
		DateFormat format1 = new java.text.SimpleDateFormat("dd-MM-yyyy");  
	    String date = format1.format(new Date());
	    this.getAlgorithm().setResubmit_date(date);
	   
	    this.getAlgorithm().setCurrent_status("new");
        this.getAlgorithm().setAdmin_result("Waiting");
        this.getAlgorithm().setReview_result("Waiting");
	    
		this.getAlgorithmService().save(this.getAlgorithm());
		log.info("Username: "+user.getUsername()+" edited the algorithm of id "+this.getAlgorithm().getAlg_ID());
		this.getAlgorithmBKPService().save(transtoAlgorithmBKP(this.getAlgorithmService().get(this.getAlg_id())));
		log.info("Backed up the algorithm of id "+this.getAlgorithm().getAlg_ID());
		return super.execute();
	}

	public String editAdminResult() throws Exception {
		if (!this.isUserLogin())
			return "Login";
		User user = (User) ActionContext.getContext().getSession().get("user");
		this.algorithm = this.getAlgorithmService().get(this.getAlg_id());
		this.algorithm.setAdmin_result(adminResult);
		this.algorithm.setAdmin_comment(adminComment);
		if(adminResult.equalsIgnoreCase("revise")) {
			this.algorithm.setCurrent_status(adminResult);
		}else {
			this.algorithm.setCurrent_status("Admin - "+adminResult);
		}
		this.getAlgorithmService().save(this.algorithm);
		log.info("Username: "+user.getUsername()+" edited the AdminResult of the algorithm of id "+this.getAlgorithm().getAlg_ID()+", and the result is Admin - "+adminResult);
		return SUCCESS;
	}
	
	public String publish() throws Exception {
		if (!this.isUserLogin())
			return "Login";
		User user = (User) ActionContext.getContext().getSession().get("user");
		this.algorithm = this.getAlgorithmService().get(this.getAlg_id());
		this.algorithm.setPublish("yes");
		this.algorithmService.save(algorithm);
		log.info("Username: "+user.getUsername()+" published  the algorithm of id "+this.getAlgorithm().getAlg_ID()+".");
		return SUCCESS;
	}

	public String delete() throws Exception {

		this.getAlgorithmService().remove(this.getAlg_id());
		return SUCCESS;
	}

	public File getAlg_related_file() {
		return alg_related_file;
	}

	public void setAlg_related_file(File alg_related_file) {
		this.alg_related_file = alg_related_file;
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

	public String getAlg_related_fileFileName() {
		return alg_related_fileFileName;
	}

	public void setAlg_related_fileFileName(String alg_related_fileFileName) {
		this.alg_related_fileFileName = alg_related_fileFileName;
	}

	public String getBaseDir() {
		return baseDir;
	}

	public void setBaseDir(String baseDir) {
		this.baseDir = baseDir;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public String getAdminComment() {
		return adminComment;
	}

	public void setAdminComment(String adminComment) {
		this.adminComment = adminComment;
	}

	public AlgorithmBKPService getAlgorithmBKPService() {
		return algorithmBKPService;
	}

	public void setAlgorithmBKPService(AlgorithmBKPService algorithmBKPService) {
		this.algorithmBKPService = algorithmBKPService;
	}

	public static AlgorithmBKP transtoAlgorithmBKP(Algorithm alg) {
		AlgorithmBKP alg_bkp = new AlgorithmBKP();
		alg_bkp.setAlg_ID(alg.getAlg_ID());
		alg_bkp.setAlg_name(alg.getAlg_name());
		alg_bkp.setAlg_category(alg.getAlg_category());
		alg_bkp.setAlg_tags(alg.getAlg_tags());
		alg_bkp.setAlg_title(alg.getAlg_title());
		alg_bkp.setAlg_description(alg.getAlg_description());
		alg_bkp.setAlg_related_papers(alg.getAlg_related_papers());
		alg_bkp.setAlg_related_algs(alg.getAlg_related_algs());
		alg_bkp.setAlg_filepath(alg.getAlg_filepath());
		alg_bkp.setAlg_codepath(alg.getAlg_codepath());
		alg_bkp.setAuthor(alg.getAuthor());
		alg_bkp.setAlg_picture(alg.getAlg_picture());
		alg_bkp.setAlg_price(alg.getAlg_price());
		alg_bkp.setCopyright(alg.getCopyright());
		alg_bkp.setPublish(alg.getPublish());
		alg_bkp.setSaleOption(alg.getSaleOption());
		alg_bkp.setResubmit(alg.getResubmit());
		alg_bkp.setResubmit_date(alg.getResubmit_date());
		alg_bkp.setSubmit_date(alg.getSubmit_date());
		alg_bkp.setCurrent_status(alg.getCurrent_status());
		alg_bkp.setReview_result(alg.getReview_result());
		alg_bkp.setTest_results(alg.getTest_results());
		alg_bkp.setAdmin_result(alg.getAdmin_result());
		alg_bkp.setAdmin_comment(alg.getAdmin_comment());
		
		alg_bkp.setAuthor_comment(alg.getAuthor_comment());
		alg_bkp.setAlg_picture_server(alg.getAlg_picture_server());
		alg_bkp.setAlg_codepath_server(alg.getAlg_codepath_server());
		alg_bkp.setAlg_filepath_server(alg.getAlg_filepath_server());
		
		
		DateFormat format1 = new java.text.SimpleDateFormat("dd-MM-yyyy");  
	    String date = format1.format(new Date());
	    alg_bkp.setBackup_date(date);
		return alg_bkp;
		
	}
}
