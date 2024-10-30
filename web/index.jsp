
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/styless.css">
        <title>Menú con Logos y Degradado</title>
        <style>
        body {
            margin: 0; /* Elimina márgenes */
            padding: 0; /* Elimina padding */
            height: 130vh; /* Ocupa toda la altura de la ventana */
            background-color: lightblue; /* Color de fondo */
            background-image: url('img/mision.png'); /* Imagen de fondo */
            background-repeat: no-repeat; /* No repetir imagen */
            background-position: center; /* Centrar imagen */
            background-size: cover; /* Cubrir todo el fondo */
        }
        h1 {
            text-align: center; /* Centrar el texto */
            color: white; /* Color del texto */
        }
    </style>
    </head>
    <body>
        <header class="navbar">
        <img src="img/GBM.png" alt="Logo Izquierdo" class="logo izquierda">
        <nav class="menu">
            <a href="index.html">Inicio</a>
            <a href="regi-inci.html">Registrar Incidencia</a>
            <a href="lista_I.html">Mis Incidencias</a>
            <a href="Controlador?accion=listar">Listar Persona</a>
            <a href="">Personal Tecnico</a>
        </nav>
        <a href="login.jsp">
            <img src="img/usu.png" alt="Logo Derecho" class="logo derecha">
        </a>

    </header>
        
        <div class="container">
            <a class="btn btn-success btn-lg" href="Controlador?accion=listar">Listar Persona</a>
            <a class="btn btn-success btn-lg" href="Controladordispo?accion=listardispo">Listar Dispositivo</a>
            <a class="btn btn-success btn-lg" href="Controladortecnic?accion=listartec">Listar Técnicos</a>
        </div>
    </body>
</html>
