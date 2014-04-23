package uts.codesale.service.impl;

import uts.codesale.beans.Testing;
import uts.codesale.commons.GenericServiceImpl;
import uts.codesale.dao.TestingDao;
import uts.codesale.service.TestingService;

public class TestingServiceImpl extends GenericServiceImpl<Testing, Long>
		implements TestingService {


	public TestingServiceImpl(TestingDao itemDao) {
		super(itemDao);
	}

	

}
