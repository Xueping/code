package uts.codesale.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;

public class LoginAuthenticationFailureHandler implements AuthenticationFailureHandler {

	private String url;
	
	public void setUrl(String url) {
		this.url = url;
	}
	@Override
	public void onAuthenticationFailure(HttpServletRequest request,
			HttpServletResponse response, AuthenticationException ae)
			throws IOException, ServletException {
		
		response.sendRedirect(request.getContextPath()+url);
	}

}
