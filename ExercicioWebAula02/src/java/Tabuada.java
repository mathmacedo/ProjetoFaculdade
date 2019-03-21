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
@WebServlet(urlPatterns = {"/Tabuada"})
public class Tabuada extends HttpServlet {

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
            out.println("<title>Servlet Tabuada</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<table style='widht: 100%'>");
            out.println("<tr>");
            for (int i = 1; i <= 9; i++) {
                out.println("<th>");
                out.println("Tabuada " + i);
                out.println("</th>");
            }
            out.println("</tr>");
            out.println("<tr style='text-align: center'>");
            for (int i = 1; i <= 9; i++) {
                out.println("<td>" + i + " x 1 = " + i * 1 + "</td>");
            }
            out.println("</tr>");
            out.println("<tr style='text-align: center'>");
            for (int i = 1; i <= 9; i++) {
                out.println("<td>" + i + " x 1 = " + i * 1 + "</td>");
            }
            out.println("</tr>");
            out.println("<tr style='text-align: center'>");
            for (int i = 1; i <= 9; i++) {
                out.println("<td>" + i + " x 2 = " + i * 2 + "</td>");
            }
            out.println("</tr>");
            out.println("<tr style='text-align: center'>");
            for (int i = 1; i <= 9; i++) {
                out.println("<td>" + i + " x 3 = " + i * 3 + "</td>");
            }
            out.println("</tr>");
            out.println("<tr style='text-align: center'>");
            for (int i = 1; i <= 9; i++) {
                out.println("<td>" + i + " x 4 = " + i * 4 + "</td>");
            }
            out.println("</tr>");
            out.println("<tr style='text-align: center'>");
            for (int i = 1; i <= 9; i++) {
                out.println("<td>" + i + " x 5 = " + i * 5 + "</td>");
            }
            out.println("</tr>");
            out.println("<tr style='text-align: center'>");
            for (int i = 1; i <= 9; i++) {
                out.println("<td>" + i + " x 6 = " + i * 6 + "</td>");
            }
            out.println("</tr>");
            out.println("<tr style='text-align: center'>");
            for (int i = 1; i <= 9; i++) {
                out.println("<td>" + i + " x 7 = " + i * 7 + "</td>");
            }
            out.println("</tr>");
            out.println("<tr style='text-align: center'>");
            for (int i = 1; i <= 9; i++) {
                out.println("<td>" + i + " x 8 = " + i * 8 + "</td>");
            }
            out.println("</tr>");
            out.println("<tr style='text-align: center'>");
            for (int i = 1; i <= 9; i++) {
                out.println("<td>" + i + " x 9 = " + i * 9 + "</td>");
            }
            out.println("</tr>");
            out.println("<tr style='text-align: center'>");
            for (int i = 1; i <= 9; i++) {
                out.println("<td>" + i + " x 10 = " + i * 10 + "</td>");
            }
            out.println("</tr>");
            out.println("</table>");
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
