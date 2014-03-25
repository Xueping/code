package uts.codesale.action;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import uts.codesale.beans.User;
import uts.codesale.commons.AbstractAction;
import uts.codesale.service.UserService;

import com.opensymphony.xwork2.ActionContext;

public class UserEditAction extends AbstractAction {

	private static final long serialVersionUID = 9013014279629819678L;
	private UserService userService;
	private static Logger log = LoggerFactory.getLogger(UserEditAction.class);
	private User user;
	
	private String oldPassword;
	private String newPassword;
	private String newPasswordConfirm;
	private String errorPasswordMessage;
	private Boolean errorPassword;
	private Boolean editPassword;
	private String newUserPassword;
	private String newUserPasswordConfirm;
	
	
	public Boolean getEditPassword() {
		return editPassword;
	}

	public void setEditPassword(Boolean editPassword) {
		this.editPassword = editPassword;
	}

	public String getNewUserPassword() {
		return newUserPassword;
	}

	public void setNewUserPassword(String newUserPassword) {
		this.newUserPassword = newUserPassword;
	}

	public String getNewUserPasswordConfirm() {
		return newUserPasswordConfirm;
	}

	public void setNewUserPasswordConfirm(String newUserPasswordConfirm) {
		this.newUserPasswordConfirm = newUserPasswordConfirm;
	}

	public Boolean getErrorPassword() {
		return errorPassword;
	}

	public void setErrorPassword(Boolean errorPassword) {
		this.errorPassword = errorPassword;
	}

	public String getErrorPasswordMessage() {
		return errorPasswordMessage;
	}

	public void setErrorPasswordMessage(String errorPasswordMessage) {
		this.errorPasswordMessage = errorPasswordMessage;
	}

	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

	public String getNewPasswordConfirm() {
		return newPasswordConfirm;
	}

	public void setNewPasswordConfirm(String newPasswordConfirm) {
		this.newPasswordConfirm = newPasswordConfirm;
	}

	public String getOldPassword() {
		return oldPassword;
	}

	public void setOldPassword(String oldPassword) {
		this.oldPassword = oldPassword;
	}

	public String execute() {
		user =  (User)ActionContext.getContext().getSession().get("user");
		return SUCCESS;
	}

	public String changePasswordSubmit() throws Exception {
		//get user from session
		if (!this.isUserLogin())
			return "Login";	
		User tempuser = (User)ActionContext.getContext().getSession().get("user");
		user = tempuser;
		//if the new password equals to the old one
		if(!tempuser.getPassword().equals(this.getOldPassword().trim())){
			this.setErrorPasswordMessage("The current password is not correct!");
			this.setErrorPassword(true);
			return INPUT;
		}
		//the new password is empty
		if(this.getNewPassword().trim().length()==0){
			this.setErrorPasswordMessage("The new password is empty");
			this.setErrorPassword(true);
			return INPUT;
		}
		//the length of new password is less than 6
		if(this.getNewPassword().trim().length()!=0&&this.getNewPassword().trim().length()<6){
			this.setErrorPasswordMessage("The length of new password is less than 6");
			this.setErrorPassword(true);
			return INPUT;
		}
		//two new passwords are different
		if(!this.getNewPassword().trim().equals(this.getNewPasswordConfirm().trim())){
			this.setErrorPasswordMessage("Two new passwords are different");
			this.setErrorPassword(true);
			return INPUT;
		}
		//set new password
		tempuser.setPassword(this.getNewPassword());
		try {
			//save new password in database
			this.getUserService().save(tempuser);
			this.setErrorPasswordMessage("Your new password has been changed successfully!");
			this.setErrorPassword(false);
		} catch (Exception e) {
			e.printStackTrace();
		}
		log.info("User: "+tempuser.getUsername() +" updated his/her password!");
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

	
}
