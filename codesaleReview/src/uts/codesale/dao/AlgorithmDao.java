package uts.codesale.dao;

import java.util.List;
import java.util.Set;

import uts.codesale.beans.Algorithm;
import uts.codesale.beans.Review;
import uts.codesale.beans.Testing;
import uts.codesale.beans.User;
import uts.codesale.commons.IGenericDao;
import uts.codesale.exception.NotFoundException;

public interface AlgorithmDao extends IGenericDao<Algorithm, Long> {

	public Algorithm loadAlgorithmByName(String name) throws NotFoundException;
	
	public List<Algorithm> loadAlgorithmByUser(Set<User> users) throws NotFoundException;

	public boolean isAlgorithmExists(String name);

	public List<Algorithm> loadAlgorithmsByFuzzyName(String fuzzyName)throws NotFoundException;
	
	public List<Algorithm> loadWaitingAdminAlgorithms();
	public List<Algorithm> loadResubmitAlgorithms();
	public List<Algorithm> loadPublishAlgorithms(String published);
	public List<Algorithm> loadRejectAlgorithms();
	
	public List<Algorithm> loadReviewAlgorithms(String status);
	public List<Algorithm> loadTestingAlgorithms(String status);
	
	public Set<Review> loadReviewByAlg_Id(Long alg_id);
	public Set<Testing> loadTestingByAlg_Id(Long alg_id);

}
