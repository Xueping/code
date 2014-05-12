package uts.codesale.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;

import uts.codesale.beans.Role;
import uts.codesale.beans.User;
import uts.codesale.commons.GenericDaoImpl;
import uts.codesale.dao.RoleDao;


public class RoleDaoImpl extends GenericDaoImpl<Role, Long> implements RoleDao {
	public RoleDaoImpl() {
		super(Role.class);
	}

	@Override
	public List<Role> loadByUserId(Long userId) {
		Session session = getHibernateTemplate().getSessionFactory().getCurrentSession();
		User user =(User)session.load(User.class, userId); 
		Set<Role> roleSets=user.getRoles();
		
        List<Role> list = new ArrayList<Role>();
        for(Role role : roleSets){
        	list.add(role);
        }
		return list;
	}

	@Override
	public List<Role> getRoles() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveRole(Role role) {
		log.debug("add or update Role's id: " + role.getId());
		getHibernateTemplate().saveOrUpdate(role);
		getHibernateTemplate().flush();
		
	}

	
}
