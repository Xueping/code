<%@ page language="java" import="uts.codesale.security.*" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<div id="leftSide">
    <div class="logo"><a href="home.jsp"><img alt="" src="images/logo_RM_white.png"></a></div>
    
    <div class="sidebarSep mt0"></div>
    
    <!-- Search widget -->
    <form class="sidebarSearch" action="home.jsp">
        <input type="text" id="ac" placeholder="search..." name="search" class="ui-autocomplete-input" autocomplete="off"><span role="status" aria-live="polite" class="ui-helper-hidden-accessible"></span>
        <input type="submit" value="">
    </form>
    
    <div class="sidebarSep"></div>
    
    <!-- Left navigation -->
    
    <s:if test="admin==true">
    
    <ul class="nav" id="menu">
        <li><a class="active" title="" href="<s:url action="dashboard"/>"><span>Dashboard</span></a></li>
        <li><a class="exp active" title="" href="#"><span>Profile</span></a>
            <ul class="sub" style="display: block;">
                <li><a href="<s:url action="general"/>">My Information</a></li>
                <li class="last"><a href="<s:url action="changePassword"/>">Password</a></li>
            </ul>
        </li>
        
        <li><a class="exp active" title="" href="#"><span>User Management</span></a>
            <ul class="sub" style="display: block;">
				<li><a href="<s:url action="Register"/>">Add User</a></li>	
				<li><a href="<s:url action="userList"/>">User List</a></li>
            </ul>
        </li>
        <li><a class="exp active" title="" href="#"><span>Community Management</span></a>
            <ul class="sub" style="display: block;">
				<li><a href="<s:url action="community"/>">Add Community</a></li>	
				<li><a href="<s:url action="community_add_user"/>?comm_id=1">Add User</a></li>
				<!-- <li><a href="<s:url action="updateComm"/>">Update Community</a></li> -->
            </ul>
        </li>
    </ul>
    </s:if>
    <s:else>
    <ul class="nav" id="menu">
        <li><a class="active" title="" href="<s:url action="dashboard"/>"><span>Dashboard</span></a></li>
        <li><a class="exp active" title="" href="#"><span>Profile</span></a>
            <ul class="sub" style="display: block;">
                <li><a href="<s:url action="general"/>">My Information</a></li>
                <li class="last"><a href="<s:url action="changePassword"/>">Password</a></li>
            </ul>
        </li>
        
        <li><a class="exp active" title="" href="#"><span>Management</span></a>
            <ul class="sub" style="display: block;">
                <li><a href="<s:url action="submission_new"/>">Submission</a></li>
				<li class="last"><a href="<s:url action="payment"/>">Payment</a></li>
            </ul>
        </li>
    </ul>
    </s:else>
</div>
<div id="rightSide" />

    <!-- Top fixed navigation -->
    <div class="topNav">
        <div class="wrapper">
            <div class="welcome"><a title="" href="#"><img alt="" src="images/userPic.png"></a><span>Hello, <%=SessionUserDetailsUtil.getLoginUserName() %>!</span></div>
            <div class="userNav">
                <ul>
                    <li><a href="logout"><img alt="" src="images/icons/topnav/logout.png"><span>Logout</span></a></li>
                </ul>
            </div>
        </div>
    </div>