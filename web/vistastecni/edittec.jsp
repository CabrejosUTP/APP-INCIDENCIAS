<%-- 
    Document   : edittec
    Created on : 10/10/2024, 11:50:14 PM
    Author     : VictorG
--%>

<%@page import="Modelo.Tecnicos"%>
<%@page import="ModeloDAO.TecnicoDAO"%>
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
              TecnicoDAO dao=new TecnicoDAO();
              int id=Integer.parseInt((String)request.getAttribute("idper"));
              Tecnicos t=(Tecnicos)dao.list(id);
          %>
            <h1>Modificar Persona</h1>
            <form action="Controladortecnic">
                CARGO DEL TÉCNICO:<br>
                <input class="form-control" type="text" name="txtCAR" value="<%= t.getCargo_tec()%>"><br>
                NOMBRE DEL TÉCNICO: <br>
                <input class="form-control" type="text" name="txtNOMBR" value="<%= t.getNombre_tec()%>"><br>    
                
                TELEFONO: <br>
                <input class="form-control" type="text" name="txtTELEF" value="<%= t.getTelefono()%>"><br> 
                ESTADO DEL TÉCNICO: <br>
                <input class="form-control" type="text" name="txtESTAD" value="<%= t.getEstado_tec()%>"><br> 
                
                <input type="hidden" name="txtidT" value="<%= t.getId_tec()%>">
                <input class="btn btn-primary" type="submit" name="accion" value="Actualizar"> 
                <a href="Controladortecnic?accion=listartec">Regresar</a>
            </form>
          </div>
          
        </div>
    </body>
</html>
