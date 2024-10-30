<%-- 
    Document   : listartec
    Created on : 10/10/2024, 11:50:26 PM
    Author     : VictorG
--%>

<%@page import="java.util.Iterator"%>
<%@page import="Modelo.Tecnicos"%>
<%@page import="java.util.List"%>
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
            <h1>Listar Técnicos</h1>
            <a class="btn btn-success" href="Controladortecnic?accion=addtec">Agregar Nuevo</a>
            <br>
            <br>
            <table class="table table-bordered">
                <thead>
                    <tr>
                        <th class="text-center">Identificador del Técnico</th>
                         <th class="text-center">Cargo del Técnico</th>
                          <th class="text-center">Nombre del Técnico</th>
                           <th class="text-center">Telefono del Técnico</th>
                            <th class="text-center">Estado del Técnico</th>
                    
                    </tr>
                </thead>
                <%
                    TecnicoDAO dao=new TecnicoDAO();
                    List<Tecnicos>list=dao.listar();
                    Iterator<Tecnicos>iter=list.iterator();
                    Tecnicos tcs=null;
                    while(iter.hasNext()){
                        tcs=iter.next();
                    
                %>
                <tbody>
                    <tr>
                        <td class="text-center"><%= tcs.getId_tec()%></td>
                        <td class="text-center"><%= tcs.getCargo_tec()%></td>
                        <td class="text-center"><%= tcs.getNombre_tec()%></td>
                        <td class="text-center"><%= tcs.getTelefono()%></td>
                        <td class="text-center"><%= tcs.getEstado_tec()%></td>
                       
                        <td class="text-center">
                            <a class="btn btn-warning" href="Controladortecnic?accion=editar&id=<%= tcs.getId_tec()%>">Editar</a>
                            <a class="btn btn-danger" href="Controladortecnic?accion=eliminar&id=<%= tcs.getId_tec()%>">Remove</a>
                         
                        </td>
                    </tr>
                    <%}%>
                </tbody>
            </table>

        </div>
    </body>
</html>
