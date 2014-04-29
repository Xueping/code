package com.researchermall.dao.impl;


import com.researchermall.bean.jpa.InvitationEntity;
import com.researchermall.commons.GenericDaoImpl;
import com.researchermall.dao.InvitationDao;



public class InvitationDaoImpl extends GenericDaoImpl<InvitationEntity, Integer> implements InvitationDao {
	public InvitationDaoImpl() {
		super(InvitationEntity.class);
	}

}
