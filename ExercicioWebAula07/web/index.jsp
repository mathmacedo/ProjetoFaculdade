<%-- 
    Document   : index
    Created on : May 9, 2019, 7:59:02 PM
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
        <c:set var="idade" value="25" />
		
		Total: ${ (10+20+30+40)/4 } <br />
		<b>
			${(idade>18) ? "Maior de idade" : "Menor de idade"}
		</b>
		
		<h1>${idade}</h1>
    </body>
</html>
