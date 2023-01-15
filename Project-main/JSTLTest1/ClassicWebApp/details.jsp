<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:useBean id="department" class="classic.web.app.DepartmentBean" scope= "session"/>
<jsp:setProperty name="department" property="*"/>
<html>
	<head>
		<title>ClassicWebApp</title>
	</head>
	<body>
		<h1>
		<b>Employee Details</b>
		</h1>

	<h3>Details Of Employees From Department=${param.dept_id}</h3>
		
		<table border="1">
			<tr>
				<th>Employee ID</th>
				<th>Employee Name</th>
				<th>Employee Age</th>
				<th>Employee Dept</th>
			</tr>
		<c:forEach var="entry" items="${department.details}">
				<tr>
					<td>${entry.emp_id}</td>
					<td>${entry.emp_Name}</td>
					<td>${entry.emp_age}</td>
					<td>${entry.emp_dept}</td>
				</tr>
			</c:forEach>
		</table>
		<p>

			<a href="employee.jsp">Logout</a>	
		</p>
	</body>
</html>

