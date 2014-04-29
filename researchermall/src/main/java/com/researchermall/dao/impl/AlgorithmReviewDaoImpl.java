package com.researchermall.dao.impl;


import com.researchermall.bean.jpa.AlgorithmReviewEntity;
import com.researchermall.commons.GenericDaoImpl;
import com.researchermall.dao.AlgorithmReviewDao;



public class AlgorithmReviewDaoImpl extends GenericDaoImpl<AlgorithmReviewEntity, Integer> implements AlgorithmReviewDao {
	
	public AlgorithmReviewDaoImpl() {
		super(AlgorithmReviewEntity.class);
	}


}
