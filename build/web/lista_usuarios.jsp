<%-- 
    Document   : lista_usuarios
    Created on : 12-sep-2015, 21:52:09
    Author     : osanchez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="u" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista de usuarios</title>
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="css/estilos.css">
        <script src="js/jquery-1.11.3.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
    </head>
    <body>
        <center><h1>Lista de usuarios de prueba</h1></center>
        <div class="volver">
            <a class="btn btn-danger" href="Index.jsp">Regresar a la pagina de inicio</a>
        </div>
        <br>
        <table class="table table-hover">
            <thead class="thead">
                <tr>
                    <td>Usuario</td>
                    <td>Clave</td>
                </tr>
            </thead>
            <tbody>
                <u:forEach items="${lista_usuarios}" var="usuario">
                    <tr>
                        <td>${usuario.usuario}</td>
                        <td>${usuario.clave}</td>
                    </tr>
                </u:forEach>
            </tbody>    
        </table>
    </body>
</html>
