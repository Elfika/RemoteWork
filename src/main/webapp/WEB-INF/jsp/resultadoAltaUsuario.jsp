<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>User Data:</h1>        
        <p>Nombre:<c:out value="${usuario.nombre}"/></p>
        <p>Apellido:<c:out value="${usuario.apellido}"/></p>
        <p>Email:<c:out value="${usuario.email}"/></p>
        <p>Country:<c:out value="${usuario.country}"/></p>
    </body>
</html>