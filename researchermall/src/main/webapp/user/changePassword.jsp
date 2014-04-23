<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="css/main.css" rel="stylesheet" type="text/css">
<title>Change Password</title>
</head>
<body>
<jsp:include page="/leftAndTop.jsp" />
    
    <!-- Title area -->
    <div class="titleArea">
        <div class="wrapper">
            <div class="pageTitle">
                <h5>Change Password</h5>
                <span>
                <s:if test="errorPassword==true">
					<font color="red"><s:property value="errorPasswordMessage"/></font>
				</s:if>
				<s:else>
					<font color="green"><s:property value="errorPasswordMessage"/></font>
				</s:else>
                </span>
            </div>
        </div>
    </div>
    <div class="line"></div>
    
    <!-- Main content wrapper -->
    <div class="wrapper">
			<!-- Form -->
			<form class="form" action="changePasswordSubmit.action" method="post">
				<fieldset>
					<div class="widget">
						
						<div class="formRow">
							<label>UserName:</label>
							<div class="formRight">
								<input type="text" name="" value=<s:property value="user.username"/> disabled="disabled"/>
							</div>
						</div>
						<div class="formRow">
							<label>Current Password</label>
							<div class="formRight">
								<input type="password" name="oldPassword" value="">
							</div>
						</div>
						<div class="formRow">
							<label>New Password:</label>
							<div class="formRight">
								<input type="password" name="newPassword" >
							</div>
						</div>
						<div class="formRow">
							<label>Confirm Password:</label>
							<div class="formRight">
								<input type="password" name="newPasswordConfirm" >
							</div>
						</div>
						
						<div class="formSubmit">
							<input class="redB" type="submit" value="submit">
						</div>
					</div>
				</fieldset>
			</form>
		</div>
<jsp:include page="/footer.jsp" />

</body>
</html>
