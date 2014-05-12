package com.researchermall.dao.impl;

import java.util.List;

import org.acegisecurity.userdetails.UsernameNotFoundException;

import com.researchermall.bean.AlgorithmEntity;
import com.researchermall.bean.ReviewEntity;
import com.researchermall.bean.UserEntity;
import com.researchermall.commons.GenericDaoImpl;
import com.researchermall.dao.UserDao;



public class UserDaoImpl extends GenericDaoImpl<UserEntity, Integer> implements UserDao {
	public UserDaoImpl() {
		super(UserEntity.class);
	}

	@Override
	public UserEntity loadUserByUsername(String username)
			throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isUserExists(String username) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEmailExists(String email) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<AlgorithmEntity> loadAlgorithmsByUser(int user_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ReviewEntity> loadReviewsAlgorithmsByUser(int user_id) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
