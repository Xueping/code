package uts.codesale.security;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import uts.codesale.beans.Role;
import uts.codesale.beans.User;
import uts.codesale.service.RoleService;
import uts.codesale.service.UserService;


public class UserDetailsServiceImpl implements UserDetailsService{
	
	private static Logger log = LoggerFactory.getLogger(UserDetailsServiceImpl.class);
	private UserService userService;
	private RoleService roleService;
	
	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public RoleService getRoleService() {
		return roleService;
	}

	public void setRoleService(RoleService roleService) {
		this.roleService = roleService;
	}

	/**
	 * @param account 登录帐号
	 */
	public UserDetails loadUserByUsername(String account)
			throws UsernameNotFoundException {
		log.info("login account:"+account);
		org.springframework.security.core.userdetails.User userDetails = null;
		User user = userService.getUserByUsername(account);
		
		Collection<GrantedAuthority> grantedAuthorities = getGrantedAuthorities(user);  
		boolean enables = true;  
        boolean accountNonExpired = true;  
        boolean credentialsNonExpired = true;  
        boolean accountNonLocked = true; 
        userDetails = new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), enables, accountNonExpired, credentialsNonExpired, accountNonLocked, grantedAuthorities);  
		return userDetails;
	}
	
	/**
	 * 根据用户获取该用户拥有的角色
	 * @param user
	 * @return
	 */
	private Set<GrantedAuthority> getGrantedAuthorities(User user) {
		Set<GrantedAuthority> grantedAuthorities = new HashSet<GrantedAuthority>();  
        List<Role> roles = roleService.getByUserId(user.getId()); 
        if(roles != null) {
        	for(Role role : roles) {  
        		grantedAuthorities.add(new SimpleGrantedAuthority(role.getName()));
        		System.out.println("Role name is :"+role.getName());
            }  
        }
        return grantedAuthorities;  
	}

}
