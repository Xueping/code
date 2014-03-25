<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="css/main.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="ckeditor/ckeditor.js"></script>  
<script type="text/javascript" src="ckfinder/ckfinder.js"></script> 
<title>Test Editing</title>
</head>
<body>
<jsp:include page="/leftAndTop.jsp" />
    
    <!-- Title area -->
    <div class="titleArea">
        <div class="wrapper">
            <div class="pageTitle">
                <h5>Test Editing</h5>
                <span></span>
            </div>
        </div>
    </div>
    <div class="line"></div>
    
    <!-- Main content wrapper -->
    <div class="wrapper">
				<fieldset>
					<div class="widget">
						<div class="title"><h6>Algorithm Basic Information:</h6></div>
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
							<label>Admin Result:</label>
							<div class="formRight">
								<s:property value="algorithm.admin_result"/>
							</div>
						</div>
						<div class="formRow">
							<label>Current Status:</label>
							<div class="formRight">
								<s:property value="algorithm.current_status"/>
							</div>
						</div>
						<div class="line"></div>
						<div class="title"><h6>Reviews:</h6></div>
						<s:iterator value="reviews">
							<div class="line"></div>
							<div class="formRow">
								<label>Review Result:</label>
								<div class="formRight">
									<s:property value="status"/>
								</div>
							</div>
							<div class="formRow">
								<label>Review Comments:</label>
								<div class="formRight">
									<s:property value="results" escape="false"/>
								</div>
							</div>
							<div class="formRow">
								<label>Review Related Files:</label>
								<div class="formRight">
									<a href="relatedFile.action?type=rev&filePath=<s:property value="reviewFile_server"/>"><s:property value="reviewFile"/></a>
								</div>
							</div>
							<div class="formRow">
								<label>Suggest Price:</label>
								<div class="formRight">
									<s:property value="price"/>
								</div>
							</div>
						</s:iterator>
						<div class="line"></div>
						<div class="title"><h6>Testing Decision:</h6></div>
						<div class="line"></div>
					    <s:if test="test==true">
					    <form action="test_edit.action" method="post" enctype="multipart/form-data">
						    <input type="hidden" name="alg_id" value="<s:property value="algorithm.alg_ID"/>">
						    <input type="hidden" name="user_id" value="<s:property value="user.id"/>">
						    <div class="formRow">
								<label>Testing Comments:</label>
								<div class="formRight">
									<textarea name="comments" id="comments"><s:property value="algorithm.testing.results"/></textarea>
									<script type="text/javascript">    
			                            CKEDITOR.replace( 'comments' );    
			                        </script>  
								</div>
							</div>
							<div class="formRow">
								<label>Upload Testing Files:</label>
								<div class="formRight">
									<input type="file" name="test_file" id="test_file"/>
								</div>
							</div>
							<div class="formRow">
								<label>Suggest Price:</label>
								<div class="formRight">
									<input type="text" name="price" value="<s:property value="algorithm.alg_price"/>">
								</div>
							</div>
							<div class="formRow">
								<label>Edit Testing Result:</label>
								<div class="formRight">
									<s:select list="resultList"  name="result" id="result" value="algorithm.test_results"></s:select>
								</div>
							</div>
							<div class="formSubmit">
								<input class="redB" type="submit" value="submit">
							</div>	
						</form>
						</s:if>
						<s:else>
						<div class="formRow">
							<label>Testing Result:</label>
							<div class="formRight">
								<s:property value="current_test.status"/>
							</div>
						</div>
						<div class="formRow">
							<label>Testing Comments:</label>
							<div class="formRight">
								<s:property value="current_test.results" escape="false"/>
							</div>
						</div>
						<div class="formRow">
							<label>Testing Related Files:</label>
							<div class="formRight">
								<a href="relatedFile.action?type=test&filePath=<s:property value="current_test.testFile_server"/>"><s:property value="current_test.testFile"/></a>
							</div>
						</div>
						<div class="formRow">
							<label>Testing Suggest Price</label>
							<div class="formRight">
								<s:property value="current_test.price"/>
							</div>
						</div>
						</s:else>
						
					</div>
				</fieldset>
		</div>
<jsp:include page="/footer.jsp" />

</body>
</html>