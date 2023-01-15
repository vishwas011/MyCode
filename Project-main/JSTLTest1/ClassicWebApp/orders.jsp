<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<Cjsp:useBean id="employee" class="classic.web.app.EmployeeBean" scope="session"/>
<Cjsp:useBean id="department" class="classic.web.app.DepartmentBean" scope="session"/>
<jsp:setProperty name="employee" property="*"/>
<jsp:setProperty name="department" property="*"/>
<c:if test="${empty employee.id}">
	<c:redirect url="employee.jsp"/>
</c:if>
<html>
	<head>
		<title>ClassicWebApp</title>
	</head>
	<body>
		<h1>Welcome Employee ${employee.id}</h1>
		<h3>Your Department Details</h3>
		<table border="1">
			<tr>
				<th>Department No</th>
				<th>Department Name</th>
				<th>Location</th>
			</tr>
			<c:forEach var="entry" items="${employee.orders}">
				<tr>
					<td>${entry.departmentNo}</td>
					<td>${entry.departmentName}</td>
					<td>${entry.location}</td>
				</tr>
			</c:forEach>
		</table>
		<form method="POST" action="details.jsp">
		<p>
			<b>Department Id</b><br/>
			<input type="text" name="deptId"/>
		</p>	
		<p>
			<input type="submit" name="submit" value="Details"/>
		</p>
		</form>


		<p>
		<a href="employee.jsp">Logout</a>
		</p>
	</body>
</html>

