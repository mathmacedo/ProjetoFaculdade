/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author macedo
 */
@WebServlet(urlPatterns = {"/PortalServlet"})
public class PortalServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request,
        HttpServletResponse response)
        throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */

            HttpSession session = request.getSession(false);

            ArrayList<Usuario> listaUsuario = new ArrayList<Usuario>();

            listaUsuario = (ArrayList) session.getAttribute("listaUsuario");

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet PortalServlet</title>");
            out.println("<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1 style='text-align: center;margin-bottom: 60px;'>Bem Vindo ao cadastro de usuário</h1>");
            out.println("<div class='col-md-6 offset-md-3'>");
            out.println("<form action='CadastrarUsuarioServlet' method='POST'>");
            out.println("<div class='form-group'>");
            out.println("<label>Nome :</label>");
            out.println("<input class='form-control' name='nome'/>");
            out.println("</div>");
            out.println("<div class='form-group'>");
            out.println("<label>Login :</label>");
            out.println("<input class='form-control' name='login'/>");
            out.println("</div>");
            out.println("<div class='form-group'>");
            out.println("<label>Senha :</label>");
            out.println("<input type='password' class='form-control' name='senha'/>");
            out.println("</div>");
            out.println("<button type='submit' class='btn btn-block btn-primary' value='Cadastrar'>Cadastrar</button>");
            out.println("</form>");
            out.println("</div>");

            out.println("<h1 style='text-align: center;margin-bottom: 60px;'>Usuários Cadastrados</h1>");
            out.println("<table class='table table-dark'>");
            out.println("<thead>");
            out.println("<tr>");
            out.println("<th scope='col'>#</th>");
            out.println("<th scope='col'>Nome</th>");
            out.println("<th scope='col'>Usuário</th>");
            out.println("<th scope='col'>Senha</th>");
            out.println("</tr>");
            out.println("</thead>");
            out.println("<tbody>");
            for (Usuario i : listaUsuario) {
                out.println("<tr>");
                out.println("<th scope='row'>" + i + "</th>");
                out.println("<td>" + i.getNome() + "</td>");
                out.println("<td>" + i.getLogin() + "</td>");
                out.println("<td>" + i.getSenha() + "</td>");
                out.println("</tr>");
            }
            out.println("</tbody>");
            out.println("</table>");
            out.println("<div><a class='btn btn-primary col-md-6 offset-md-3' href='LogoutServlet' role='button'>Sair</a></div>");

            out.println("<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>");
            out.println("<script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>");
            out.println("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>");

            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request,
        HttpServletResponse response)
        throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request,
        HttpServletResponse response)
        throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
