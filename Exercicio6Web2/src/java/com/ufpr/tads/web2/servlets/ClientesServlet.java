/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ufpr.tads.web2.servlets;

import com.ufpr.tads.web2.beans.Cliente;
import com.ufpr.tads.web2.dao.ClienteDAO;
import com.ufpr.tads.web2.facade.ClienteFacede;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
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
@WebServlet(name = "ClientesServlet", urlPatterns = {"/ClientesServlet"})
public class ClientesServlet extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
		HttpSession session = request.getSession(false);
		
		String action = request.getParameter("action");

		if (session.getAttribute("usuarioSessao") == null) {
			request.setAttribute("msg", "Usuário deve se autenticar para acessar o sistema.");
			RequestDispatcher rd = getServletContext().getRequestDispatcher("/index.jsp");
			rd.forward(request, response);
		} else {
			if(action.equals("list")) {
				List<Cliente> listaDeTodoClientes = ClienteFacede.getAllClientes();
				request.setAttribute("listaDeClientes", listaDeTodoClientes);
				RequestDispatcher rd = getServletContext().getRequestDispatcher("/clientesListar.jsp");
				rd.forward(request, response);
			} else if(action.equals("show")) {
				String idString = request.getParameter("id");
				Integer id = Integer.parseInt(idString);
				Cliente clienteShow = ClienteFacede.getCliente(id);
				request.setAttribute("cliente", clienteShow);
				RequestDispatcher rd = getServletContext().getRequestDispatcher("/clientesVisualizar.jsp");
				rd.forward(request, response);
			} else if(action.equals("formUpdate")) {
				String idString = request.getParameter("id");
				Integer id = Integer.parseInt(idString);
				Cliente clienteUpdate = ClienteFacede.getCliente(id);
				request.setAttribute("alterarCliente", clienteUpdate);
				RequestDispatcher rd = getServletContext().getRequestDispatcher("/clientesAlterar.jsp");
				rd.forward(request, response);
			} else if(action.equals("remove")) {
				String idString = request.getParameter("id");
				Integer id = Integer.parseInt(idString);
				ClienteFacede.removerCliente(id);
				RequestDispatcher rd = getServletContext().getRequestDispatcher("/ClientesServlet?action=list");
				rd.forward(request, response);
			} else if(action.equals("update")) {
				String dataString = request.getParameter("data");
                SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
                Date data = null;
                try {
                    data = format.parse(dataString);
                } catch (ParseException ex) {
                    Logger.getLogger(ClientesServlet.class.getName()).log(Level.SEVERE, null, ex);
                }
                java.sql.Date dataFormatada = new java.sql.Date(data.getTime());
				String numeroString = request.getParameter("numero");
                Integer numero = Integer.parseInt(numeroString);
				String idString = request.getParameter("id");
				Integer id = Integer.parseInt(idString);
				String cpf = request.getParameter("cpf");
				String nome = request.getParameter("nome");
				String email = request.getParameter("email");
				String rua = request.getParameter("rua");
				String cep = request.getParameter("cep");
				String cidade = request.getParameter("cidade");
				String uf = request.getParameter("uf");
				
				Cliente cliente = new Cliente();
				cliente.setId(id);
				cliente.setCpf(request.getParameter("cpf"));
                cliente.setNome(request.getParameter("nome"));
                cliente.setEmail(request.getParameter("email"));
                cliente.setData(dataFormatada);
                cliente.setRua(request.getParameter("rua"));
                cliente.setNumero(numero);
                cliente.setCep(request.getParameter("cep"));
                cliente.setCidade(request.getParameter("cidade"));
                cliente.setUf(request.getParameter("uf"));
				
				ClienteFacede.alterarCliente(cliente);
				RequestDispatcher rd = getServletContext().getRequestDispatcher("/ClientesServlet?action=list");
				rd.forward(request, response);
			} else if (action.equals("formNew")) {
				RequestDispatcher rd = getServletContext().getRequestDispatcher("/clientesNovo.jsp. ");
				rd.forward(request, response);
			} else if (action.equals("new")) {
				String dataString = request.getParameter("data");
                SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
                Date data = null;
                try {
                    data = format.parse(dataString);
                } catch (ParseException ex) {
                    Logger.getLogger(ClientesServlet.class.getName()).log(Level.SEVERE, null, ex);
                }
                java.sql.Date dataFormatada = new java.sql.Date(data.getTime());
				String numeroString = request.getParameter("numero");
                Integer numero = Integer.parseInt(numeroString);
				String idString = request.getParameter("id");
				Integer id = Integer.parseInt(idString);
				String cpf = request.getParameter("cpf");
				String nome = request.getParameter("nome");
				String email = request.getParameter("email");
				String rua = request.getParameter("rua");
				String cep = request.getParameter("cep");
				String cidade = request.getParameter("cidade");
				String uf = request.getParameter("uf");
				
				Cliente cliente = new Cliente();
				cliente.setId(id);
				cliente.setCpf(request.getParameter("cpf"));
                cliente.setNome(request.getParameter("nome"));
                cliente.setEmail(request.getParameter("email"));
                cliente.setData(dataFormatada);
                cliente.setRua(request.getParameter("rua"));
                cliente.setNumero(numero);
                cliente.setCep(request.getParameter("cep"));
                cliente.setCidade(request.getParameter("cidade"));
                cliente.setUf(request.getParameter("uf"));
				
				ClienteFacede.inserirCliente(cliente);
				RequestDispatcher rd = getServletContext().getRequestDispatcher("/ClientesServlet?action=list");
				rd.forward(request, response);
			}
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
