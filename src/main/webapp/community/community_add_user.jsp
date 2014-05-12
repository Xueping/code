<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="css/main.css" rel="stylesheet" type="text/css">
<title>Add Community Users</title>
  <link rel="stylesheet" href="css/chosen.css">
  <style type="text/css" media="all">
    /* fix rtl for demo */
    .chosen-rtl .chosen-drop { left: -9000px; }
  </style>
</head>
<body>
<jsp:include page="/leftAndTop.jsp" />
    
    <!-- Title area -->
    <div class="titleArea">
        <div class="wrapper">
            <div class="pageTitle">
                <h5>Add Community Users</h5>
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
			<form class="form" action="community_add_user_submit.action" method="post">
				<fieldset>
					<div class="widget">
						<div class="title">
							<h6>Input every field</h6>
							
						</div>
						<div class="formRow">
							<label>Community Name:</label>
							<div class="formRight">
								<s:property  value="community.name"/>
							</div>
						</div>
						<div class="formRow">
							<label>Description</label>
							<div class="formRight">
								<s:property  value="community.description"/>
							</div>
						</div>
						<div class="formRow">
	                        <label>Community Admin:</label>
	                        <div class="formRight">
		                       <s:property  value="community.admin"/>
	                        </div>
                        </div>
                        <input type="hidden" name="comm_id" value="<s:property value="community.id"/>">
                        <div class="formRow">
	                        <label>Add Users:</label>
	                        <div class="formRight">
	                          <select style="width:750px;" name="users" multiple class="chosen-select" data-placeholder="Select Users...">
	                          	<s:iterator value="allUsers">
	                          		<s:if test="username==community.admin">
	                          		<option disabled value="<s:property value="id"/>"><s:property value="username"/></option>
	                          		</s:if>
	                          		<s:else>
	                          		<option value="<s:property value="id"/>"><s:property value="username"/></option>
	                          		</s:else>
	                          		
	                          	</s:iterator>
					          </select> 
	                        </div>
                        </div> 
						<div class="formSubmit">
							<input class="redB" type="submit" value="submit">
						</div>
					</div>
				</fieldset>
				  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.6.4/jquery.min.js" type="text/javascript"></script>
				  <script src="js/chosen.jquery.js" type="text/javascript"></script>
				  <script src="js/prism.js" type="text/javascript" charset="utf-8"></script>
				  <script type="text/javascript">
				    var config = {
				      '.chosen-select'           : {},
				      '.chosen-select-deselect'  : {allow_single_deselect:true},
				      '.chosen-select-no-single' : {disable_search_threshold:10},
				      '.chosen-select-no-results': {no_results_text:'Oops, nothing found!'},
				      '.chosen-select-width'     : {width:"95%"}
				    }
				    for (var selector in config) {
				      $(selector).chosen(config[selector]);
				    }
				  </script>
			</form>
		</div>
<jsp:include page="/footer.jsp" />

</body>
</html>