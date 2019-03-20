/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author macedo
 */
@WebServlet(urlPatterns = {"/Processa"})
public class Processa extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String usuario = request.getParameter("nome");
        String email = request.getParameter("email");
		String id = request.getParameter("idade");
		String dt = request.getParameter("dataNascimento");
		
		Integer idade = Integer.parseInt(id);
		Date dataNascimento = null;
		
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		try {
			dataNascimento = format.parse(dt);
		} catch (ParseException ex) {
			Logger.getLogger(Processa.class.getName()).log(Level.SEVERE, null, ex);
		}
        
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<html><head>");
        out.println("<title>Teste</title></head><body>");
        out.println("<h1>Dados do formulario</h1>");
        out.println("Usuario: " + usuario + "<br/>");
        out.println("Email: " + email + "<br/>");
        out.println("Idade: " + idade + "<br/>");
        out.println("Data Nascimento: " + dataNascimento + "<br/>");
        out.println("</body></html>");
        out.close();
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
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
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
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
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