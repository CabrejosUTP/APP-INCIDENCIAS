<%-- 
    Document   : addtec
    Created on : 10/10/2024, 11:49:55 PM
    Author     : VictorG
--%>

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
                <h1>Agregar Tecnico</h1>
                <form action="Controladortecnic">
                    IDENTIFICADOR DEL TECNICO: <br>
                    <input class="form-control" type="text" name="txtIDE"><br>
                    CARGO DEL TÉCNICO:<br>
                    <input class="form-control" type="text" name="txtCAR"><br>
                    NOMBRE DEL TÉCNICO: <br>
                    <input class="form-control" type="text" name="txtNOMBR"><br>
                    TELEFONO: <br>
                    <input class="form-control" type="text" name="txtTELEF"><br>
                    ESTADO DEL TÉCNICO <br>
                    <input class="form-control" type="text" name="txtESTAD"><br>
                    
                    <input class="btn btn-primary" type="submit" name="accion" value="Agregar">
                    <a href="Controladortecnic?accion=listartec">Regresar</a>
                </form>
            </div>

        </div>
    </body>
</html>
