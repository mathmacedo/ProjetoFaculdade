<%-- 
    Document   : page
    Created on : Apr 4, 2019, 9:17:54 PM
    Author     : macedo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:useBean id="p" class="beans.Pessoa" scope="application"/>
        <jsp:setProperty name="p" property="nome" value="Razer" />

        <a href="TesteServlet">Teste</a>
    </body>
</html>
