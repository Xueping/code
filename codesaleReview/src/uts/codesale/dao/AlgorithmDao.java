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
	
	/**
	 * get all community (comm_id) algorithms
	 * @param comm_id
	 * @return List<Algorithm>
	 */
	public List<Algorithm> loadAlgorithmsByCommunity(Long comm_id);

	
	/**
	 * get an algorithm with the name of it
	 * @param name
	 * @return Algorithm
	 * @throws NotFoundException
	 */
	public Algorithm loadAlgorithmByName(String name) throws NotFoundException;
	
	
	/**
	 * Get all algorithms of given user
	 * @param users
	 * @return List<Algorithm>
	 * @throws NotFoundException
	 */
	public List<Algorithm> loadAlgorithmByUser(Set<User> users) throws NotFoundException;

	/**
	 * Check if the algorithm exists based on given name
	 * @param name
	 * @return boolean
	 */
	public boolean isAlgorithmExists(String name);

	
	/**
	 * get all algorithms which are waiting for approval of admin
	 * @return List<Algorithm>
	 */
	public List<Algorithm> loadWaitingAdminAlgorithms();
	
	
	/**
	 * get all algorithms which are revised by author and resubmitted
	 * @return List<Algorithm>
	 */
	public List<Algorithm> loadResubmitAlgorithms();
	
	/**
	 * get all algorithms which are labeled published or not
	 * @param published whose value is "yes" or "no"
	 * @return List<Algorithm>
	 */
	public List<Algorithm> loadPublishAlgorithms(String published);
	
	/**
	 * get all algorithms which are labeled published or not,  <p> and another condition is that the algorithms are belonged to given Community (comm_id).
	 * @param published whose value is "yes" or "no"
	 * @param comm_id
	 * @return List<Algorithm>
	 */
	public List<Algorithm> loadPublishAlgorithms(String published,Long comm_id);
	
	/**
	 * get all rejected algorithms
	 * @return List<Algorithm>
	 */
	public List<Algorithm> loadRejectAlgorithms();
	
	
	/**
	 * get all rejected algorithms which are belonged to given community (comm_id)
	 * @param comm_id
	 * @return List<Algorithm>
	 */
	public List<Algorithm> loadRejectAlgorithms(Long comm_id);
	
	/**
	 * Get all review algorithms based on its status
	 * @param status the value are waiting,ongoing,and done
	 * @return List<Algorithm>
	 */
	public List<Algorithm> loadReviewAlgorithms(String status);
	
	/** Get all review algorithms based on its status, <p> and belonged to given community (comm_id)
	 * @param status whose values are waiting,ongoing,and done
	 * @param comm_id 
	 * @return List<Algorithm>
	 */
	public List<Algorithm> loadReviewAlgorithms(String status,Long comm_id);
	
	/**
	 * Get all test algorithms based on its status
	 * @param status whose values are waiting,ongoing,and done
	 * @return List<Algorithm>
	 */
	public List<Algorithm> loadTestingAlgorithms(String status);
	
	/**
	 *  Get all test algorithms based on its status, <p> and belonged to given community (comm_id)
	 * @param status whose values are waiting,ongoing,and done
	 * @param comm_id
	 * @return
	 */
	public List<Algorithm> loadTestingAlgorithms(String status,Long comm_id);
	
	/** Get the algorithm's reviews by given algorithm's ID
	 * @param alg_id
	 * @return Set<Review>
	 */
	public Set<Review> loadReviewByAlg_Id(Long alg_id);
	
	/**Get the algorithm's tests by given algorithm's ID
	 * @param alg_id
	 * @return Set<Testing>
	 */
	public Set<Testing> loadTestingByAlg_Id(Long alg_id);

}
