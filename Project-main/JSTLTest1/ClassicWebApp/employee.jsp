<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="employee" class="classic.web.app.EmployeeBean" scope="session"/>
<jsp:setProperty name="employee" property="*"/>
<c:if test="${param.signout}">
	<c:set target="${employee}" property="id"/>
</c:if>
<html>
	<head>
		<title>ClassicWebApp</title>
	</head>
	<body>
		<h1>Welcome Employee</h1>
		<form method="POST">
			<p>
				<b>Admin ID</b><br/>
				<input type="text" name="id"/>
			</p>
			<p>
				<b>Password</b><br/>
				<input type="password" name="password"/>
			</p>
			<p>
				<input type="submit" name="submit" value="Login"/>
			</p>
		</form>
		<c:if test="${param.submit == 'Login'}">
			<c:choose>
				<c:when test="${employee.authenticate()}">
					<c:redirect url="orders.jsp"/>
				</c:when>
				<c:otherwise>
					<b>Authentication Failed</b>
				</c:otherwise>
			</c:choose>
		</c:if>
	</body>
</html>

