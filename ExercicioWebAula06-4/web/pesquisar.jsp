<%-- 
    Document   : pesquisar
    Created on : May 2, 2019, 8:27:34 PM
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
        <form action="Controladora?action=pesquisar" method="POST" >
			Texto:<input type="text" name="texto" /><br/>
			<input type="submit" value="Pesquisar" />
			<input type="reset" value="Limpar" />
		</form>
    </body>
</html>
