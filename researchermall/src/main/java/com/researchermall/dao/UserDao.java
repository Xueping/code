package com.researchermall.dao;

import java.util.List;

import org.acegisecurity.userdetails.UsernameNotFoundException;

import com.researchermall.bean.jpa.AlgorithmEntity;
import com.researchermall.bean.jpa.AlgorithmReviewEntity;
import com.researchermall.bean.jpa.UserEntity;
import com.researchermall.commons.IGenericDao;



public interface UserDao extends IGenericDao<UserEntity, Integer> {

	public UserEntity loadUserByUsername(String username)
			throws UsernameNotFoundException;

	public boolean isUserExists(String username);

	public boolean isEmailExists(String email);
	
	public List<AlgorithmEntity> loadAlgorithmsByUser(int user_id) ;
	
	public List<AlgorithmReviewEntity> loadReviewsAlgorithmsByUser(int user_id);
	
}
