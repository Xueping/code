package uts.codesale.action;

import uts.codesale.commons.AbstractAction;

public class PaymentAction extends AbstractAction {

	private static final long serialVersionUID = 9013014279629819678L;
	

	public String execute() throws Exception {
		//get user from session
		if (!this.isUserLogin())
			return INPUT;	
		return SUCCESS;
	}

	

	
}
