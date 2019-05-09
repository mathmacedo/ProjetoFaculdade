<%-- 
    Document   : inserir
    Created on : May 2, 2019, 8:26:52 PM
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
        <form action="Controladora?action=inserir" method="POST" >
			Nome: <input type="text" name="nome" /><br/>
			E-mail: <input type="text" name="email" /><br/>
			<input type="submit" value="Inserir" />
			<input type="reset" value="Limpar" />
		</form>
    </body>
</html>
