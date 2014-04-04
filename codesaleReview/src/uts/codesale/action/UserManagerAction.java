package uts.codesale.action;

import java.util.Iterator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import uts.codesale.beans.User;
import uts.codesale.commons.AbstractAction;
import uts.codesale.security.SessionUserDetailsUtil;
import uts.codesale.service.UserService;


public class UserManagerAction extends AbstractAction {

	private static final long serialVersionUID = -984553441058860538L;
	private static Logger log = LoggerFactory.getLogger(UserManagerAction.class);
	private UserService userService;
	private User user;
	private Iterator<User> users;
	private Long id;
	private String userName;

	public String execute() throws Exception  {
		if (!this.isUserLogin())
			return INPUT;	
//		user =  (User)ActionContext.getContext().getSession().get("user");
		user = this.userService.getUserByUsername(SessionUserDetailsUtil.getLoginUserName());
		return SUCCESS;
	}

	public String changePassword() throws Exception {
		if (!this.isUserLogin())
			return INPUT;	
		user = this.userService.getUserByUsername(SessionUserDetailsUtil.getLoginUserName());
//		user =  (User)ActionContext.getContext().getSession().get("user");
		return SUCCESS;
	}
	
	
	public String userList() throws Exception{
		if (!this.isUserLogin())
			return INPUT;	
		this.users = this.getUserService().getAll().iterator();
		
		return SUCCESS;
	}
	
	
	public String userDisplay() throws Exception{
		if (!this.isUserLogin())
			return INPUT;
		if(null!=this.getId()) {
			this.user = this.getUserService().get(this.getId());
		}else {
			this.user = this.getUserService().getUserByUsername(userName);
		}
		log.info("Admin browsed the information of the User :"+user.getUsername());
		return SUCCESS;
	}
	
	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}


	public Iterator<User> getUsers() {
		return users;
	}

	public void setUsers(Iterator<User> users) {
		this.users = users;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
}
