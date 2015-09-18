<%-- 
    Document   : Errors
    Created on : 13-sep-2015, 1:05:46
    Author     : osanchez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="u" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Error page</title>
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="css/estilos.css">
        <script src="js/jquery-1.11.3.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
    </head>
    <body>
        <h1>Ocurrio un error:</h1>
        <h2><p>${mensaje_error}</h2>
        <a href="Index.jsp">Volver...</a>
    </body>
</html>
