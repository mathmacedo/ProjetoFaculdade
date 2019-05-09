<%-- 
    Document   : index
    Created on : May 2, 2019, 7:34:49 PM
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
        <form action="Controladora" method="POST" >
			Nome: <input type="text" name="nome" /><br/>
			E-mail: <input type="text" name="email" /><br/>
			<input type="submit" value="Salvar" />
			<input type="reset" value="Limpar" />
		</form>
    </body>
</html>
