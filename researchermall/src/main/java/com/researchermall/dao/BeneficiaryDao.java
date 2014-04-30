package com.researchermall.dao;

import java.util.List;

import com.researchermall.bean.BeneficiaryEntity;
import com.researchermall.commons.IGenericDao;


public interface BeneficiaryDao extends IGenericDao<BeneficiaryEntity, Integer> {


	public List<BeneficiaryEntity> loadBeneficiary(int alg_id);

}
