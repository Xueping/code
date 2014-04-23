package uts.codesale.dao;

import java.util.List;

import uts.codesale.beans.Role;
import uts.codesale.commons.IGenericDao;


public interface RoleDao extends IGenericDao<Role, Long> {


	public List<Role> loadByUserId(Long userId);

	public List<Role> getRoles();

	public void saveRole(Role role);

}
