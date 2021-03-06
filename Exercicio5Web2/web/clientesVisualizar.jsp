<%-- 
    Document   : clientesVisualizar
    Created on : Apr 17, 2019, 3:07:07 PM
    Author     : macedo
--%>

<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.ufpr.tads.web2.beans.Cliente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css" integrity="sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf" crossorigin="anonymous">

        <%
            session = request.getSession(false);
            if (session.getAttribute("usuarioSessao") == null) {
                request.setAttribute("msg", "Usuário deve se autenticar para acessar o sistema.");
                RequestDispatcher rd = getServletContext().getRequestDispatcher("/index.jsp");
                rd.forward(request, response);
            }
        %>

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
    </head>
    <body>
        <jsp:useBean id="configuracao" class="com.ufpr.tads.web2.beans.ConfigBean" scope="application"/>
        <%
            Cliente cliente = (Cliente) request.getAttribute("cliente");
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
			String strDate = simpleDateFormat.format(cliente.getData());
        %>
        
        <div class="col-md-8 offset-md-2" style='margin-top: 30px;'>
            <table class="table">
                <thead>
                    <tr>
                        <th scope="col">ID</th>
                        <th scope="col">CPF</th>
                        <th scope="col">Nome</th>
                        <th scope="col">E-mail</th>
                        <th scope="col">Data</th>
                        <th scope="col">Rua</th>
                        <th scope="col">Número</th>
                        <th scope="col">CEP</th>
                        <th scope="col">Cidade</th>
                        <th scope="col">UF</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <th scope='row'><% out.println(cliente.getId()); %></th>
                        <td><% out.println(cliente.getCpf()); %></td>
                        <td><% out.println(cliente.getNome()); %></td>
                        <td><% out.println(cliente.getEmail()); %></td>
                        <td><% out.println(strDate); %></td>
                        <td><% out.println(cliente.getRua()); %></td>
                        <td><% out.println(cliente.getNumero()); %></td>
                        <td><% out.println(cliente.getCep()); %></td>
                        <td><% out.println(cliente.getCidade()); %></td>
                        <td><% out.println(cliente.getUf()); %></td>
                    </tr>
                </tbody>
            </table>
            
            <a class='btn btn-primary col-md-8 offset-md-2' href='ClientesServlet' role='button'>Voltar</a>
                    
            <div class="footer">
                <p>Em caso de problemaas contactar o administrador : <jsp:getProperty name="configuracao" property="email"/></p>
            </div>
        </div>

    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    </body>
</html>
