package com.researchermall.dao.impl;


import java.util.List;

import com.researchermall.bean.jpa.AlgorithmStatusHistoryEntity;
import com.researchermall.commons.GenericDaoImpl;
import com.researchermall.dao.AlgorithmStatusHistoryDao;



public class AlgorithmStatusHistoryDaoImpl extends GenericDaoImpl<AlgorithmStatusHistoryEntity, Integer> implements AlgorithmStatusHistoryDao {
	public AlgorithmStatusHistoryDaoImpl() {
		super(AlgorithmStatusHistoryEntity.class);
	}

	@Override
	public List<AlgorithmStatusHistoryEntity> loadCurrentAlgorithmStatus(
			int alg_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AlgorithmStatusHistoryEntity> loadHistorialAlgorithmStatus(
			int alg_id) {
		// TODO Auto-generated method stub
		return null;
	}

}
