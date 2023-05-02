<%-- 
    Document   : datos
    Created on : 26/04/2023, 6:26:56 p. m.
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
        <%
            
            String dat = (String) request.getSession().getAttribute("datos");
        %>
        
        <table>
            <tr>
                <th>Tipo</th>
                <th>Nombre</th>
                <th>Cantidad</th>
                <th>vencimiento</th>
                <th>Identificacion</th>
            </tr>
            <%= dat%>
                        
        </table>
        
        <form method="POST" action="regisInventario.jsp">
            <button>otro articulo</button>
        </form>
            
        <form method="POST" action="adicionInv">
            <label for="eliminar">Fila para eliminar</label>
            <input type="text" name="eliminar" id="eliminar" placeholder="Ingrese texto aquí" autocomplete="off">
        </form>
        
    </body>
</html>
