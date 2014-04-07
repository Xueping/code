package uts.codesale.action;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import uts.codesale.beans.Community;
import uts.codesale.beans.Role;
import uts.codesale.beans.User;
import uts.codesale.commons.AbstractAction;
import uts.codesale.service.AlgorithmService;
import uts.codesale.service.CommunityService;
import uts.codesale.service.RoleService;
import uts.codesale.service.UserService;

public class CommunityAction extends AbstractAction{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static Logger log = LoggerFactory.getLogger(CommunityAction.class);
	private Community community;
	private Iterator<User> allUsers;
	private UserService userService;
	private RoleService roleService;
	private CommunityService communityService;
	private AlgorithmService algorithmService;
	private Long commAdmin;
	private Long comm_id;
	private Long agl_id;
	private String message;
	private List<Long> users;
	
	public String execute() throws Exception {
		
		if (!this.isUserLogin())
			return INPUT;
		
		allUsers = userService.getAll().iterator();
		return SUCCESS;
	}
	
	public String community_add() throws Exception {
		if (!this.isUserLogin())
			return INPUT;
		
		//create a new community and assign community admin
		//step one: create community
		User admin = this.userService.get(commAdmin);
		Set<User> admins = new HashSet<User>();
		admins.add(admin);
		this.community.setAdmin(admin.getUsername());
		this.community.setAdmins(admins);
		this.communityService.save(community);
		
		//step two: add community in user attribute
		Set<Community> comms = admin.getCommunities_admin();
		comms.add(community);
		admin.setCommunities_admin(comms);
		log.info("Add a new community, name is "+this.getCommunity().getName()+", and Community Admin is " + admin.getUsername());
		
		//add community admin role, whose id is 5
		//step one: add community admin role in user attribute
		Role role = this.getRoleService().get(5l);
		Set<Role> roles = admin.getRoles();
		roles.add(role);
		admin.setRoles(roles);
		this.userService.save(admin);
		
		//step two: add community admin in role attribute
		Set<User> users = role.getUsers();
		users.add(admin);
		role.setUsers(users);
		this.getRoleService().save(role);
		log.info("Add community role to user: " + admin.getUsername());
		this.message = "A new community \"" + this.getCommunity().getName() + "\" has been created! <p> And Community admin is \"" + admin.getUsername() +"\"";
		
		return SUCCESS;
	}
	
	public String community_add_user() throws Exception {
		
		if (!this.isUserLogin())
			return INPUT;
		this.community = this.communityService.get(comm_id);
		allUsers = userService.getAll().iterator();
		return SUCCESS;
	}
	
	public String community_add_user_submit() throws Exception {
		
		if (!this.isUserLogin())
			return INPUT;
		this.community = this.communityService.get(comm_id);
		Set<User> us = this.community.getUsers();
		
		for(Long user_id : users) {
			User user = this.userService.get(user_id);
			us.add(user);
			Set<Community> cs = user.getCommunities_user();
			cs.add(community);
			user.setCommunities_user(cs);
			this.userService.save(user);
			log.info("User "+user.getUsername() +" joined the community of \""+community.getName()+"\"");
		}
		this.community.setUsers(us);
		this.communityService.save(community);
		this.message = users.size() +" user(s)  joined the community \"" + this.getCommunity().getName() + "\" successfully!";
		return SUCCESS;
	}

	public Community getCommunity() {
		return community;
	}

	public void setCommunity(Community community) {
		this.community = community;
	}

	public Iterator<User> getAllUsers() {
		return allUsers;
	}

	public void setAllUsers(Iterator<User> allUsers) {
		this.allUsers = allUsers;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public List<Long> getUsers() {
		return users;
	}

	public void setUsers(List<Long> users) {
		this.users = users;
	}

	public CommunityService getCommunityService() {
		return communityService;
	}

	public void setCommunityService(CommunityService communityService) {
		this.communityService = communityService;
	}

	public AlgorithmService getAlgorithmService() {
		return algorithmService;
	}

	public void setAlgorithmService(AlgorithmService algorithmService) {
		this.algorithmService = algorithmService;
	}

	public RoleService getRoleService() {
		return roleService;
	}

	public void setRoleService(RoleService roleService) {
		this.roleService = roleService;
	}

	public Long getComm_id() {
		return comm_id;
	}

	public void setComm_id(Long comm_id) {
		this.comm_id = comm_id;
	}

	public Long getCommAdmin() {
		return commAdmin;
	}

	public void setCommAdmin(Long commAdmin) {
		this.commAdmin = commAdmin;
	}

	public Long getAgl_id() {
		return agl_id;
	}

	public void setAgl_id(Long agl_id) {
		this.agl_id = agl_id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	
}
