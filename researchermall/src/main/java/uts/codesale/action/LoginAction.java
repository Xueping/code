package uts.codesale.action;

import org.acegisecurity.userdetails.UsernameNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import uts.codesale.beans.User;
import uts.codesale.commons.AbstractAction;
import uts.codesale.service.UserService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;
import com.opensymphony.xwork2.validator.annotations.ValidatorType;

public class LoginAction extends AbstractAction {

	private static final long serialVersionUID = -8627227279200891402L;
	private UserService userService;
	
	private static Logger log = LoggerFactory.getLogger(LoginAction.class);
	private User user;
	private String username;
	private String password;
	private String userNotExistErrorMessage;
	private String enabledMessage;
	private boolean enabled;
	private boolean userNotExist;
	private String passwordErrorMessage;
	private boolean passwordError;

	
	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public String getPassword() {
		return password;
	}

	@RequiredStringValidator(type = ValidatorType.FIELD, message = "The password must not be empty!", trim = true)
	//@StringLengthFieldValidator(type = ValidatorType.FIELD, minLength = "5", key = "login.password.error", message = "The length of Password should be more than 5")
	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	@RequiredStringValidator(type = ValidatorType.FIELD, message = "The UserName must not be empty!", trim = true)
	//@StringLengthFieldValidator(type = ValidatorType.FIELD, minLength = "5", key = "login.username.error", message = "The length of UserName should be more than 5")
	public void setUsername(String username) {
		this.username = username;
	}

	public boolean isPasswordError() {
		return passwordError;
	}

	public void setPasswordError(boolean passwordError) {
		this.passwordError = passwordError;
	}

	public String getPasswordErrorMessage() {
		return passwordErrorMessage;
	}

	public void setPasswordErrorMessage(String passwordErrorMessage) {
		this.passwordErrorMessage = passwordErrorMessage;
	}

	public boolean isUserNotExist() {
		return userNotExist;
	}

	public void setUserNotExist(boolean userNotExist) {
		this.userNotExist = userNotExist;
	}

	public String getUserNotExistErrorMessage() {
		return userNotExistErrorMessage;
	}

	public void setUserNotExistErrorMessage(String userNotExistErrorMessage) {
		this.userNotExistErrorMessage = userNotExistErrorMessage;
	}
	
	public String login() {
		
				return SUCCESS;
	}

	public String execute() throws Exception {
		
		UserService us = getUserService();
		try {
			user = us.getUserByUsername(getUsername());

			if (!user.getPassword().equals(getPassword().trim())) {
				this.setPasswordErrorMessage("The password is not correct!");
				this.setPasswordError(true);
				log.info(getUsername()+" tries to login, but The password is not correct!");
				return INPUT;
			} else {
				ActionContext.getContext().getSession().put("user", user);
				log.info(getUsername()+"  login!");
				return SUCCESS;
			}
		} catch (UsernameNotFoundException e) {
			this.setUserNotExistErrorMessage("The userName does not exist!");
			this.setUserNotExist(true);
			log.info(getUsername()+" tries to login, but The userName does not exist!");
			return INPUT;
		}
	}


	public String getEnabledMessage() {
		return enabledMessage;
	}

	public void setEnabledMessage(String enabledMessage) {
		this.enabledMessage = enabledMessage;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}


}
