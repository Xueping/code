<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="css/main.css" rel="stylesheet" type="text/css">
<title>Code Review</title>

<script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
<script src="//ajax.googleapis.com/ajax/libs/jqueryui/1.10.4/jquery-ui.min.js"></script>
<script src="js/custom.js" type="text/javascript"></script>
</head>
<body>
<jsp:include page="/leftAndTop.jsp" />
    
    <!-- Title area -->
    <div class="titleArea">
        <div class="wrapper">
            <div class="pageTitle">
                <h5>Dashboard</h5>
                <span></span>
            </div>
        </div>
    </div>
    <div class="line"></div>
    
    <!-- Main content wrapper -->
    <div class="wrapper">
    
		<s:if test="admin==true">     
        <!-- Note -->
        <div class="nNote nInformation hideit">
            <p><strong>INFORMATION: </strong> <s:property value="length_WaitingAdminList"/> new algorithms, <s:property value="length_ReviewWaitingList"/> algorithms waiting for review, 
            	<s:property value="length_TestingWaitingList"/> algorithms waiting for test, <s:property value="length_ResubmitList"/> resubmit algorithms.</p>
        </div>
        </s:if>
        <!-- Widgets -->
        <div class="fluid">
        	<s:if test="currentUser.admin=='yes'">    
            <div class="span6">
             	<!-- New Algorithms and Resubmit Algorithms -->
            	<div class="widget">  
            	    <div class="title"><h6>Algorithms</h6></div>
                    <div class="tabs tabs-sortable ui-tabs ui-widget ui-widget-content ui-corner-all">
                        <ul class="ui-tabs-nav ui-helper-reset ui-helper-clearfix ui-widget-header ui-corner-all" role="tablist">
                            <li class="ui-state-default ui-corner-top ui-tabs-active ui-state-active" role="tab" tabindex="0" aria-controls="tabs-1" aria-labelledby="ui-id-2" aria-selected="true"><a href="#tabs-1" class="ui-tabs-anchor" role="presentation" tabindex="-1" id="ui-id-2">New (<s:property value="length_WaitingAdminList"/>)</a></li>
                            <li class="ui-state-default ui-corner-top" role="tab" tabindex="-1" aria-controls="tabs-2" aria-labelledby="ui-id-3" aria-selected="false"><a href="#tabs-2" class="ui-tabs-anchor" role="presentation" tabindex="-1" id="ui-id-3">Resubmit (<s:property value="length_ResubmitList"/>)</a></li>
                        </ul>
                        <div id="tabs-1" aria-labelledby="ui-id-2" class="ui-tabs-panel ui-widget-content ui-corner-bottom" role="tabpanel" aria-expanded="true" aria-hidden="false" style="display: block;">
   							<table width="100%" cellspacing="0" cellpadding="0" class="sTable">
		                        <thead>
		                            <tr>
		                            	<td width="40">ID</td>
		                            	<td>Name</td>
		                            	<td width="75">User</td>
		                            	<td width="75">Submit Date</td>
		                            </tr>
		                        </thead>
		                        <tbody>
		                            <s:iterator value="waitingAdminList">
								    <tr>
								    	<td align="center"><a class="webStatsLink" href="alg_display.action?id=<s:property value="alg_ID"/>"><s:property value="alg_ID"/></a></td>
			    						<td><s:property value="alg_name"/></td>
			    						<td><a href="userDisplay.action?userName=<s:property value="author"/>"><s:property value="author"/></a></td>
			    						<td><s:property value="submit_date"/></td>
									</tr>
								  </s:iterator>
		                        </tbody>
		                    </table>  
                        </div>
                        <div id="tabs-2" aria-labelledby="ui-id-3" class="ui-tabs-panel ui-widget-content ui-corner-bottom" role="tabpanel" style="display: none;" aria-expanded="false" aria-hidden="true">
                            <table width="100%" cellspacing="0" cellpadding="0" class="sTable">
		                        <thead>
		                            <tr>
		                            	<td width="30">ID</td>
		                            	<td>Name</td>
		                            	<td width="75">Resubmit Date</td>
		                            	<td width="75">User</td>
		                            	<td width="100">Status</td>
		                            </tr>
		                        </thead>
		                        <tbody>
		                            <s:iterator value="resubmitList">
								    <tr>
								    	<td align="center"><a class="webStatsLink" href="display_revise.action?id=<s:property value="alg_ID"/>"><s:property value="alg_ID"/></a></td>
			    						<td><s:property value="alg_name"/></td>
			    						<td><s:property value="resubmit_date"/></td>
			    						<td><a href="userDisplay.action?userName=<s:property value="author"/>"><s:property value="author"/></a></td>
			    						<td><s:property value="current_status"/></td>
									</tr>
								  </s:iterator>
		                        </tbody>
		                    </table> 
                        </div>
                    </div>
                </div>
            	<!-- Review List -->
                <div class="widget">   
                 	<div class="title"><h6>Review List</h6></div>    
                    <div class="tabs tabs-sortable ui-tabs ui-widget ui-widget-content ui-corner-all">
                        <ul class="ui-tabs-nav ui-helper-reset ui-helper-clearfix ui-widget-header ui-corner-all" role="tablist">
                            <li class="ui-state-default ui-corner-top ui-tabs-active ui-state-active" role="tab" tabindex="0" aria-controls="tabs-1" aria-labelledby="ui-id-2" aria-selected="true"><a href="#tabs-1" class="ui-tabs-anchor" role="presentation" tabindex="-1" id="ui-id-2">Waiting (<s:property value="length_ReviewWaitingList"/>)</a></li>
                            <li class="ui-state-default ui-corner-top" role="tab" tabindex="-1" aria-controls="tabs-2" aria-labelledby="ui-id-3" aria-selected="false"><a href="#tabs-2" class="ui-tabs-anchor" role="presentation" tabindex="-1" id="ui-id-3">Ongoing (<s:property value="length_ReviewOngoingList"/>)</a></li>
                            <li class="ui-state-default ui-corner-top" role="tab" tabindex="-1" aria-controls="tabs-3" aria-labelledby="ui-id-4" aria-selected="false"><a href="#tabs-3" class="ui-tabs-anchor" role="presentation" tabindex="-1" id="ui-id-4">Done (<s:property value="length_ReviewDoneList"/>)</a></li>
                        </ul>
                        <div id="tabs-1" aria-labelledby="ui-id-2" class="ui-tabs-panel ui-widget-content ui-corner-bottom" role="tabpanel" aria-expanded="true" aria-hidden="false" style="display: block;">
   							<table width="100%" cellspacing="0" cellpadding="0" class="sTable">
		                        <thead>
		                            <tr>
		                            	<td width="40">ID</td>
		                            	<td>Name</td>
		                            	<td width="75">Submit Date</td>
		                            	<td width="120">Status</td>
		                            </tr>
		                        </thead>
		                        <tbody>
		                            <s:iterator value="reviewWaitingList">
								    <tr>
								    	<td align="center"><a class="webStatsLink" href="review_display_add.action?alg_id=<s:property value="alg_ID"/>"><s:property value="alg_ID"/></a></td>
			    						<td><s:property value="alg_name"/></td>
			    						<td><s:property value="submit_date"/></td>
			    						<td><s:property value="current_status"/></td>
									</tr>
								  </s:iterator>
		                        </tbody>
		                    </table>  
                        </div>
                        <div id="tabs-2" aria-labelledby="ui-id-3" class="ui-tabs-panel ui-widget-content ui-corner-bottom" role="tabpanel" style="display: none;" aria-expanded="false" aria-hidden="true">
                            <table width="100%" cellspacing="0" cellpadding="0" class="sTable">
		                        <thead>
		                            <tr>
		                            	<td width="40">ID</td>
		                            	<td>Name</td>
		                            	<td width="75">Submit Date</td>
		                            	<td width="120">Status</td>
		                            </tr>
		                        </thead>
		                        <tbody>
		                            <s:iterator value="reviewOngoingList">
								    <tr>
								    	<td align="center"><a class="webStatsLink" href="review_ongoing.action?alg_id=<s:property value="alg_ID"/>"><s:property value="alg_ID"/></a></td>
			    						<td><s:property value="alg_name"/></td>
			    						<td><s:property value="submit_date"/></td>
			    						<td><s:property value="current_status"/></td>
									</tr>
								  </s:iterator>
		                        </tbody>
		                    </table>  
                        </div>
                        <div id="tabs-3" aria-labelledby="ui-id-4" class="ui-tabs-panel ui-widget-content ui-corner-bottom" role="tabpanel" style="display: none;" aria-expanded="false" aria-hidden="true">
                            <table width="100%" cellspacing="0" cellpadding="0" class="sTable">
		                        <thead>
		                            <tr>
		                            	<td width="40">ID</td>
		                            	<td>Name</td>
		                            	<td width="75">Submit Date</td>
		                            	<td width="120">Status</td>
		                            </tr>
		                        </thead>
		                        <tbody>
		                            <s:iterator value="reviewDoneList">
								    <tr>
								    	<td align="center"><a class="webStatsLink" href="review_done.action?alg_id=<s:property value="alg_ID"/>"><s:property value="alg_ID"/></a></td>
			    						<td><s:property value="alg_name"/></td>
			    						<td><s:property value="submit_date"/></td>
			    						<td><s:property value="current_status"/></td>
									</tr>
								  </s:iterator>
		                        </tbody>
		                    </table> 
                        </div>
                    </div>
                </div>
                
                <!-- Test List -->
                <div class="widget">   
                 	<div class="title"><h6>Testing List</h6></div>    
                    <div class="tabs tabs-sortable ui-tabs ui-widget ui-widget-content ui-corner-all">
                        <ul class="ui-tabs-nav ui-helper-reset ui-helper-clearfix ui-widget-header ui-corner-all" role="tablist">
                            <li class="ui-state-default ui-corner-top ui-tabs-active ui-state-active" role="tab" tabindex="0" aria-controls="tabs-1" aria-labelledby="ui-id-2" aria-selected="true"><a href="#tabs-1" class="ui-tabs-anchor" role="presentation" tabindex="-1" id="ui-id-2">Waiting (<s:property value="length_TestingWaitingList"/>)</a></li>
                            <li class="ui-state-default ui-corner-top" role="tab" tabindex="-1" aria-controls="tabs-2" aria-labelledby="ui-id-3" aria-selected="false"><a href="#tabs-2" class="ui-tabs-anchor" role="presentation" tabindex="-1" id="ui-id-3">Ongoing (<s:property value="length_TestingOngoingList"/>)</a></li>
                            <li class="ui-state-default ui-corner-top" role="tab" tabindex="-1" aria-controls="tabs-3" aria-labelledby="ui-id-4" aria-selected="false"><a href="#tabs-3" class="ui-tabs-anchor" role="presentation" tabindex="-1" id="ui-id-4">Done (<s:property value="length_TestingDoneList"/>)</a></li>
                        </ul>
                        <div id="tabs-1" aria-labelledby="ui-id-2" class="ui-tabs-panel ui-widget-content ui-corner-bottom" role="tabpanel" aria-expanded="true" aria-hidden="false" style="display: block;">
   							<table width="100%" cellspacing="0" cellpadding="0" class="sTable">
		                        <thead>
		                            <tr>
		                            	<td width="40">ID</td>
		                            	<td>Name</td>
		                            	<td width="75">Submit Date</td>
		                            	<td width="120">Status</td>
		                            </tr>
		                        </thead>
		                        <tbody>
		                            <s:iterator value="testingWaitingList">
								    <tr>
								    	<td align="center"><a class="webStatsLink" href="test_display_add.action?alg_id=<s:property value="alg_ID"/>"><s:property value="alg_ID"/></a></td>
			    						<td><s:property value="alg_name"/></td>
			    						<td><s:property value="submit_date"/></td>
			    						<td><s:property value="current_status"/></td>
									</tr>
								  </s:iterator>
		                        </tbody>
		                    </table>   
                        </div>
                        <div id="tabs-2" aria-labelledby="ui-id-3" class="ui-tabs-panel ui-widget-content ui-corner-bottom" role="tabpanel" style="display: none;" aria-expanded="false" aria-hidden="true">
                            <table width="100%" cellspacing="0" cellpadding="0" class="sTable">
		                        <thead>
		                            <tr>
		                            	<td width="40">ID</td>
		                            	<td>Name</td>
		                            	<td width="75">Submit Date</td>
		                            	<td width="120">Status</td>
		                            </tr>
		                        </thead>
		                        <tbody>
		                            <s:iterator value="testingOngoingList">
								    <tr>
								    	<td align="center"><a class="webStatsLink" href="test_ongoing.action?alg_id=<s:property value="alg_ID"/>"><s:property value="alg_ID"/></a></td>
			    						<td><s:property value="alg_name"/></td>
			    						<td><s:property value="submit_date"/></td>
			    						<td><s:property value="current_status"/></td>
									</tr>
								  </s:iterator>
		                        </tbody>
		                    </table>   
                        </div>
                        <div id="tabs-3" aria-labelledby="ui-id-4" class="ui-tabs-panel ui-widget-content ui-corner-bottom" role="tabpanel" style="display: none;" aria-expanded="false" aria-hidden="true">
                            <table width="100%" cellspacing="0" cellpadding="0" class="sTable">
		                        <thead>
		                            <tr>
		                            	<td width="40">ID</td>
		                            	<td>Name</td>
		                            	<td width="75">Submit Date</td>
		                            	<td width="120">Status</td>
		                            </tr>
		                        </thead>
		                        <tbody>
		                            <s:iterator value="testingDoneList">
								    <tr>
								    	<td align="center"><a class="webStatsLink" href="test_done.action?alg_id=<s:property value="alg_ID"/>"><s:property value="alg_ID"/></a></td>
			    						<td><s:property value="alg_name"/></td>
			    						<td><s:property value="submit_date"/></td>
			    						<td><s:property value="current_status"/></td>
									</tr>
								  </s:iterator>
		                        </tbody>
		                    </table> 
                        </div>
                    </div>
                </div>
                
                <!-- Publish Waiting and Reject List -->
                <div class="widget">   
                 	<div class="title"><h6>Final List</h6></div>    
                    <div class="tabs tabs-sortable ui-tabs ui-widget ui-widget-content ui-corner-all">
                        <ul class="ui-tabs-nav ui-helper-reset ui-helper-clearfix ui-widget-header ui-corner-all" role="tablist">
                            <li class="ui-state-default ui-corner-top ui-tabs-active ui-state-active" role="tab" tabindex="0" aria-controls="tabs-1" aria-labelledby="ui-id-2" aria-selected="true"><a href="#tabs-1" class="ui-tabs-anchor" role="presentation" tabindex="-1" id="ui-id-2">Publish Waiting List (<s:property value="length_PublishWaitingList"/>)</a></li>
                            <li class="ui-state-default ui-corner-top" role="tab" tabindex="-1" aria-controls="tabs-2" aria-labelledby="ui-id-3" aria-selected="false"><a href="#tabs-2" class="ui-tabs-anchor" role="presentation" tabindex="-1" id="ui-id-3">Published List (<s:property value="length_PublishedList"/>)</a></li>
                            <li class="ui-state-default ui-corner-top" role="tab" tabindex="-1" aria-controls="tabs-3" aria-labelledby="ui-id-4" aria-selected="false"><a href="#tabs-3" class="ui-tabs-anchor" role="presentation" tabindex="-1" id="ui-id-4">Rejected List (<s:property value="length_RejectList"/>)</a></li>
                        </ul>
                        <div id="tabs-1" aria-labelledby="ui-id-2" class="ui-tabs-panel ui-widget-content ui-corner-bottom" role="tabpanel" aria-expanded="true" aria-hidden="false" style="display: block;">
   							<table width="100%" cellspacing="0" cellpadding="0" class="sTable">
		                        <thead>
		                            <tr>
		                            	<td width="40">ID</td>
		                            	<td>Name</td>
		                            	<td width="75">Submit Date</td>
		                            	<td width="120">Status</td>
		                            </tr>
		                        </thead>
		                        <tbody>
		                            <s:iterator value="publishWaitingList">
								    <tr>
								    	<td align="center"><a class="webStatsLink" href="display_publish.action?id=<s:property value="alg_ID"/>"><s:property value="alg_ID"/></a></td>
			    						<td><s:property value="alg_name"/></td>
			    						<td><s:property value="submit_date"/></td>
			    						<td><s:property value="current_status"/></td>
									</tr>
								  </s:iterator>
		                        </tbody>
		                    </table>   
                        </div>
                        <div id="tabs-2" aria-labelledby="ui-id-3" class="ui-tabs-panel ui-widget-content ui-corner-bottom" role="tabpanel" style="display: none;" aria-expanded="false" aria-hidden="true">
                               <table width="100%" cellspacing="0" cellpadding="0" class="sTable">
		                        <thead>
		                            <tr>
		                            	<td width="40">ID</td>
		                            	<td>Name</td>
		                            	<td width="75">Submit Date</td>
		                            	<td width="120">Status</td>
		                            </tr>
		                        </thead>
		                        <tbody>
		                            <s:iterator value="publishedList">
								    <tr>
								    	<td align="center"><a class="webStatsLink" href="display_publish.action?id=<s:property value="alg_ID"/>"><s:property value="alg_ID"/></a></td>
			    						<td><s:property value="alg_name"/></td>
			    						<td><s:property value="submit_date"/></td>
			    						<td><s:property value="current_status"/></td>
									</tr>
								  </s:iterator>
		                        </tbody>
		                    </table> 
                        </div>
                        <div id="tabs-3" aria-labelledby="ui-id-4" class="ui-tabs-panel ui-widget-content ui-corner-bottom" role="tabpanel" style="display: none;" aria-expanded="false" aria-hidden="true">
                            <table width="100%" cellspacing="0" cellpadding="0" class="sTable">
		                        <thead>
		                            <tr>
		                            	<td width="40">ID</td>
		                            	<td>Name</td>
		                            	<td width="75">Submit Date</td>
		                            	<td width="120">Status</td>
		                            </tr>
		                        </thead>
		                        <tbody>
		                            <s:iterator value="rejectList">
								    <tr>
								    	<td align="center"><a class="webStatsLink" href="test_ongoing.action?alg_id=<s:property value="alg_ID"/>"><s:property value="alg_ID"/></a></td>
			    						<td><s:property value="alg_name"/></td>
			    						<td><s:property value="submit_date"/></td>
			    						<td><s:property value="current_status"/></td>
									</tr>
								  </s:iterator>
		                        </tbody>
		                    </table>
                        </div>
                    </div>
                </div>
            </div>
        
        	<!-- 2 columns widgets -->
            <div class="span6">
                <!-- All Algorithms -->
                <div class="widget">
                    <div class="title"><h6>Latest Algorithms</h6></div>
                    <table width="100%" cellspacing="0" cellpadding="0" class="sTable">
                        <thead>
                            <tr>
                            	<td width="30">ID</td>
                            	<td>Name</td>
                            	<td width="75">Submit Date</td>
                            	<td width="75">User</td>
                            	<td width="100">Status</td>
                            </tr>
                        </thead>
                        <tbody>
                            <s:iterator value="algorithms">
						    <tr>
						    	<td align="center"><a class="webStatsLink" href="alg_display.action?id=<s:property value="alg_ID"/>"><s:property value="alg_ID"/></a></td>
	    						<td><s:property value="alg_name"/></td>
	    						<td><s:property value="submit_date"/></td>
	    						<td><a href="userDisplay.action?userName=<s:property value="author"/>"><s:property value="author"/></a></td>
	    						<td><s:property value="current_status"/></td>
							</tr>
						  </s:iterator>
                        </tbody>
                    </table>   
                </div>	
            </div>
            </s:if>
            <s:else>
            <div class="span6">
               <!-- My Reviews -->
                <div class="widget">
                    <div class="title"><h6>My Reviews</h6></div>
                    <table width="100%" cellspacing="0" cellpadding="0" class="sTable">
                        <thead>
                            <tr>
                            	<td width="40">ID</td>
                            	<td>Name</td>
                            	<td width="75">Submit Date</td>
                            	<td width="120">Status</td>
                            </tr>
                        </thead>
                        <tbody>
                            <s:iterator value="myReviewAlgorithms">
						    <tr>
						    	<td align="center"><a class="webStatsLink" href="review_display_edit.action?alg_id=<s:property value="alg_ID"/>"><s:property value="alg_ID"/></a></td>
	    						<td><s:property value="alg_name"/></td>
	    						<td><s:property value="submit_date"/></td>
	    						<td><s:property value="review.status"/></td>
							</tr>
						  </s:iterator>
                        </tbody>
                    </table>   
                </div>	
                <!-- My Tests-->
                <div class="widget">
                    <div class="title"><h6>My Tests</h6></div>
                    <table width="100%" cellspacing="0" cellpadding="0" class="sTable">
                        <thead>
                            <tr>
                            	<td width="40">ID</td>
                            	<td>Name</td>
                            	<td width="75">Submit Date</td>
                            	<td width="120">Status</td>
                            </tr>
                        </thead>
                        <tbody>
                            <s:iterator value="myTestingAlgorithms">
						    <tr>
						    	<td align="center"><a class="webStatsLink" href="test_display_edit.action?alg_id=<s:property value="alg_ID"/>"><s:property value="alg_ID"/></a></td>
	    						<td><s:property value="alg_name"/></td>
	    						<td><s:property value="submit_date"/></td>
	    						<td><s:property value="testing.status"/></td>
							</tr>
						  </s:iterator>
                        </tbody>
                    </table>   
                </div>
                	
            </div>
        
        	<!-- 2 columns widgets -->
            <div class="span6">
         		<!-- My Algorithms -->
                <div class="widget">
                    <div class="title"><h6>My Algorithms</h6></div>
                    <table width="100%" cellspacing="0" cellpadding="0" class="sTable">
                        <thead>
                            <tr>
                            	<td width="40">ID</td>
                            	<td>Name</td>
                            	<td width="75">Submit Date</td>
                            	<td width="120">Status</td>
                            </tr>
                        </thead>
                        <tbody>
                            <s:iterator value="myAllAlgorithms">
						    <tr>
						    	<td align="center"><a class="webStatsLink" href="display.action?id=<s:property value="alg_ID"/>"><s:property value="alg_ID"/></a></td>
	    						<td><s:property value="alg_name"/></td>
	    						<td><s:property value="submit_date"/></td>
	    						<td><s:property value="current_status"/></td>
							</tr>
						  </s:iterator>
                        </tbody>
                    </table>   
                </div>	
                <s:if test="currentUser.publisher=='yes'">
                <!-- Publish Waiting List -->
                <div class="widget">   
                 	<div class="title"><h6>Publish List</h6></div>    
                    <div class="tabs tabs-sortable ui-tabs ui-widget ui-widget-content ui-corner-all">
                        <ul class="ui-tabs-nav ui-helper-reset ui-helper-clearfix ui-widget-header ui-corner-all" role="tablist">
                            <li class="ui-state-default ui-corner-top ui-tabs-active ui-state-active" role="tab" tabindex="0" aria-controls="tabs-1" aria-labelledby="ui-id-2" aria-selected="true"><a href="#tabs-1" class="ui-tabs-anchor" role="presentation" tabindex="-1" id="ui-id-2">Waiting List (<s:property value="length_PublishWaitingList"/>)</a></li>
                            <li class="ui-state-default ui-corner-top" role="tab" tabindex="-1" aria-controls="tabs-2" aria-labelledby="ui-id-3" aria-selected="false"><a href="#tabs-2" class="ui-tabs-anchor" role="presentation" tabindex="-1" id="ui-id-3">Published List (<s:property value="length_PublishedList"/>)</a></li>
                        </ul>
                        <div id="tabs-1" aria-labelledby="ui-id-2" class="ui-tabs-panel ui-widget-content ui-corner-bottom" role="tabpanel" aria-expanded="true" aria-hidden="false" style="display: block;">
   							<table width="100%" cellspacing="0" cellpadding="0" class="sTable">
			                     <thead>
			                         <tr>
			                         	<td width="40">ID</td>
			                         	<td>Name</td>
			                         	<td width="75">Submit Date</td>
			                         	<td width="120">Status</td>
			                         </tr>
			                     </thead>
			                     <tbody>
			                         <s:iterator value="publishWaitingList">
									    <tr>
									    	<td align="center"><a class="webStatsLink" href="display_publish.action?id=<s:property value="alg_ID"/>"><s:property value="alg_ID"/></a></td>
						  						<td><s:property value="alg_name"/></td>
						  						<td><s:property value="submit_date"/></td>
						  						<td><s:property value="current_status"/></td>
										</tr>
									  </s:iterator>
			                     </tbody>
			                 </table>    
                        </div>
                        <div id="tabs-2" aria-labelledby="ui-id-3" class="ui-tabs-panel ui-widget-content ui-corner-bottom" role="tabpanel" style="display: none;" aria-expanded="false" aria-hidden="true">
                            <table width="100%" cellspacing="0" cellpadding="0" class="sTable">
		                        <thead>
		                            <tr>
		                            	<td width="40">ID</td>
		                            	<td>Name</td>
		                            	<td width="75">Submit Date</td>
		                            	<td width="120">Status</td>
		                            </tr>
		                        </thead>
		                        <tbody>
		                            <s:iterator value="publishedList">
								    <tr>
								    	<td align="center"><a class="webStatsLink" href="display_publish.action?id=<s:property value="alg_ID"/>"><s:property value="alg_ID"/></a></td>
			    						<td><s:property value="alg_name"/></td>
			    						<td><s:property value="submit_date"/></td>
			    						<td><s:property value="current_status"/></td>
									</tr>
								  </s:iterator>
		                        </tbody>
		                    </table>   
                        </div>
                    </div>
                </div>
                </s:if>
            </div>
            </s:else>
        </div>
    </div>

<jsp:include page="/footer.jsp" />

</body>
</html>