<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="css/main.css" rel="stylesheet" type="text/css">
<title>Algorithm Information</title>
</head>
<body>
<jsp:include page="/leftAndTop.jsp" />
    
    <!-- Title area -->
    <div class="titleArea">
        <div class="wrapper">
            <div class="pageTitle">
                <h5>Algorithm Information</h5>
                <span></span>
            </div>
        </div>
    </div>
    <div class="line"></div>
    
    <!-- Main content wrapper -->
    <div class="wrapper">
				<fieldset>
					<div class="widget">
						<s:if test="algorithm.publish=='no'">
						<div class="title">
								<a href="publishAlgorithm.action?alg_id=<s:property value="algorithm.alg_ID"/>"><input class="redB" type="button" value="Publish The Algorithm"></a>
						</div>
						</s:if>
						<div class="formRow">
							<label>Algorithm Name:</label>
							<div class="formRight">
								<s:property value="algorithm.alg_name"/>
							</div>
						</div>
						<div class="formRow">
							<label>Category:</label>
							<div class="formRight">
								<s:property value="algorithm.alg_category"/>
							</div>
						</div>
						<div class="formRow">
							<label>Tags:</label>
							<div class="formRight">
								<s:property value="algorithm.alg_tags"/>
							</div>
						</div>
						<div class="formRow">
							<label>Related Papers:</label>
							<div class="formRight">
								<s:property value="algorithm.alg_related_papers"/>
							</div>
						</div>
						<div class="formRow">
							<label>Description:</label>
							<div class="formRight">
								<s:property value="algorithm.alg_description" escape="false"/>
							</div>
						</div>
						<div class="formRow">
							<label>Related Picture:</label>
							<div class="formRight">
								<a href="relatedFile.action?type=pict&filePath=<s:property value="algorithm.alg_picture_server"/>"><s:property value="algorithm.alg_picture"/></a>
							</div>
						</div>
						<div class="formRow">
							<label>Related Files:</label>
							<div class="formRight">
								<a href="relatedFile.action?type=alg&filePath=<s:property value="algorithm.alg_filepath_server"/>"><s:property value="algorithm.alg_filepath"/></a>
							</div>
						</div>
						<div class="formRow">
							<label>Related Codes:</label>
							<div class="formRight">
								<a href="relatedFile.action?type=code&filePath=<s:property value="algorithm.alg_codepath_server"/>"><s:property value="algorithm.alg_codepath"/></a>
							</div>
						</div>
						<div class="formRow">
							<label>Suggest Price:</label>
							<div class="formRight">
								<s:property value="algorithm.alg_price"/>
							</div>
						</div>
						<div class="formRow">
							<label>Author Comments:</label>
							<div class="formRight">
								<s:property value="algorithm.author_comment"/>
							</div>
						</div>
						<div class="formRow">
							<label>Copyright:</label>
							<div class="formRight">
							<s:if test="algorithm.copyright=='true'">
								User agreed to the term of service!
							</s:if>
							<s:else>
								User did not agree to the term of service!
							</s:else>
								
							</div>
						</div>
						<div class="formRow">
							<label>Sale Option:</label>
							<div class="formRight">
							<s:if test="algorithm.saleOption=='true'">
								User only wants to sale the code at our web-site!
							</s:if>
							<s:else>
								User doesn't want to sale the code at just our web-site!
							</s:else>
							</div>
						</div>
						<div class="formRow">
							<label>Current Status:</label>
							<div class="formRight">
								<s:property value="algorithm.current_status"/>
							</div>
						</div>
						<div class="formRow">
							<label>Comments:</label>
							<div class="formRight">
								<s:property value="algorithm.admin_comment"/>
							</div>
						</div>
						<s:if test="algorithm.publish=='yes'">
						<div class="formRow">
							<label>Publish Status:</label>
							<div class="formRight">
								<font color="red"> Published </font>
							</div>
						</div>
						</s:if>
					</div>
				</fieldset>
		</div>
    
<jsp:include page="/footer.jsp" />

</body>
</html>
