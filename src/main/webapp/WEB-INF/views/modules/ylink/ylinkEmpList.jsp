<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>员工管理</title>
</head>
<body>
	<table border="1">
		<thead>
			<tr>
				<th>新工号</th>
				<th>姓名</th>
				<th>性别</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${ylinkEmpList}" var="model">
				<tr>
					<td>${model.empNo}</td>
					<td>${model.empName}</td>
					<td>${model.empSex}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>
