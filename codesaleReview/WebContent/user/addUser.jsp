<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="css/main.css" rel="stylesheet" type="text/css">
<title>Add New User</title>
</head>
<body>
<jsp:include page="/leftAndTop.jsp" />
    
    <!-- Title area -->
    <div class="titleArea">
        <div class="wrapper">
            <div class="pageTitle">
                <h5>Add New User</h5>
                <span>
                	<font color="red" >
			            <s:property value="userExist"/>
		            </font></span>
            </div>
        </div>
    </div>
    <div class="line"></div>
    
    <!-- Main content wrapper -->
    <div class="wrapper">
			<!-- Form -->
			<form class="form" action="Register_submit.action" method="post">
				<fieldset>
					<div class="widget">
						<div class="title">
							<h6>Input every field</h6>
							
						</div>
						<div class="formRow">
							<label>UserName:</label>
							<div class="formRight">
								<input type="text" name="currentUser.username">
							</div>
						</div>
						<div class="formRow">
							<label>Password</label>
							<div class="formRight">
								<input type="text" name="currentUser.password">
							</div>
						</div>
						<div class="formRow">
							<label>FirstName:</label>
							<div class="formRight">
								<input type="text" name="currentUser.firstName">
							</div>
						</div>
						<div class="formRow">
							<label>LastName:</label>
							<div class="formRight">
								<input type="text" name="currentUser.lastName">
							</div>
						</div>
						<div class="formRow">
							<label>Email:</label>
							<div class="formRight">
								<input type="text" name="currentUser.email">
							</div>
						</div>
						<div class="formRow">
							<label>Research Arae:</label>
							<div class="formRight">
								<input type="text" name="currentUser.research">
							</div>
						</div>
						<div class="formRow">
							<label>Organization:</label>
							<div class="formRight">
								<input type="text" name="currentUser.organization">
							</div>
						</div>
						<div class="formRow">
							<label>Country:</label>
							<div class="formRight">
								<input type="text" name="currentUser.country">
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