
package Controlador;

import Modelo.Cliente;
import ModeloDAO.ClienteDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Controlador extends HttpServlet {

    String listar="vistas/listar.jsp";
    String add="vistas/add.jsp";
    String edit="vistas/edit.jsp";
    Cliente p=new Cliente();
    ClienteDAO dao=new ClienteDAO();
    int id,r;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {     
        
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String acceso="";
        String action=request.getParameter("accion");
        if(action.equalsIgnoreCase("listar")){
            acceso=listar;            
        }else if(action.equalsIgnoreCase("add")){
            acceso=add;
        }
        else if(action.equalsIgnoreCase("AGRE")){
            int dni=Integer.parseInt(request.getParameter("txtDNI"));
            String nom=request.getParameter("txtNOM");
            String dire=request.getParameter("txtDIR");
            int tele=Integer.parseInt(request.getParameter("txtTEL"));
            String contras=request.getParameter("txtCON"); 
            p.setDni_cliente(dni);
            p.setNombre_cliente(nom);
            p.setDireccion_cliente(dire);
            p.setTelefono(tele);
            p.setContra(contras);
            dao.add(p);
            acceso=listar;
        }
        else if(action.equalsIgnoreCase("editar")){
            request.setAttribute("idper",request.getParameter("id"));
            acceso=edit;
        }
        else if(action.equalsIgnoreCase("Actualizar")){
            //txtid verificar de donde sale
            id=Integer.parseInt(request.getParameter("txtid"));
            String nom=request.getParameter("txtNOM");
            String dire=request.getParameter("txtDIR");
            int tele=Integer.parseInt(request.getParameter("txtTEL"));
            String contras=request.getParameter("txtCON");
            p.setDni_cliente(id);
            p.setNombre_cliente(nom);
            p.setDireccion_cliente(dire);
            p.setTelefono(tele);
            p.setContra(contras);
            dao.edit(p);
            acceso=listar;
        } else if(action.equalsIgnoreCase("Buscar")){
            String dato=request.getParameter("txtBuscar");
            List<Cliente> lista=dao.buscar(dato);
            request.setAttribute("datos", lista);
            request.getRequestDispatcher("index.jsp").forward(request, response);
            
        }
        
        
        
        RequestDispatcher vista=request.getRequestDispatcher(acceso);
        vista.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
