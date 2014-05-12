package uts.codesale.service.impl;

import uts.codesale.beans.Community;
import uts.codesale.commons.GenericServiceImpl;
import uts.codesale.dao.CommunityDao;
import uts.codesale.service.CommunityService;


public class CommunityServiceImpl extends GenericServiceImpl<Community, Long> implements
CommunityService {
	private CommunityDao communityDao;

	public CommunityServiceImpl(CommunityDao communityDao) {
		super(communityDao);
		this.communityDao = communityDao;
	}

	
}
