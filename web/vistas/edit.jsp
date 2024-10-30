
<%@page import="Modelo.Cliente"%>
<%@page import="ModeloDAO.ClienteDAO"%>
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
              ClienteDAO dao=new ClienteDAO();
              int id=Integer.parseInt((String)request.getAttribute("idper"));
              Cliente p=(Cliente)dao.list(id);
          %>
            <h1>Modificar Persona</h1>
            <form action="Controlador">
                NOMBRE DE CLIENTE:<br>
                <input class="form-control" type="text" name="txtNOM" value="<%= p.getNombre_cliente()%>"><br>
                DIRECCION DE CLIENTE: <br>
                <input class="form-control" type="text" name="txtDIR" value="<%= p.getDireccion_cliente()%>"><br>
                TELEFONO: <br>
                <input class="form-control" type="text" name="txtTEL" value="<%= p.getTelefono()%>"><br>
                CONTRASENA <br>
                <input class="form-control" type="text" name="txtCON" value="<%= p.getContra()%>"><br>
                
                <input type="hidden" name="txtid" value="<%= p.getDni_cliente()%>">
                <input class="btn btn-primary" type="submit" name="accion" value="Actualizar"> 
                <a href="Controlador?accion=listar">Regresar</a>
            </form>
          </div>
          
        </div>
    </body>
</html>
