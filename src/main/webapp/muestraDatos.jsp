<%-- 
    Document   : muestraDatos
    Created on : 22-ene-2021, 21:35:46
    Author     : SergioCaballeroSáez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="modelo.Billete" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Aerolinea Bosco<h1>
        <% Billete billete = (Billete) request.getAttribute("billete"); %>
        <h2>Numero billetes: <%=billete.getCantidad() %></h2>
        <h2>Importe de los billetes: <%=billete.getImporte()%></h2>
    </body>
</html>
