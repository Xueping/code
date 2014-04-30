package com.researchermall.dao;

import java.util.List;

import com.researchermall.bean.MemberEntity;
import com.researchermall.commons.IGenericDao;


public interface MemberDao extends IGenericDao<MemberEntity, Integer> {


	public List<MemberEntity> loadMembersByCommunity(int comm_id);
	public List<MemberEntity> loadOwnerByCommunity(int comm_id);
	public List<MemberEntity> loadAdminByCommunity(int comm_id);
}
