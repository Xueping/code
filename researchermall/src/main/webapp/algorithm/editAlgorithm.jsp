<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Edit Algorithm</title>
<meta content="text/html; charset=utf-8" http-equiv="Content-Type">
<meta content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0" name="viewport">
<script type="text/javascript" src="ckeditor/ckeditor.js"></script>  
<script type="text/javascript" src="ckfinder/ckfinder.js"></script> 
<link type="text/css" rel="stylesheet" href="css/main.css">

<!-- input tag scripts and style -->
<script type="text/javascript"
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.5.2/jquery.min.js"></script>
<script type="text/javascript"
	src="http://xoxco.com/projects/code/tagsinput/jquery.tagsinput.js"></script>
<script type='text/javascript'
	src='https://ajax.googleapis.com/ajax/libs/jqueryui/1.8.13/jquery-ui.min.js'></script>
<link rel="stylesheet" type="text/css" href="css/jquery-ui.css" />
<script type="text/javascript">
	function onAddTag(tag) {
		alert("Added a tag: " + tag);
	}
	function onRemoveTag(tag) {
		alert("Removed a tag: " + tag);
	}

	function onChangeTag(input, tag) {
		alert("Changed a tag: " + tag);
	}

	$(function() {

		$('#tags_1').tagsInput({
			width : 'auto'
		});

	});
</script>
<!-- end input tag scripts and style -->

</head>

<body>
<jsp:include page="/leftAndTop.jsp" />
    
    <!-- Title area -->
    <div class="titleArea">
        <div class="wrapper">
            <div class="pageTitle">
                <h5>Edit Algorithm</h5>
                <span>
	                <font color="red" >
			            <s:property value="errorMsg"/>
		            </font>
                </span>
            </div>
        </div>
    </div>
    <div class="line"></div>
    
    <!-- Main content wrapper -->
    <div class="wrapper">
			<!-- Form -->
			<form class="form" action="editAlgorithm_submit.action" method="post" enctype="multipart/form-data">
			<input type="hidden" name="alg_id" value="<s:property value="algorithm.alg_ID"/>">
				<fieldset>
					<div class="widget">
						<div class="title">
							<h6>Input every field</h6>
						</div>
						<div class="formRow">
							<label>Algorithm Name:</label>
							<div class="formRight">
								<input type="text" name="algorithm.alg_name" value="<s:property value="algorithm.alg_name"/>">
							</div>
						</div>
						<div class="formRow">
							<label>Category</label>
							<div class="formRight">
								<input type="text" name="algorithm.alg_category" value="<s:property value="algorithm.alg_category"/>">
							</div>
						</div>
						 <div class="formRow">
	                        <label for="tags">Tags:</label>
	                        <div class="formRight">
	                        	<input id="tags_1" type="text" class="tags" name="algorithm.alg_tags" value="<s:property value="algorithm.alg_category"/>"/>
	                        </div>
	                    </div>   
						<div class="formRow">
							<label>Related Papers:</label>
							<div class="formRight">
								<textarea class="autoGrow" name="algorithm.alg_related_papers" cols="" rows="8"
									style="overflow: hidden; word-wrap: break-word; resize: horizontal; "><s:property value="algorithm.alg_category"/></textarea>
							</div>
						</div>
						<div class="formRow">
							<label>Description:</label>
							<div class="formRight">
								<textarea name="algorithm.alg_description" id="alg_description"></textarea>
							</div>
						</div>
						<script type="text/javascript">    
							CKEDITOR.replace( 'alg_description');
							CKEDITOR.instances.alg_description.setData('<s:property value="algorithm.alg_description"  escape="false"/>');
					    </script>
						<div class="formRow">
							<label>Suggest Price:</label>
							<div class="formRight">
								<input type="text" name="algorithm.alg_price" value="<s:property value="algorithm.alg_price"/>">
							</div>
						</div>
					    <div class="formRow">
							<label>Upload Picture:</label>
							<div class="formRight">
								<a href="relatedFile.action?type=pict&filePath=<s:property value="algorithm.alg_picture_server"/>"><s:property value="algorithm.alg_picture"/></a>
								<p>Submit new version of Picture:<input type="file" name="alg_picture_file" id="alg_picture_file"/>
							</div>
						</div>
						 <div class="formRow">
							<label>Upload Files:</label>
							<div class="formRight">
								<a href="relatedFile.action?type=alg&filePath=<s:property value="algorithm.alg_filepath_server"/>"><s:property value="algorithm.alg_filepath"/></a>
								<p>Submit new version of Files:<input type="file" name="alg_related_file" id="alg_related_file"/>
							</div>
						</div>
						<div class="formRow">
							<label>Upload Codes:</label>
							<div class="formRight">
								<a href="relatedFile.action?type=code&filePath=<s:property value="algorithm.alg_codepath_server"/>"><s:property value="algorithm.alg_codepath"/></a>
								<p>Submit new version of Codes:<input type="file" name="alg_code_file" id="alg_code_file"/>
							</div>
						</div>
						<div class="formRow">
							<label>Author Comments:</label>
							<div class="formRight">
								<textarea class="autoGrow" name="algorithm.author_comment" cols="" rows="8"
									style="overflow: hidden; word-wrap: break-word; resize: horizontal; "><s:property value="algorithm.author_comment"/></textarea>
							</div>
						</div>
						<div class="formRow">
	                        <label>Sale Option:</label>
	                        <div class="formRight">
	                        	<s:if test="algorithm.saleOption=='true'">
	                            	<input type="checkbox" name="algorithm.saleOption" checked value="true" id="algorithm.saleOption"/> Please read the Sale Option (1. Only sell it on our website. (commission: 30%) 2. Want or already sell it on other website. (commission: 60%))
	                            </s:if>
	                            <s:else>
	                            	<input type="checkbox" name="algorithm.saleOption" value="true" id="algorithm.saleOption"/> Please read the Sale Option (1. Only sell it on our website. (commission: 30%) 2. Want or already sell it on other website. (commission: 60%))
	                            </s:else>
	                        </div>
	                    </div>
						<div class="formRow">
	                        <label>Copyright:</label>
	                        <div class="formRight">
	                        <s:if test="algorithm.copyright=='true'">	
	                            <input type="checkbox" name="algorithm.copyright" checked value="true" id="algorithm.copyright"/> Please read the terms of service!
	                        </s:if>
	                        <s:else>
	                            <input type="checkbox" name="algorithm.copyright" checked value="true" id="algorithm.copyright"/> Please read the terms of service!
	                        </s:else>
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
