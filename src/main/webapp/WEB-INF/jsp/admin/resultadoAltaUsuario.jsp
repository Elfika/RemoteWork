<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<p>Resultado</p>
    <c:forEach items="${model.usuario}" var="usuario">
        <tr>
            <td><c:out value="${usuario.nombre}" /></td>
            <td><c:out value="${usuario.apellido}" /></td>
            <td><c:out value="${usuario.email}" /></td>
            <td><c:out value="${usuario.country}" /></td>
    </c:forEach>
