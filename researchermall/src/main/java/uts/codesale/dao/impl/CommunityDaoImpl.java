package uts.codesale.dao.impl;

import uts.codesale.beans.Community;
import uts.codesale.commons.GenericDaoImpl;
import uts.codesale.dao.CommunityDao;


public class CommunityDaoImpl extends GenericDaoImpl<Community, Long> implements CommunityDao {
	public CommunityDaoImpl() {
		super(Community.class);
	}

}
