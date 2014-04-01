package uts.codesale.security;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

public class LoginAuthenticationSuccessHandler implements AuthenticationSuccessHandler{
	
	private static Logger log = LoggerFactory.getLogger(LoginAuthenticationSuccessHandler.class);
	private String url;
	
	public void onAuthenticationSuccess(HttpServletRequest request,
			HttpServletResponse response, Authentication authentication) throws IOException,
			ServletException {
		log.info("Login successfully ："+request.getContextPath()+url);
		response.sendRedirect(request.getContextPath()+url);
	}
	
	public void setUrl(String url) {
		this.url = url;
	}

}
