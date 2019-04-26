<%-- 
    Document   : clientesAlterar
    Created on : Apr 17, 2019, 3:49:04 PM
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
            Cliente cliente = (Cliente) request.getAttribute("alterarCliente");
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
			String strDate = simpleDateFormat.format(cliente.getData());
        %>
        
        <div class="col-md-8 offset-md-2" style='margin-top: 30px;'>
            <form action="AlterarClienteServlet" method="POST">
                <div class="form-group">
                    <label for="id">ID</label>
                    <input type="text" class="form-control" id="id" name="id" readonly=“true” value="<% out.println(Integer.toString(cliente.getId())); %>">
                </div>
                <div class="form-group">
                    <label for="cpf">CPF</label>
                    <input type="text" class="form-control" id="cpf" name="cpf" placeholder="<% out.println(cliente.getCpf()); %>">
                </div>
                <div class="form-group">
                    <label for="nome">Nome</label>
                    <input type="name" class="form-control" id="nome" name="nome" placeholder="<% out.println(cliente.getNome()); %>">
                </div>
                <div class="form-group">
                    <label for="email">E-mail</label>
                    <input type="email" class="form-control" id="email" name="email" placeholder="<% out.println(cliente.getEmail()); %>">
                </div>
                <div class="form-group">
                    <label for="data">Data</label>
                    <input type="date" name="data" name="data" max="3000-12-31" min="1000-01-01" class="form-control" placeholder="<% out.println(cliente.getData()); %>">
                </div>
                <div class="form-group">
                    <label for="rua">Rua</label>
                    <input type="text" class="form-control" id="rua" name="rua" placeholder="<% out.println(cliente.getRua()); %>">
                </div>
                <div class="form-group">
                    <label for="numero">Número</label>
                    <input type="numero" class="form-control" id="numero" name="numero" placeholder="<% out.println(cliente.getNumero()); %>">
                </div>
                <div class="form-group">
                    <label for="cep">CEP</label>
                    <input type="text" class="form-control" id="cep" name="cep" placeholder="<% out.println(cliente.getCep()); %>">
                </div>
                <div class="form-group">
                    <label for="cidade">Cidade</label>
                    <input type="text" class="form-control" id="cidade" name="cidade" placeholder="<% out.println(cliente.getCidade()); %>">
                </div>
                <div class="form-group">
                    <label for="uf">UF</label>
                    <input type="text" class="form-control" id="uf" name="uf" placeholder="<% out.println(cliente.getUf()); %>">
                </div>
                <div style="display: inline">
                    <a class='btn btn-primary col-md-4 offset-md-1' href='ClientesServlet' role='button'>Cancelar</a>
                </div>
                <div style="display: inline">
                    <button type="submit" class="btn btn-primary col-md-4 offset-md-1">Alterar</button>
                </div>
            </form>
            
            <div class="footer">
                <p>Em caso de problemaas contactar o administrador : <jsp:getProperty name="configuracao" property="email"/></p>
            </div>
        </div>
        
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    </body>
</html>
