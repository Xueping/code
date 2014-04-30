package com.researchermall.dao;

import java.util.List;

import com.researchermall.bean.RoleEntity;
import com.researchermall.commons.IGenericDao;


public interface RoleDao extends IGenericDao<RoleEntity, Integer> {

	public List<RoleEntity> loadByUserId(int user_id);
}
