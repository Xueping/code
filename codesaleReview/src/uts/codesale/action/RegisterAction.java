package uts.codesale.action;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import uts.codesale.beans.User;
import uts.codesale.commons.AbstractAction;
import uts.codesale.service.UserService;
public class RegisterAction extends AbstractAction {

	private static final long serialVersionUID = -4053087799324022457L;
	private static Logger log = LoggerFactory.getLogger(RegisterAction.class);
	private User currentUser;
	
	private UserService userService;

	private String userExist;

	public String getUserExist() {
		return userExist;
	}

	public void setUserExist(String userExist) {
		this.userExist = userExist;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public User getCurrentUser() {
		return currentUser;
	}

	public void setCurrentUser(User currentUser) {
		this.currentUser = currentUser;
	}

	@Override
	public String execute() throws Exception {
		if (!this.isUserLogin())
			return "Login";

		if (currentUser.getUsername().trim().length()==0) {
			this.setUserExist("The UserName can not be empty!");
			this.setCurrentUser(currentUser);
			return INPUT;
		}
		if (currentUser.getPassword().trim().length()==0) {
			this.setUserExist("The Password can not be empty!");
			this.setCurrentUser(currentUser);
			return INPUT;
		}
		if (currentUser.getFirstName().trim().length()==0) {
			this.setUserExist("The FirstName can not be empty!");
			this.setCurrentUser(currentUser);
			return INPUT;
		}
		if (currentUser.getLastName().trim().length()==0) {
			this.setUserExist("The LastName can not be empty!");
			this.setCurrentUser(currentUser);
			return INPUT;
		}
		if (currentUser.getEmail().trim().length()==0) {
			this.setUserExist("The Email can not be empty!");
			this.setCurrentUser(currentUser);
			return INPUT;
		}

		
		if (getUserService().isUserExists(currentUser.getUsername())) {
			this.setUserExist(currentUser.getUsername() + " existed already!");
			this.setCurrentUser(currentUser);
			return INPUT;
		}
		if (getUserService().isEmailExists(currentUser.getEmail())) {
			this.setUserExist(currentUser.getEmail()+" existed already!");
			this.setCurrentUser(currentUser);
			return INPUT;
		}
	
		Timestamp tp = new Timestamp(System.currentTimeMillis());
		currentUser.setCreateTime((new SimpleDateFormat("yyyy-MM-dd HH:mm")).format(tp));
		currentUser.setAdmin("no");
		currentUser.setPublisher("no");
		this.getUserService().save(currentUser);
		log.info("Admin added a new user: "+currentUser.getUsername().trim());
		return SUCCESS;
	

	}

	public Boolean userExist(String userName) {
		if (getUserService().isUserExists(userName)) {
			return true;
		}else
			return false;
	}

	

}
