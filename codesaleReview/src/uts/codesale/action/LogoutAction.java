package uts.codesale.action;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import uts.codesale.beans.User;
import uts.codesale.commons.AbstractAction;

import com.opensymphony.xwork2.ActionContext;


public class LogoutAction extends AbstractAction {

	private static final long serialVersionUID = -1539711885424087976L;
	private static Logger log = LoggerFactory.getLogger(LogoutAction.class);
	@Override
	public String execute() throws Exception {
		this.setUserLogin(false);
		User user = (User) ActionContext.getContext().getSession().get("user");
		log.info("Username: "+user.getUsername()+" logout the system!");
		ActionContext.getContext().getSession().clear();
		return super.execute();
	}

}
