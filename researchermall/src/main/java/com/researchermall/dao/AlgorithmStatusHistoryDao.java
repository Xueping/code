package com.researchermall.dao;

import java.util.List;

import com.researchermall.bean.AlgorithmStatusHistoryEntity;
import com.researchermall.commons.IGenericDao;


public interface AlgorithmStatusHistoryDao extends IGenericDao<AlgorithmStatusHistoryEntity, Integer> {


	public List<AlgorithmStatusHistoryEntity> loadCurrentAlgorithmStatus(int alg_id);
	public List<AlgorithmStatusHistoryEntity> loadHistorialAlgorithmStatus(int alg_id);

}
