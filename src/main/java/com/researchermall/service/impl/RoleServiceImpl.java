package com.researchermall.service.impl;

import java.util.List;

import uts.codesale.beans.Role;
import uts.codesale.commons.GenericServiceImpl;
import uts.codesale.dao.RoleDao;
import uts.codesale.service.RoleService;

public class RoleServiceImpl extends GenericServiceImpl<Role, Long>
		implements RoleService {


	private RoleDao roleDao;
	
	public RoleServiceImpl(RoleDao roleDao) {
		super(roleDao);
		this.roleDao = roleDao;
	}

	@Override
	public List<Role> getByUserId(Long userId) {
		return roleDao.loadByUserId(userId);
	}

	@Override
	public List<Role> getRoles() {
		// TODO Auto-generated method stub
		return roleDao.getRoles();
	}

	@Override
	public void saveRole(Role role) {
		roleDao.saveRole(role);
		
	}

	

}
