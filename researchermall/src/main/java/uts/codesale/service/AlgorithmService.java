package uts.codesale.service;

import java.util.List;
import java.util.Set;

import uts.codesale.beans.AlgorithmTest;
import uts.codesale.beans.Review;
import uts.codesale.beans.Testing;
import uts.codesale.beans.User;
import uts.codesale.commons.IGenericService;
import uts.codesale.exception.NotFoundException;

public interface AlgorithmService extends IGenericService<AlgorithmTest, Long> {

	public List<AlgorithmTest> getAlgorithmByUser(Set<User> users) throws NotFoundException;

	public AlgorithmTest getAlgorithmByName(String title) throws NotFoundException;

	public boolean isAlgorithmExists(String title);

	public List<AlgorithmTest> getAllAlgorithms();
	
	public List<AlgorithmTest> getWaitingAdminAlgorithms();
	public List<AlgorithmTest> getWaitingResubmitAlgorithms();
	public List<AlgorithmTest> getPublishAlgorithms(String published);
	public List<AlgorithmTest> getRejectAlgorithms();
	
	public List<AlgorithmTest> getReviewAlgorithms(String status);
	public List<AlgorithmTest> getTestingAlgorithms(String status);
	
	public List<Review> getReviewByAlg_Id(Long alg_id);
	public List<Testing> getTestingByAlg_Id(Long alg_id);
	
	public List<AlgorithmTest> getAlgorithmsByCommunity(Long comm_id);
	public List<AlgorithmTest> getPublishAlgorithms(String published,Long comm_id);
	public List<AlgorithmTest> getRejectAlgorithms(Long comm_id);
	public List<AlgorithmTest> getReviewAlgorithms(String status,Long comm_id);
	public List<AlgorithmTest> getTestingAlgorithms(String status,Long comm_id);

}
