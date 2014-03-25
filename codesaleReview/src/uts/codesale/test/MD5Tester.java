package uts.codesale.test;

import uts.codesale.util.MD5Util;


public class MD5Tester {
	
	
	public void testEncodePassword() {
		String password = "123456";
		String salt = "luxh";
		System.out.println(MD5Util.encodePassword(password, salt));
	}
}
