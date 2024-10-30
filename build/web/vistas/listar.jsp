
<%@page import="java.util.Iterator"%>
<%@page import="Modelo.Cliente"%>
<%@page import="java.util.List"%>
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
            <div class="navbar">
                <form class="form-inline" action="Controlador">
                    <input type="search" name="txtBuscar" class="form-control">
                    <input type="submit" name="ac" value="Buscar" class="btn btn-outline-success">
                    
                </form>
                
          
                
            </div>
            
            
            
            
            
            <h1>Personas</h1>
            <a class="btn btn-success" href="Controlador?accion=add">Agregar Nuevo</a>
            
            <br>
            <br>
            <table class="table table-bordered">
                <thead>
                    <tr>
                        <th class="text-center">DNI DE CLIENTE</th>
                        <th class="text-center">NOMBRE DE CLIENTE</th>
                        <th class="text-center">DIRECCION DE CLIENTE</th>
                        <th class="text-center">TELEFONO</th>
                        <th class="text-center">CONTRASEÑA</th>
                    </tr>
                </thead>
                <%
                    ClienteDAO dao=new ClienteDAO();
                    List<Cliente>list=dao.listar();
                    Iterator<Cliente>iter=list.iterator();
                    Cliente per=null;
                    while(iter.hasNext()){
                        per=iter.next();
                    
                %>
                <tbody>
                    <tr>
                        <td class="text-center"><%= per.getDni_cliente()%></td>
                        <td class="text-center"><%= per.getNombre_cliente()%></td>
                        <td class="text-center"><%= per.getDireccion_cliente()%></td>
                        <td class="text-center"><%= per.getTelefono()%></td>
                        <td class="text-center"><%= per.getContra()%></td>
                        <td class="text-center">
                            <a class="btn btn-warning" href="Controlador?accion=editar&id=<%= per.getDni_cliente()%>">Editar</a>
                            <a class="btn btn-danger" href="Controlador?accion=eliminar&id=<%= per.getDni_cliente()%>">Remove</a>
                         
                        </td>
                    </tr>
                    <%}%>
                </tbody>
            </table>

        </div>
    </body>
</html>
