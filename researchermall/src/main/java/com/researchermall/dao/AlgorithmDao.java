package com.researchermall.dao;

import java.util.List;

import com.researchermall.bean.jpa.AlgorithmEntity;
import com.researchermall.commons.IGenericDao;
import com.researchermall.exception.NotFoundException;


public interface AlgorithmDao extends IGenericDao<AlgorithmEntity, Integer> {
	
	/**
	 * get all community (comm_id) algorithms
	 * @param comm_id
	 * @return List<AlgorithmEntity>
	 */
	public List<AlgorithmEntity> loadAlgorithmsByCommunity(int comm_id);

	
	/**
	 * get an algorithm with the name of it
	 * @param name
	 * @return AlgorithmEntity
	 * @throws NotFoundException
	 */
	public AlgorithmEntity loadAlgorithmByName(String name) throws NotFoundException;
	
	
	/**
	 * Get all algorithms of given user ID
	 * @param user ID
	 * @return List<AlgorithmEntity>
	 * @throws NotFoundException
	 */
	public List<AlgorithmEntity> loadAlgorithmByUser(int userID) throws NotFoundException;

	/**
	 * Check if the algorithm exists based on given name
	 * @param name
	 * @return boolean
	 */
	public boolean isAlgorithmExists(String name);

	
	/**
	 * get all algorithms which are waiting for approval of admin
	 * @return List<AlgorithmEntity>
	 */
	public List<AlgorithmEntity> loadWaitingAdminAlgorithms();
	
	
	/**
	 * get all algorithms which are revised by author and resubmitted
	 * @return List<AlgorithmEntity>
	 */
	public List<AlgorithmEntity> loadResubmitAlgorithms();
	
	/**
	 * get all algorithms which are labeled published or not
	 * @param published whose value is "yes" or "no"
	 * @return List<AlgorithmEntity>
	 */
	public List<AlgorithmEntity> loadPublishAlgorithms(String published);
	
	/**
	 * get all algorithms which are labeled published or not,  <p> and another condition is that the algorithms are belonged to given Community (comm_id).
	 * @param published whose value is "yes" or "no"
	 * @param comm_id
	 * @return List<AlgorithmEntity>
	 */
	public List<AlgorithmEntity> loadPublishAlgorithms(String published,int comm_id);
	
	/**
	 * get all rejected algorithms
	 * @return List<AlgorithmEntity>
	 */
	public List<AlgorithmEntity> loadRejectAlgorithms();
	
	
	/**
	 * get all rejected algorithms which are belonged to given community (comm_id)
	 * @param comm_id
	 * @return List<AlgorithmEntity>
	 */
	public List<AlgorithmEntity> loadRejectAlgorithms(int comm_id);
	
	/**
	 * Get all review algorithms based on its status
	 * @param status the value are waiting,ongoing,and done
	 * @return List<AlgorithmEntity>
	 */
	public List<AlgorithmEntity> loadReviewAlgorithms(String status);
	
	/** Get all review algorithms based on its status, <p> and belonged to given community (comm_id)
	 * @param status whose values are waiting,ongoing,and done
	 * @param comm_id 
	 * @return List<AlgorithmEntity>
	 */
	public List<AlgorithmEntity> loadReviewAlgorithms(String status,int comm_id);
	
	/**
	 * Get all test algorithms based on its status
	 * @param status whose values are waiting,ongoing,and done
	 * @return List<AlgorithmEntity>
	 */
	public List<AlgorithmEntity> loadTestingAlgorithms(String status);
	
	/**
	 *  Get all test algorithms based on its status, <p> and belonged to given community (comm_id)
	 * @param status whose values are waiting,ongoing,and done
	 * @param comm_id
	 * @return
	 */
	public List<AlgorithmEntity> loadTestingAlgorithms(String status,int comm_id);
	

}
