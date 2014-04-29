package com.researchermall.dao.impl;

import java.util.List;

import com.researchermall.bean.jpa.RoleEntity;
import com.researchermall.commons.GenericDaoImpl;
import com.researchermall.dao.RoleDao;



public class RoleDaoImpl extends GenericDaoImpl<RoleEntity, Integer> implements RoleDao {
	public RoleDaoImpl() {
		super(RoleEntity.class);
	}

	@Override
	public List<RoleEntity> loadByUserId(int user_id) {
		// TODO Auto-generated method stub
		return null;
	}

	

	
}
