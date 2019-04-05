<%-- 
    Document   : Page
    Created on : Apr 4, 2019, 7:48:04 PM
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
        <h1>Hello World!</h1>
        <jsp:useBean id="p" class="beans.Pessoa" scope="session">
            Bean Criado
        </jsp:useBean>
    </body>
</html>
