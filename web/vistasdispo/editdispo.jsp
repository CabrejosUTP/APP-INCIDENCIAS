<%-- 
    Document   : editdispo
    Created on : 10/10/2024, 05:31:46 PM
    Author     : VictorG
--%>

<%@page import="Modelo.Dispositivos"%>
<%@page import="ModeloDAO.DispositivosDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container">
            <div class="col-lg-6">
              <%
              DispositivosDAO dao=new DispositivosDAO();
              int id=Integer.parseInt((String)request.getAttribute("idper"));
              Dispositivos d=(Dispositivos)dao.list(id);
          %>
            <h1>Modificar Persona</h1>
            <form action="Controladordispo">
                NOMBRE DE DISPOSITIVO:<br>
                <input class="form-control" type="text" name="txtNOMB" value="<%= d.getNombre_disp()%>"><br>
                TIPO DE DISPOSITIVO: <br>
                <input class="form-control" type="text" name="txtTIPODIS" value="<%= d.getTipo_disp()%>"><br>    
                <input type="hidden" name="txtidee" value="<%= d.getId_disp()%>">
                <input class="btn btn-primary" type="submit" name="accion" value="Actualizar"> 
                <a href="Controladordispo?accion=listardispo">Regresar</a>
            </form>
          </div>
          
        </div>
    </body>
</html>
