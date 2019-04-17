<%-- 
    Document   : index
    Created on : Apr 16, 2019, 11:51:29 AM
    Author     : macedo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        
        <style>
            .footer {
                position: fixed;
                left: 0;
                bottom: 0;
                width: 100%;
                background-color: black;
                color: white;
                text-align: center;
            }
        </style>
        
        <%
            session = request.getSession(false);
            if (session.getAttribute("usuarioSessao") == null) {
                String msg = (String) request.getAttribute("msg");
                out.println(msg);
            }
        %>
    </head>
    <body>
        <jsp:useBean id="configuracao" class="com.ufpr.tads.web2.beans.ConfigBean" scope="application"/>
        
        <div class="col-md-6 offset-md-3">
            <form action="LoginServlet" method="POST">
                <div class="form-group">
                    <label>Login :</label>
                    <input class="form-control" name="login" placeholder="Login"/>
                </div>
                <div class="form-group">
                    <label>Senha :</label>
                    <input type="password" class="form-control" name="senha" placeholder="Senha"/>
                </div>

                <button type="submit" class="btn btn-block btn-primary" value="logar">Logar</button>
            </form>
        </div>
        
        <div class="footer">
            <p>Em caso de problemaas contactar o administrador : <jsp:getProperty name="configuracao" property="email"/></p>
        </div>
        
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    </body>
</html>
