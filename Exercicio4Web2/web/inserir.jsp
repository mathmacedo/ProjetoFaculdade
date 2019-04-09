<%-- 
    Document   : inserir
    Created on : Apr 9, 2019, 2:30:02 PM
    Author     : macedo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        
        <%
            session = request.getSession(false);
            if (session.getAttribute("usuarioSessao") == null) {
                request.setAttribute("msg", "Login ou Senha incorreto.");
                request.setAttribute("page", "index.html");
                RequestDispatcher rd = getServletContext().getRequestDispatcher("/erro.jsp");
                rd.forward(request, response);
            }
        %>
    </head>
    <body>
        <div class='col-md-6 offset-md-3'>
            <form action='CadastrarUsuarioServlet' method='POST'>
                <div class='form-group'>
                    <label>Nome :</label>
                    <input class='form-control' name='nome'/>
                </div>
                <div class='form-group'>
                    <label>Login :</label>
                    <input class='form-control' name='login'/>
                </div>
                <div class='form-group'>
                    <label>Senha :</label>
                    <input type='password' class='form-control' name='senha'/>
                </div>
                <button type='submit' class='btn btn-block btn-primary' value='Cadastrar'>Cadastrar</button>
            </form>
        </div>
                
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    </body>
</html>
