<%-- 
    Document   : regisInventario
    Created on : 24/04/2023, 10:59:45 a. m.
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
        <form method="post" action="adicionInv">
            
            <label for="tInventario">Tipo de invetario(Ej: medicamento): </label>
            <input type="text" id="tInventario" name="tInventario" placeholder="Ingrese texto aquí" autocomplete="off"><br><br>
            
            <label for="pNombre">Nombre del producto: </label>
            <input type="text" id="pNombre" name="pNombre" placeholder="Ingrese texto aquí" autocomplete="off"><br><br>

            <label for="cantidad">Cantidad: </label>
            <input type="text" id="cantidad" name="cantidad" placeholder="Ingrese texto aquí" autocomplete="off"><br><br>
            
            <label for="cBarras">Codigo de barras: </label>
            <input type="text" id="cBarras" name="cBarras" placeholder="Ingrese texto aqui" autocomplete="off"><br><br>

            <label for="Vencimiento">Vencimiento: </label>
            <input type="text" id="Vencimiento" name="Vencimiento" placeholder="Ingrese texto aquí" autocomplete="off"><br><br>
            
            <button type="submit">guardar</button>
            <button type="submit">ver </button>
        </form>
    </body>
</html>
