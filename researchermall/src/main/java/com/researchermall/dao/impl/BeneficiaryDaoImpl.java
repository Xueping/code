package com.researchermall.dao.impl;


import java.util.List;

import com.researchermall.bean.BeneficiaryEntity;
import com.researchermall.commons.GenericDaoImpl;
import com.researchermall.dao.BeneficiaryDao;



public class BeneficiaryDaoImpl extends GenericDaoImpl<BeneficiaryEntity, Integer> implements BeneficiaryDao {
	public BeneficiaryDaoImpl() {
		super(BeneficiaryEntity.class);
	}

	@Override
	public List<BeneficiaryEntity> loadBeneficiary(int alg_id) {
		// TODO Auto-generated method stub
		return null;
	}

}
