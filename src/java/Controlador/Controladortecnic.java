/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Tecnicos;
import ModeloDAO.TecnicoDAO;
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
public class Controladortecnic extends HttpServlet {

    String listarte="vistastecni/listartec.jsp";
    String addte="vistastecni/addtec.jsp";
    String edittecn="vistastecni/edittec.jsp";
    Tecnicos d=new Tecnicos();
    TecnicoDAO dao=new TecnicoDAO();
    int id;
     
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Controladortecnic</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Controladortecnic at " + request.getContextPath() + "</h1>");
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
        if(action.equalsIgnoreCase("listartec")){
            acceso=listarte;            
        }else if(action.equalsIgnoreCase("addtec")){
            acceso=addte;
            
            //boton Agregar del formulario
            //los txtDISPO son de los formularios
        }else if(action.equalsIgnoreCase("Agregar")){
            int tc=Integer.parseInt(request.getParameter("txtIDE"));
            String cr=request.getParameter("txtCAR");
            String nm=request.getParameter("txtNOMBR");
            int tl=Integer.parseInt(request.getParameter("txtTELEF"));
            String est=request.getParameter("txtESTAD");
     
            d.setId_tec(tc);
            d.setCargo_tec(cr);
            d.setNombre_tec(nm);
            d.setTelefono(tl);
            d.setEstado_tec(est);
            dao.add(d);
            acceso=listarte;
        }
        else if(action.equalsIgnoreCase("editar")){
            request.setAttribute("idper",request.getParameter("id"));
            acceso=edittecn;
        }
        
        else if(action.equalsIgnoreCase("Actualizar")){
            //txtide va al formulario editdispo.jsp
            id=Integer.parseInt(request.getParameter("txtidT"));
            String cr=request.getParameter("txtCAR");
            String nm=request.getParameter("txtNOMBR");
            int tf=Integer.parseInt(request.getParameter("txtTELEF"));
            String estd=request.getParameter("txtESTAD");
          
            d.setId_tec(id);
            d.setCargo_tec(cr);
            d.setNombre_tec(nm);
            d.setTelefono(tf);
            d.setEstado_tec(estd);
            dao.edit(d);
            acceso=listarte;
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
