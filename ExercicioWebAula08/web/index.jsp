<%-- 
    Document   : index
    Created on : May 16, 2019, 7:48:09 PM
    Author     : macedo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:useBean id="u" class="com.ufpr.tads.web2.beans.Universidade" />
		<c:forEach var="nome" items="${u.cursos}">
			<c:out value="${nome}" /><br />
		</c:forEach>
    </body>
</html>
