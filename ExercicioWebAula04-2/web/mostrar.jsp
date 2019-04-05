<%-- 
    Document   : mostrar
    Created on : Apr 4, 2019, 8:18:49 PM
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
        <jsp:useBean id="p" class="beans.Pessoa" /><br/>
        <jsp:setProperty name="p" property="*" />
        <h1>Processado</h1>
        Nome: <jsp:getProperty name="p" property="nome"/><br/>
        Endereco: <jsp:getProperty name="p" property="endereco"/> <br/>
    </body>
</html>
