/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author macedo
 */
@WebServlet(urlPatterns = {"/InformacoesSept"})
public class InformacoesSept extends HttpServlet {

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
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<style>"
                + "table, th, td {"
                + "border: 1px solid black;"
                + "}"
                + "</style>");
            out.println("<title>Servlet InformacoesSept</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1 style='text-align: center'>Informações SEPT</h1>");
            out.println("<div style='margin-bottom: 20px;'><span style='font-family: verdana;color: blue;font-size: 30px;'>Nome do Setor : SEPT - Setor de Educação Profissional e Tecnológia </span></div>");
            out.println("<div style='margin-bottom: 20px;'><span style='font-family: arial;color: black;'>Endereço : Rua Dr. Alcides Vieira Arcoverde, 1225, Jardim das Américas</span></div>");
            out.println("<table style='width: 50%;margin-bottom: 20px;'>"
                + "<tr>"
                + "<th>CURSO</th>"
                + "<th>PÁGINA</th>"
                + "</tr>"
                + "<tr>"
                + "<th>AGENTE COMUNITÁRIO DE SÁUDE</th>"
                + "<th><a href='http://200.17.200.17/agentecomunitario.html'>SITE</a></th>"
                + "</tr>"
                + "<tr>"
                + "<th>PETRÓLEO E GÁS</th>"
                + "<th><a href='http://www.sept.ufpr.br/portal/petroleogas/'>SITE</a></th>"
                + "</tr>"
                + "<tr>"
                + "<th>ANÁLISE E DESENVOLVIMENTO DE SISTEMAS</th>"
                + "<th><a href='http://www.sept.ufpr.br/portal/analisesistemas/'>SITE</a></th>"
                + "</tr>"
                + "<tr>"
                + "<th>COMUNICAÇÃO INSTITUCIONAL</th>"
                + "<th><a href='http://www.sept.ufpr.br/portal/comunicacaoinstitucional/sobre-o-curso/'>SITE</a></th>"
                + "</tr>"
                + "<tr>"
                + "<th>GESTÃO DE QUALIDADE</th>"
                + "<th><a href='http://www.sept.ufpr.br/portal/gestaoqualidade/'>SITE</a></th>"
                + "</tr>"
                + "<tr>"
                + "<th>GESTÃO PÚBLICA</th>"
                + "<th><a href='http://www.sept.ufpr.br/portal/gestaopublica/'>SITE</a></th>"
                + "</tr>"
                + "<tr>"
                + "<th>LUTERIA</th>"
                + "<th><a href='http://www.sept.ufpr.br/portal/luteria/'>SITE</a></th>"
                + "</tr>"
                + "<tr>"
                + "<th>NEGÓCIOS IMOBILIÁRIOS</th>"
                + "<th><a href='http://www.sept.ufpr.br/portal/negociosimobiliarios/'>SITE</a></th>"
                + "</tr>"
                + "<tr>"
                + "<th>PRODUÇÃO CÊNICA</th>"
                + "<th><a href='http://www.tpc.ufpr.br/'>SITE</a></th>"
                + "</tr>"
                + "<tr>"
                + "<th>SECRETARIADO</th>"
                + "<th><a href='http://www.sept.ufpr.br/portal/secretariado/'>SITE</a></th>"
                + "</tr>"
                + "<tr>"
                + "<th>PÓS-GRADUAÇÃO EM BIOINFORMÁTICA</th>"
                + "<th><a href='http://www.bioinfo.ufpr.br/'>SITE</a></th>"
                + "</tr>"
                + "<tr>"
                + "<th>ESPECIALIZAÇÃO EM INTELIGÊNCIA ARTIFICIAL</th>"
                + "<th><a href='http://www.iaa.ufpr.br/'>SITE</a></th>"
                + "</tr>"
                + "<tr>"
                + "<th>ESPECIALIZAÇÃO EM ENGENHARIA DE SOFTWARE</th>"
                + "<th><a href='http://www.engenhariadesoftware.ufpr.br:28080/engenhariadesoftware/'>SITE</a></th>"
                + "</tr>"
                + "</table>");
            out.println("<button style='position: absolute; left: 50%;' onclick=\"window.location.href = 'meuTads.jsp';\">MEU TADS</button>");
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
