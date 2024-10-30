<%-- 
    Document   : add
    Created on : 30-ago-2018, 19:58:16
    Author     : Joel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="../css/styless.css">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <script src="https://cdn.jsdelivr.net/npm/sweetalert2@11"></script>
        <title>JSP Page</title>
        <style>
        
        .container {
            display: flex;
            justify-content: space-between;
            padding: 60px;
        }
        .form-section {
            flex: 1;
            margin-right: 20px;
        }
        .table-section {
            flex: 2;
        }
        .card {
            margin-top: 20px;
        }
    </style>
    </head>
    <body>
        
       <header class="navbar">
           <img src="../img/GBM.png" alt="Logo Izquierdo" class="logo izquierda">
        <nav class="menu">
            <a href="../index.jsp">Inicio</a>
            <a href="regi-inci.html">Registrar Incidencia</a>
            <a href="#">Mis Incidencias</a>
        </nav>
        <a href="login.html">
            <img src="../img/usu.png" alt="Logo Derecho" class="logo derecha">
        </a>
       </header> 
        <div class="container">
        <div class="form-section">
            <h2>REGISTRO DE CLIENTES</h2>
            <form action="Controlador">
                <label for="nombre">DNI:</label>
                <input type="text" id="nombre" name="txtDNI" class="form-control" required>
                
                <label for="Apellidos">Nombre de Cliente:</label>
                <input type="text" id="Apellidos" name="txtNOM" class="form-control" required>
                
                <label for="correo">Dirección:</label>
                <input type="text" id="correo" name="txtDIR" class="form-control" required>

                <label for="contraseña">Telefono:</label>
                <input type="text" id="contraseña" name="txtTEL" class="form-control" required>
                
                <label for="direcion">Contraseña:</label>
                <input type="text" id="direcion" name="txtCON" class="form-control" required>
                <br>
                <input class="btn btn-primary" type="submit" name="accion" value="AGRE">
                <a href="Controlador?accion=listar">Regresar</a>
            </form>
        </div>

        <div class="table-section">
            <div style="min-height: 120px;">
                <div class="collapse" id="collapseIncidencias">
                    <div class="card card-body">
                        <h3>Lista de Cliente</h3>
                        <table class="table">
                            <thead>
                                <tr>
                                    <th>DNI</th>
                                    <th>Nombre de Cliente</th>
                                    <th>Dirección</th>
                                    <th>Telefono</th>
                                    <th>Contraseña</th>
                                
                                </tr>
                            </thead>
                            <tbody>
                                <!-- Aquí se llenará con datos de la base de datos -->
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.0.11/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    </body>
</html>
