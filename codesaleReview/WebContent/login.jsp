<%@ page pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
	<title>User Login</title>
	<meta http-equiv=Content-Type content="text/html; charset=utf-8"/>
	<link href="css/style.css" rel="stylesheet" type="text/css" />
</head>
<body>
<div id="layout" >
<div id="out_head"><img src="images/out_head.png" /></div>
<div id="out_middle">
		<center>
		<table cellSpacing=0 cellPadding=0 width=500 align=center>
  <tbody>
   <tr>
    <td width=10>&nbsp;</td>
    <td vAlign=top colSpan=2 rowSpan=3 align=center>
    <font color="red" >
      <s:if test="passwordError==true">
	      <s:property value="passwordErrorMessage"/>
	  </s:if>
      <s:if test="userNotExist==true">
      	  <s:property value="userNotExistErrorMessage"/>
      </s:if>
      </font>
     </td>
    </tr>
   </tbody>
  </table>

		
			<s:form action="Login" method="post">
        		<s:textfield label="UserName" name="username"/>
 				<s:password label="Password" name="password" />
 				<s:submit value="Login"></s:submit>
			</s:form>
		</center>	
	  </div>
	  <div id="out_end"><img src="images/out_end.png" /></div>
	</div>
</body>
</html>

