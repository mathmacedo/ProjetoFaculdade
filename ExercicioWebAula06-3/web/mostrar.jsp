<%-- 
    Document   : mostrar
    Created on : May 2, 2019, 8:07:55 PM
    Author     : macedo
--%>

<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Ação efetuada com sucesso</h1>
		Dados: <br/>
		<c:forEach items="${dados}" var="x">
			${x}<br/>
		</c:forEach>
    </body>
</html>
