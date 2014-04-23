<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="css/main.css" rel="stylesheet" type="text/css">
<title>User List</title>
</head>
<body>
<jsp:include page="/leftAndTop.jsp" />
    
    <!-- Title area -->
    <div class="titleArea">
        <div class="wrapper">
            <div class="pageTitle">
                <h5>User List</h5>
            </div>
        </div>
    </div>
    <div class="line"></div>
    
    <!-- Main content wrapper -->
    <div class="wrapper">
		<div class="widget">
			<div role="grid" class="dataTables_wrapper" id="DataTables_Table_0_wrapper">
				
				<table border="0" cellspacing="0" cellpadding="0"
					class="display dTable dataTable" id="DataTables_Table_0">
					<thead>
						<tr role="row">
							<th class="ui-state-default"  rowspan="1" colspan="1">
								<div class="DataTables_sort_wrapper">
									UserName
								</div>
							</th>
							<th class="ui-state-default"  rowspan="1" colspan="1">
								<div class="DataTables_sort_wrapper">
									First Name
								</div>
							</th>
							<th class="ui-state-default"  rowspan="1" colspan="1">
								<div class="DataTables_sort_wrapper">
									Last Name
								</div>
							</th>
							<th class="ui-state-default"  rowspan="1" colspan="1">
								<div class="DataTables_sort_wrapper">
								 	Email
								</div>
							</th>
							<th class="ui-state-default"  rowspan="1" colspan="1">
								<div class="DataTables_sort_wrapper">
									Created Time
								</div>
							</th>
						</tr>
					</thead>

					<tbody role="alert" aria-live="polite" aria-relevant="all">
					<s:iterator value="users">
						<tr class="gradeA odd">
							<td class=" sorting_1"><a href="userDisplay.action?id=<s:property value="id"/>"><s:property value="username"/></a></td>
							<td class=""><s:property value="firstName"/></td>
							<td class=""><s:property value="lastName"/></td>
							<td class=""><s:property value="email"/></td>
							<td class="center"><s:property value="createTime"/></td>
						</tr>
					</s:iterator>
					</tbody>
				</table>
				
			</div>
		</div>
    </div>
<jsp:include page="/footer.jsp" />

</body>
</html>
