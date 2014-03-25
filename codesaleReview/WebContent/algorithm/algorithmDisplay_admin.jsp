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
								<s:property value="algorithm.copyright"/>
							</div>
						</div>
						<div class="formRow">
							<label>Sale Option:</label>
							<div class="formRight">
								<s:property value="algorithm.saleOption"/>
							</div>
						</div>
						<div class="formRow">
							<label>Admin Result:</label>
							<div class="formRight">
								<s:property value="algorithm.admin_result"/>
							</div>
						</div>
						
						<s:if test="acceptalbe==true">
						<div class="formRow">
							<label>Review Result:</label>
							<div class="formRight">
								<s:property value="algorithm.review_result"/>
							</div>
						</div>
						<div class="formRow">
							<label>Review Comments:</label>
							<div class="formRight">
								<s:property value="algorithm.review.results" escape="false"/>
							</div>
						</div>
						<div class="formRow">
							<label>Review Related Files:</label>
							<div class="formRight">
								<a href="relatedFile.action?type=rev&filePath=<s:property value="algorithm.review.reviewFile_server"/>"><s:property value="algorithm.review.reviewFile"/></a>
							</div>
						</div>
						<div class="formRow">
							<label>Testing Result:</label>
							<div class="formRight">
								<s:property value="algorithm.test_results"/>
							</div>
						</div>
						<div class="formRow">
							<label>Testing Comments:</label>
							<div class="formRight">
								<s:property value="algorithm.testing.results" escape="false"/>
							</div>
						</div>
						<div class="formRow">
							<label>Testing Related Files:</label>
							<div class="formRight">
								<a href="relatedFile.action?type=test&filePath=<s:property value="algorithm.testing.testFile_server"/>"><s:property value="algorithm.testing.testFile"/></a>
							</div>
						</div>
						</s:if>
						<s:if test="admin==true&&acceptalbe==false">
						<form action="algAdminRst.action" method="get">
						<input type="hidden" name="alg_id" value="<s:property value="algorithm.alg_ID"/>">
						<div class="formRow">
							<label>Admin Comments:</label>
							<div class="formRight">
								<textarea class="autoGrow" name="adminComment" cols="140" rows="8"
									style="overflow: hidden; word-wrap: break-word; resize: horizontal; "></textarea>
							</div>
						</div>
						<div class="formRow">
							<label>Edit Admin Result:</label>
							<div class="formRight">
								<s:select list="resultList"  name="adminResult" id="adminResult" value="algorithm.admin_result"></s:select>
							</div>
						</div>
						<div class="formSubmit">
							<input class="redB" type="submit" value="submit">
						</div>
						</form>
							
						</s:if>
					</div>
				</fieldset>
		</div>
    
<jsp:include page="/footer.jsp" />

</body>
</html>
