package org.apache.jsp.vistas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Iterator;
import Modelo.Cliente;
import java.util.List;
import ModeloDAO.ClienteDAO;

public final class listar_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"navbar\">\n");
      out.write("                <form class=\"form-inline\">\n");
      out.write("                    <input type=\"search\" name=\"txtBuscar\" class=\"form-control\">\n");
      out.write("                    <input type=\"submit\" name=\"ac\" value=\"Buscar\" class=\"btn btn-outline-success\">\n");
      out.write("                    \n");
      out.write("                </form>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <h1>Personas</h1>\n");
      out.write("            <a class=\"btn btn-success\" href=\"Controlador?accion=add\">Agregar Nuevo</a>\n");
      out.write("            \n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <table class=\"table table-bordered\">\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th class=\"text-center\">DNI DE CLIENTE</th>\n");
      out.write("                        <th class=\"text-center\">NOMBRE DE CLIENTE</th>\n");
      out.write("                        <th class=\"text-center\">DIRECCION DE CLIENTE</th>\n");
      out.write("                        <th class=\"text-center\">TELEFONO</th>\n");
      out.write("                        <th class=\"text-center\">CONTRASEÑA</th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                ");

                    ClienteDAO dao=new ClienteDAO();
                    List<Cliente>list=dao.listar();
                    Iterator<Cliente>iter=list.iterator();
                    Cliente per=null;
                    while(iter.hasNext()){
                        per=iter.next();
                    
                
      out.write("\n");
      out.write("                <tbody>\n");
      out.write("                    <tr>\n");
      out.write("                        <td class=\"text-center\">");
      out.print( per.getDni_cliente());
      out.write("</td>\n");
      out.write("                        <td class=\"text-center\">");
      out.print( per.getNombre_cliente());
      out.write("</td>\n");
      out.write("                        <td class=\"text-center\">");
      out.print( per.getDireccion_cliente());
      out.write("</td>\n");
      out.write("                        <td class=\"text-center\">");
      out.print( per.getTelefono());
      out.write("</td>\n");
      out.write("                        <td class=\"text-center\">");
      out.print( per.getContra());
      out.write("</td>\n");
      out.write("                        <td class=\"text-center\">\n");
      out.write("                            <a class=\"btn btn-warning\" href=\"Controlador?accion=editar&id=");
      out.print( per.getDni_cliente());
      out.write("\">Editar</a>\n");
      out.write("                            <a class=\"btn btn-danger\" href=\"Controlador?accion=eliminar&id=");
      out.print( per.getDni_cliente());
      out.write("\">Remove</a>\n");
      out.write("                         \n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
