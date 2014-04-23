package uts.codesale.service;

import java.util.List;
import java.util.Set;

import uts.codesale.beans.Algorithm;
import uts.codesale.beans.Review;
import uts.codesale.beans.Testing;
import uts.codesale.beans.User;
import uts.codesale.commons.IGenericService;
import uts.codesale.exception.NotFoundException;

public interface AlgorithmService extends IGenericService<Algorithm, Long> {

	public List<Algorithm> getAlgorithmByUser(Set<User> users) throws NotFoundException;

	public Algorithm getAlgorithmByName(String title) throws NotFoundException;

	public boolean isAlgorithmExists(String title);

	public List<Algorithm> getAllAlgorithms();
	
	public List<Algorithm> getWaitingAdminAlgorithms();
	public List<Algorithm> getWaitingResubmitAlgorithms();
	public List<Algorithm> getPublishAlgorithms(String published);
	public List<Algorithm> getRejectAlgorithms();
	
	public List<Algorithm> getReviewAlgorithms(String status);
	public List<Algorithm> getTestingAlgorithms(String status);
	
	public List<Review> getReviewByAlg_Id(Long alg_id);
	public List<Testing> getTestingByAlg_Id(Long alg_id);
	
	public List<Algorithm> getAlgorithmsByCommunity(Long comm_id);
	public List<Algorithm> getPublishAlgorithms(String published,Long comm_id);
	public List<Algorithm> getRejectAlgorithms(Long comm_id);
	public List<Algorithm> getReviewAlgorithms(String status,Long comm_id);
	public List<Algorithm> getTestingAlgorithms(String status,Long comm_id);

}
