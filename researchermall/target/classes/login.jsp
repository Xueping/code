<%@ page pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
	<title>User Login</title>
	<meta http-equiv=Content-Type content="text/html; charset=utf-8"/>
	<link href="css/style.css" rel="stylesheet" type="text/css" />
	<script type="text/javascript" src="js/jquery.min.js"></script>
	<script type="text/javascript">
		function check(obj) {
			//alert("hello");
			if(obj.j_username.value == "") {
				alert("Please input Username！");
				return false;
			}
			if(obj.j_password.value == "") {
				alert("Please input Password！");
				return false;
			}
			return true;
		}
	</script>
</head>
<body>
<div id="layout" >
<div id="out_head"><img src="images/out_head.png" /></div>
<div id="out_middle">
		<center>
		  	<table  width=500 align=center>
			  <tbody>
			   <tr>
			    <td width=10>&nbsp;</td>
			    <td align=center>
			    <font color="red" >
			    <%
			    	String error = request.getParameter("error");
			    	if(error!=null&&error.equalsIgnoreCase("true"))
			    		out.println("Username or password is incorrect! Please try again!");
			    		
			    %>
			      </font>
			     </td>
			    </tr>
			   </tbody>
			  </table>

	<!-- <form id="Login" name="Login" action="/codesaleReview/Login.action" method="post"> -->
			<form action="${pageContext.request.contextPath}/j_spring_security_check" onsubmit="return check(this);" method="post">
				<table class="wwFormTable">
					<tr>
					    <td class="tdLabel"><label for="Login_username" class="errorLabel">UserName:</label></td>
					    <td><input type="text" name="j_username" id="Login_username"/></td>
					</tr>
					<tr>
					    <td class="tdLabel"><label for="Login_password" class="errorLabel">Password:</label></td>
					    <td><input type="password" name="j_password" id="Login_password"/></td>
					</tr>
					<tr>
			    		<td colspan="2"><div align="right"><input type="submit" id="Login_0" value="Login"/></div></td>
					</tr>
				</table>
			</form>
		</center>	
	  </div>
	  <div id="out_end"><img src="images/out_end.png" /></div>
	</div>
</body>
</html>

