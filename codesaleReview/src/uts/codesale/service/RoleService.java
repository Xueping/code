package uts.codesale.service;

import java.util.List;

import uts.codesale.beans.Role;
import uts.codesale.commons.IGenericService;


public interface RoleService extends IGenericService<Role, Long> {


	public List<Role> getByUserId(Long userId);

	public List<Role> getRoles();

	public void saveRole(Role role);

}
