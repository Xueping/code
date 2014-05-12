package com.researchermall.dao;

import java.util.List;

import org.acegisecurity.userdetails.UsernameNotFoundException;

import com.researchermall.bean.AlgorithmEntity;
import com.researchermall.bean.ReviewEntity;
import com.researchermall.bean.UserEntity;
import com.researchermall.commons.IGenericDao;



public interface UserDao extends IGenericDao<UserEntity, Integer> {

	public UserEntity loadUserByUsername(String username)
			throws UsernameNotFoundException;

	public boolean isUserExists(String username);

	public boolean isEmailExists(String email);
	
	public List<AlgorithmEntity> loadAlgorithmsByUser(int user_id) ;
	
	public List<ReviewEntity> loadReviewsAlgorithmsByUser(int user_id);
	
}
