package uts.codesale.service.impl;

import uts.codesale.beans.AlgorithmBKP;
import uts.codesale.commons.GenericServiceImpl;
import uts.codesale.dao.AlgorithmBKPDao;
import uts.codesale.service.AlgorithmBKPService;

public class AlgorithmBKPServiceImpl extends GenericServiceImpl<AlgorithmBKP, Long>
		implements AlgorithmBKPService {


	public AlgorithmBKPServiceImpl(AlgorithmBKPDao itemDao) {
		super(itemDao);
	}

	

}
