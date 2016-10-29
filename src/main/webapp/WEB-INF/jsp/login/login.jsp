<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="../Header.jsp" flush="true" />
<jsp:include page="../Menu.jsp" flush="true" />
<body>
	<div class="form-container text-center">
		<form action="login" method="get">
		<table>
			<tr>
				<td>User</td>
				<td><input name="user" /></td>
			</tr>
			<tr>
				<td>password</td>
				<td><input name="password" /></td>
			</tr>
		</table>
		<input type="submit" />
	</form>
	</div>
<jsp:include page="../Footer.jsp" flush="true" />