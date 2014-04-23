<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="css/main.css" rel="stylesheet" type="text/css">
<title>User Information</title>
</head>
<body>
<jsp:include page="/leftAndTop.jsp" />
    
    <!-- Title area -->
    <div class="titleArea">
        <div class="wrapper">
            <div class="pageTitle">
                <h5>User Information</h5>
                <span></span>
            </div>
        </div>
    </div>
    <div class="line"></div>
    
    <!-- Main content wrapper -->
    <div class="wrapper">
				<fieldset>
					<div class="widget">
						<div class="formRow">
							<label>UserName:</label>
							<div class="formRight">
								<s:property value="user.username"/>
							</div>
						</div>
						<div class="formRow">
							<label>First Name:</label>
							<div class="formRight">
								<s:property value="user.firstName"/>
							</div>
						</div>
						<div class="formRow">
							<label>Last Name:</label>
							<div class="formRight">
								<s:property value="user.lastName"/>
							</div>
						</div>
						<div class="formRow">
							<label>Email:</label>
							<div class="formRight">
								<s:property value="user.email"/>
							</div>
						</div>
						<div class="formRow">
							<label>Password:</label>
							<div class="formRight">
								<s:property value="user.password"/>
							</div>
						</div>
						
					</div>
				</fieldset>
		</div>
<jsp:include page="/footer.jsp" />

</body>
</html>
