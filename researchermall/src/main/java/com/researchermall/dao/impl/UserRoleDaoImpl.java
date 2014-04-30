package com.researchermall.dao.impl;


import com.researchermall.bean.UserRoleEntity;
import com.researchermall.commons.GenericDaoImpl;
import com.researchermall.dao.UserRoleDao;



public class UserRoleDaoImpl extends GenericDaoImpl<UserRoleEntity, Integer> implements UserRoleDao {
	public UserRoleDaoImpl() {
		super(UserRoleEntity.class);
	}

}
