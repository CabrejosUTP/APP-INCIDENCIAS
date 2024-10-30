/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Dispositivos;
import ModeloDAO.DispositivosDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author VictorG
 */
public class Controladordispo extends HttpServlet {
    String listard="vistasdispo/listardispo.jsp";
    String adddispo="vistasdispo/adddispo.jsp";
    String editdispo="vistasdispo/editdispo.jsp";
    Dispositivos d=new Dispositivos();
    DispositivosDAO dao=new DispositivosDAO();
    int id;
    
    
    
    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Controladordispo</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Controladordispo at " + request.getContextPath() + "</h1>");
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
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

      String acceso="";
        String action=request.getParameter("accion");
        if(action.equalsIgnoreCase("listardispo")){
            acceso=listard;            
        }else if(action.equalsIgnoreCase("adddispo")){
            acceso=adddispo;
        }
        else if(action.equalsIgnoreCase("Agregar")){
            int dispo=Integer.parseInt(request.getParameter("txtDISPO"));
            String nomb=request.getParameter("txtNOMB");
            String tipo=request.getParameter("txtTIPODIS");
            d.setId_disp(dispo);
            d.setNombre_disp(nomb);
            d.setTipo_disp(tipo);
            dao.add(d);
            acceso=listard;
        }
        else if(action.equalsIgnoreCase("editar")){
            request.setAttribute("idper",request.getParameter("id"));
            acceso=editdispo;
        }
        else if(action.equalsIgnoreCase("Actualizar")){
            //txtide va al formulario editdispo.jsp
            id=Integer.parseInt(request.getParameter("txtidee"));
            String nomb=request.getParameter("txtNOMB");
            String tipo=request.getParameter("txtTIPODIS"); 
            d.setId_disp(id);
            d.setNombre_disp(nomb);
            d.setTipo_disp(tipo);
            dao.edit(d);
            acceso=listard;
        }
        RequestDispatcher vista=request.getRequestDispatcher(acceso);
        vista.forward(request, response);
        
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
