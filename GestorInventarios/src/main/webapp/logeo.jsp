<%-- 
    Document   : logeo
    Created on : 23/04/2023, 10:11:14 p. m.
    Author     : sebac
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="index.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        
        <form method="post" action="login">
            
            <label for="nombre">Nombre:</label>
            <input type="text" id="nombre" name="nombre" placeholder="Ingrese texto aquí" autocomplete="off"><br><br>

            <label for="contrasena">Contraseña: </label>
            <input type="text" id="contrasena" name="contrasena" placeholder="Ingrese texto aquí" autocomplete="off"><br><br>
            
            <button type="submit">iniciar sesion</button>
        </form>
    </body>
</html>
