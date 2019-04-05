<%-- 
    Document   : page
    Created on : Apr 4, 2019, 9:41:57 PM
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
        <h1>Teste de Escopo da Aplicação</h1>
        <jsp:useBean id="configuracao" class="beans.ConfigBean" scope="application" />
        E-mail: <jsp:getProperty name="configuracao" property="email" />
    </body>
</html>
