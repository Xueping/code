<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="css/main.css" rel="stylesheet" type="text/css">
<title>Algorithm Review Assigning</title>
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
                <h5>Algorithm Review Assigning </h5>
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
						<s:if test="algorithm.resubmit=='true'">
						<div class="formRow">
							<label>Resubmit Date:</label>
							<div class="formRight">
								<s:property value="algorithm.resubmit_date"/>
							</div>
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
						<s:if test="algorithm.resubmit=='true'">
						<div class="line"></div>
						<div class="title"><h6>Last Reviews:</h6></div>
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
								<label>Reviewer:</label>
								<div class="formRight">
									<a href="userDisplay.action?userName=<s:property value="user.username"/>"><s:property value="user.username"/></a>
								</div>
							</div>
						</s:iterator>
						</s:if>
						<s:else>
						<div class="formRow">
							<label>Review Result:</label>
							<div class="formRight">
								<s:property value="algorithm.review_result"/>
							</div>
						</div>
						</s:else>
						
						<s:if test="review==true">
						<div class="line"></div>
						<div class="title"><h6>Assign Reviewers:</h6></div>
						<div class="line"></div>
						<form action="review_add.action" method="get">
						<input type="hidden" name="alg_id" value="<s:property value="algorithm.alg_ID"/>">
						<div class="formRow">
	                        <label>Assign To:</label>
	                        <div class="formRight">
	                          <select style="width:750px;" name="reviewers" multiple class="chosen-select" data-placeholder="Select Reviewers...">
	                          	<s:iterator value="allUsers">
	                          		<s:if test="username==algorithm.author">
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
							
						</s:if>
					</div>
				</fieldset>
		</div>
<jsp:include page="/footer.jsp" />
<tester id="tags_tag_autosize_tester" style="position: absolute; top: -9999px; left: -9999px; width: auto; font-size: 11px; font-family: Arial,Helvetica,sans-serif; font-weight: 400; letter-spacing: 0px; white-space: nowrap;">ffff</tester>
</body>
</html>