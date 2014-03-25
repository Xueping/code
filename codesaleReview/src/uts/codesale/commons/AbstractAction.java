package uts.codesale.commons;

import uts.codesale.beans.User;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class AbstractAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static final String FAILURE = "failure";

	public static final String NOTPRIVILEGE = "notprivilege";

	private String errorMessage;

	private boolean menuError;
	private Boolean userLogin;
	private User validateUser;
	private boolean admin;
	

	public Boolean getUserLogin() {
		return userLogin;
	}

	public void setUserLogin(Boolean userLogin) {
		this.userLogin = userLogin;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public boolean isMenuError() {
		return menuError;
	}

	public void setMenuError(boolean menuError) {
		this.menuError = menuError;
	}
	
	public boolean isAdmin() {
		return admin;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
	}


	public boolean isUserLogin() throws Exception {

		validateUser = (User) ActionContext.getContext().getSession().get("user");
		if (validateUser == null || validateUser.equals(null)) {
			this.setErrorMessage("对不起，您还没有登录！");
			this.setMenuError(true);
			return false;
		} else {
			if(validateUser.getAdmin().equalsIgnoreCase("yes"))
				this.setAdmin(true);
			else {
				this.setAdmin(false);
			}
			return true;
		}
			

	}
}
