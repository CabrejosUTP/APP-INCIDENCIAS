<%-- 
    Document   : listardispo
    Created on : 10/10/2024, 05:31:58 PM
    Author     : VictorG
--%>

<%@page import="ModeloDAO.DispositivosDAO"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="Modelo.Dispositivos"%>
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
            <h1>Editar Dispositivos</h1>
            <a class="btn btn-success" href="Controladordispo?accion=adddispo">Agregar Nuevo</a>
            <br>
            <br>
            <table class="table table-bordered">
                <thead>
                    <tr>
                        <th class="text-center">Identificador del dispositivo</th>
                        <th class="text-center">Nombre del Dispositivo</th>
                        <th class="text-center">Tipo de Dispositivo</th>
                       
                    </tr>
                </thead>
                <%
                    DispositivosDAO dao=new DispositivosDAO();
                    List<Dispositivos>list=dao.listar();
                    Iterator<Dispositivos>iter=list.iterator();
                    Dispositivos dis=null;
                    while(iter.hasNext()){
                        dis=iter.next();
                    
                %>
                <tbody>
                    <tr>
                        <td class="text-center"><%= dis.getId_disp()%></td>
                        <td class="text-center"><%= dis.getNombre_disp()%></td>
                        <td class="text-center"><%= dis.getTipo_disp()%></td>
                        <td class="text-center">
                            <a class="btn btn-warning" href="Controladordispo?accion=editar&id=<%= dis.getId_disp()%>">Editar</a>
                            <a class="btn btn-danger" href="Controladordispo?accion=eliminar&id=<%= dis.getId_disp()%>">Remove</a>
                         
                        </td>
                    </tr>
                    <%}%>
                </tbody>
            </table>

        </div>
    </body>
</html>
