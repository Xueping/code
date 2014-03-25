package uts.codesale.dao.impl;

import uts.codesale.beans.Testing;
import uts.codesale.commons.GenericDaoImpl;
import uts.codesale.dao.TestingDao;

public class TestingDaoImpl extends GenericDaoImpl<Testing, Long> implements
		TestingDao {

	public TestingDaoImpl() {
		super(Testing.class);
	}

	

}
