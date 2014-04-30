package com.researchermall.dao.impl;

import java.util.List;

import com.researchermall.bean.AlgorithmEntity;
import com.researchermall.commons.GenericDaoImpl;
import com.researchermall.dao.AlgorithmDao;
import com.researchermall.exception.NotFoundException;


public class AlgorithmDaoImpl extends GenericDaoImpl<AlgorithmEntity, Integer> implements
		AlgorithmDao {

	public AlgorithmDaoImpl() {
		super(AlgorithmEntity.class);
	}

	@Override
	public List<AlgorithmEntity> loadAlgorithmsByCommunity(int comm_id) {
		@SuppressWarnings("unchecked")
		List<AlgorithmEntity> algs = (List<AlgorithmEntity>)getHibernateTemplate().find(
				"from Algorithm where communityid= "+ comm_id+" order by createdate desc , id DESC ");
		
		return algs;
	}

	@Override
	public AlgorithmEntity loadAlgorithmByName(String name)
			throws NotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AlgorithmEntity> loadAlgorithmByUser(int userID)
			throws NotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isAlgorithmExists(String name) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<AlgorithmEntity> loadWaitingAdminAlgorithms() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AlgorithmEntity> loadResubmitAlgorithms() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AlgorithmEntity> loadPublishAlgorithms(String published) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AlgorithmEntity> loadPublishAlgorithms(String published,
			int comm_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AlgorithmEntity> loadRejectAlgorithms() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AlgorithmEntity> loadRejectAlgorithms(int comm_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AlgorithmEntity> loadReviewAlgorithms(String status) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AlgorithmEntity> loadReviewAlgorithms(String status, int comm_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AlgorithmEntity> loadTestingAlgorithms(String status) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AlgorithmEntity> loadTestingAlgorithms(String status,
			int comm_id) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
