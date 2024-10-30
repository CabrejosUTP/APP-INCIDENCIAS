<%-- 
    Document   : login
    Created on : 29/10/2024, 08:05:26 PM
    Author     : VictorG
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="Modelo.Cliente"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/styles.css">
        <title>JSP Page</title>
    </head>
    <body>
    <nav class="menu">
        <div class="logo">
            <img src="img/GBM.png" alt="Logo" />
        </div>
        <ul>

            <li><a href="index.jsp">INICIO</a></li>
            <li><a href="login.jsp">INICIAR SESION</a></li>
            
        </ul>
    </nav>
    

  
    <div class="login-container">
        <form class="login-form">
            
            <div class="logo-form">
                <img src="img/martinez.jpeg" alt="Logo del Formulario" />
                <input type="text" placeholder="Usuario" required>
                <input type="password" placeholder="Contraseña" required>
            </div>
            <button type="submit">Iniciar Sesión</button>
        </form>
        
        
        
        
    </div>
</body>
</html>

