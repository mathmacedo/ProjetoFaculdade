<%-- 
    Document   : portal
    Created on : Apr 8, 2019, 7:38:45 PM
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
        <%
			session = request.getSession(false);
			if (session.getAttribute("usuarioSessao") == null) {
                request.setAttribute("msg", "Login ou Senha incorreto.");
                RequestDispatcher rd = getServletContext().getRequestDispatcher("/ErroServlet");
                rd.forward(request, response);
                return;
            }
		%>
    </body>
</html>
