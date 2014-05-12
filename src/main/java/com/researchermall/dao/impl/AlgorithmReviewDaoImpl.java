package com.researchermall.dao.impl;


import com.researchermall.bean.ReviewEntity;
import com.researchermall.commons.GenericDaoImpl;
import com.researchermall.dao.AlgorithmReviewDao;



public class AlgorithmReviewDaoImpl extends GenericDaoImpl<ReviewEntity, Integer> implements AlgorithmReviewDao {
	
	public AlgorithmReviewDaoImpl() {
		super(ReviewEntity.class);
	}


}
