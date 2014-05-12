package uts.codesale.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * 登陆用户信息工具类
 * 
 * 
 * @author Watson Xu
 * @since 1.0.7  <p> 2013-7-12 下午6:05:22</p>
 */
public class SessionUserDetailsUtil {

	/**
	 * Get the user of current session,return null if it does not exist!
	 * 
	 * @return UserDetails
	 */
	public static UserDetails getUserDetails() {
		UserDetails userDetails = null;
		SecurityContext sc = SecurityContextHolder.getContext();
		Authentication ac = sc.getAuthentication();
		if (ac != null) {
			userDetails = (UserDetails) ac.getPrincipal();
		}
		return userDetails;
	}
	
	public static List<String> getUserRoles() {
		List<String> roles = new ArrayList<String>();
		SecurityContext sc = SecurityContextHolder.getContext();
		Authentication ac = sc.getAuthentication();
		Collection<? extends GrantedAuthority> authorities = ac.getAuthorities();
	        for (GrantedAuthority grantedAuthority : authorities) {
	        	roles.add(grantedAuthority.getAuthority());
	        }
		return roles;
	}

	/**
	 * get current user's name，return null if it does not exist!
	 * 
	 * @return loginId
	 */
	public static String getLoginUserName() {
		String loginId = null;
		UserDetails userDetails = getUserDetails();
		if (userDetails != null) {
			loginId = userDetails.getUsername();
		}
		return loginId;
	}

	/**
	 * Check if user is logined
	 *
	 */
	public static boolean isLogined() {
		boolean flag = false;
		if(getLoginUserName() != null) flag = true;
		return flag;
	}
	
	/**
	 * Check if user has permission
	 *
	 */
	public static boolean isPermission(String role) {
		boolean flag = false;
		if(getUserRoles().contains(role)) flag = true;
		return flag;
	}
	
	/**
	 * Check if user logout
	 *
	 */
	public static void logout() {
		SecurityContext sc = SecurityContextHolder.getContext();
		Authentication ac = sc.getAuthentication();
		ac.setAuthenticated(false);
	}

}
