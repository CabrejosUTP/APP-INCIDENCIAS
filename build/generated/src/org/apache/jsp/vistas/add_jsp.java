package org.apache.jsp.vistas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class add_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"../css/styless.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("        \n");
      out.write("        .container {\n");
      out.write("            display: flex;\n");
      out.write("            justify-content: space-between;\n");
      out.write("            padding: 60px;\n");
      out.write("        }\n");
      out.write("        .form-section {\n");
      out.write("            flex: 1;\n");
      out.write("            margin-right: 20px;\n");
      out.write("        }\n");
      out.write("        .table-section {\n");
      out.write("            flex: 2;\n");
      out.write("        }\n");
      out.write("        .card {\n");
      out.write("            margin-top: 20px;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("       <header class=\"navbar\">\n");
      out.write("           <img src=\"../img/GBM.png\" alt=\"Logo Izquierdo\" class=\"logo izquierda\">\n");
      out.write("        <nav class=\"menu\">\n");
      out.write("            <a href=\"../index.jsp\">Inicio</a>\n");
      out.write("            <a href=\"regi-inci.html\">Registrar Incidencia</a>\n");
      out.write("            <a href=\"#\">Mis Incidencias</a>\n");
      out.write("        </nav>\n");
      out.write("        <a href=\"login.html\">\n");
      out.write("            <img src=\"../img/usu.png\" alt=\"Logo Derecho\" class=\"logo derecha\">\n");
      out.write("        </a>\n");
      out.write("       </header> \n");
      out.write("        <div class=\"container\">\n");
      out.write("        <div class=\"form-section\">\n");
      out.write("            <h2>REGISTRO DE CLIENTES</h2>\n");
      out.write("            <form action=\"Controlador\">\n");
      out.write("                <label for=\"nombre\">DNI:</label>\n");
      out.write("                <input type=\"text\" id=\"nombre\" name=\"txtDNI\" class=\"form-control\" required>\n");
      out.write("                \n");
      out.write("                <label for=\"Apellidos\">Nombre de Cliente:</label>\n");
      out.write("                <input type=\"text\" id=\"Apellidos\" name=\"txtNOM\" class=\"form-control\" required>\n");
      out.write("                \n");
      out.write("                <label for=\"correo\">Dirección:</label>\n");
      out.write("                <input type=\"text\" id=\"correo\" name=\"txtDIR\" class=\"form-control\" required>\n");
      out.write("\n");
      out.write("                <label for=\"contraseña\">Telefono:</label>\n");
      out.write("                <input type=\"text\" id=\"contraseña\" name=\"txtTEL\" class=\"form-control\" required>\n");
      out.write("                \n");
      out.write("                <label for=\"direcion\">Contraseña:</label>\n");
      out.write("                <input type=\"text\" id=\"direcion\" name=\"txtCON\" class=\"form-control\" required>\n");
      out.write("                <br>\n");
      out.write("                <input class=\"btn btn-primary\" type=\"submit\" name=\"accion\" value=\"AGRE\">\n");
      out.write("                <a href=\"Controlador?accion=listar\">Regresar</a>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"table-section\">\n");
      out.write("            <div style=\"min-height: 120px;\">\n");
      out.write("                <div class=\"collapse\" id=\"collapseIncidencias\">\n");
      out.write("                    <div class=\"card card-body\">\n");
      out.write("                        <h3>Lista de Cliente</h3>\n");
      out.write("                        <table class=\"table\">\n");
      out.write("                            <thead>\n");
      out.write("                                <tr>\n");
      out.write("                                    <th>DNI</th>\n");
      out.write("                                    <th>Nombre de Cliente</th>\n");
      out.write("                                    <th>Dirección</th>\n");
      out.write("                                    <th>Telefono</th>\n");
      out.write("                                    <th>Contraseña</th>\n");
      out.write("                                \n");
      out.write("                                </tr>\n");
      out.write("                            </thead>\n");
      out.write("                            <tbody>\n");
      out.write("                                <!-- Aquí se llenará con datos de la base de datos -->\n");
      out.write("                            </tbody>\n");
      out.write("                        </table>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\"></script>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.0.11/dist/umd/popper.min.js\"></script>\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\n");
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
