<%-- 
    Document   : adddispo
    Created on : 10/10/2024, 05:31:06 PM
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
                <h1>Agregar Persona</h1>
                <form action="Controladordispo">
                    IDENTIFICADOR DEL DISPOSITIVO:<br>
                    <input class="form-control" type="text" name="txtDISPO"><br>
                    NOMBRE DEL DISPOSITIVO<br>
                    <input class="form-control" type="text" name="txtNOMB"><br>
                    TIPO DE DISPOSITIVO: <br>
                    <input class="form-control" type="text" name="txtTIPODIS"><br>
                    <input class="btn btn-primary" type="submit" name="accion" value="Agregar">
                    <a href="Controladordispo?accion=listardispo">Regresar</a>
                </form>
            </div>

        </div>
    </body>
</html>
