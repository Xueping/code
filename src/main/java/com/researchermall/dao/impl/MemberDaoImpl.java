package com.researchermall.dao.impl;


import java.util.List;

import com.researchermall.bean.MemberEntity;
import com.researchermall.commons.GenericDaoImpl;
import com.researchermall.dao.MemberDao;



public class MemberDaoImpl extends GenericDaoImpl<MemberEntity, Integer> implements MemberDao {
	public MemberDaoImpl() {
		super(MemberEntity.class);
	}

	@Override
	public List<MemberEntity> loadMembersByCommunity(int comm_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MemberEntity> loadOwnerByCommunity(int comm_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MemberEntity> loadAdminByCommunity(int comm_id) {
		// TODO Auto-generated method stub
		return null;
	}

}
