package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/styless.css\">\n");
      out.write("        <title>Menú con Logos y Degradado</title>\n");
      out.write("        <style>\n");
      out.write("        body {\n");
      out.write("            margin: 0; /* Elimina márgenes */\n");
      out.write("            padding: 0; /* Elimina padding */\n");
      out.write("            height: 130vh; /* Ocupa toda la altura de la ventana */\n");
      out.write("            background-color: lightblue; /* Color de fondo */\n");
      out.write("            background-image: url('img/mision.png'); /* Imagen de fondo */\n");
      out.write("            background-repeat: no-repeat; /* No repetir imagen */\n");
      out.write("            background-position: center; /* Centrar imagen */\n");
      out.write("            background-size: cover; /* Cubrir todo el fondo */\n");
      out.write("        }\n");
      out.write("        h1 {\n");
      out.write("            text-align: center; /* Centrar el texto */\n");
      out.write("            color: white; /* Color del texto */\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header class=\"navbar\">\n");
      out.write("        <img src=\"img/GBM.png\" alt=\"Logo Izquierdo\" class=\"logo izquierda\">\n");
      out.write("        <nav class=\"menu\">\n");
      out.write("            <a href=\"index.html\">Inicio</a>\n");
      out.write("            <a href=\"regi-inci.html\">Registrar Incidencia</a>\n");
      out.write("            <a href=\"lista_I.html\">Mis Incidencias</a>\n");
      out.write("            <a href=\"Controlador?accion=listar\">Listar Persona</a>\n");
      out.write("            <a href=\"\">Personal Tecnico</a>\n");
      out.write("        </nav>\n");
      out.write("        <a href=\"login.jsp\">\n");
      out.write("            <img src=\"img/usu.png\" alt=\"Logo Derecho\" class=\"logo derecha\">\n");
      out.write("        </a>\n");
      out.write("\n");
      out.write("    </header>\n");
      out.write("        \n");
      out.write("        <div class=\"container\">\n");
      out.write("            <a class=\"btn btn-success btn-lg\" href=\"Controlador?accion=listar\">Listar Persona</a>\n");
      out.write("            <a class=\"btn btn-success btn-lg\" href=\"Controladordispo?accion=listardispo\">Listar Dispositivo</a>\n");
      out.write("            <a class=\"btn btn-success btn-lg\" href=\"Controladortecnic?accion=listartec\">Listar Técnicos</a>\n");
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
