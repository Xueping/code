package com.researchermall.dao.impl;


import com.researchermall.bean.CommunityEntity;
import com.researchermall.commons.GenericDaoImpl;
import com.researchermall.dao.CommunityDao;



public class CommunityDaoImpl extends GenericDaoImpl<CommunityEntity, Integer> implements CommunityDao {
	public CommunityDaoImpl() {
		super(CommunityEntity.class);
	}

}
