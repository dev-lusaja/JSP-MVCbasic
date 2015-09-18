<%-- 
    Document   : index
    Created on : 12-sep-2015, 17:44:49
    Author     : osanchez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="u" %>
<!DOCTYPE html>
<html>
<head>
    <title>Login</title>
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="css/estilos.css">
    <script src="js/jquery-1.11.3.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
</head>
<body>
    <u:if test="${mensaje != null}">
        <div class="alert alert-warning alert-dismissible" role="alert">
            <button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span></button>
            <strong>${mensaje}</strong>
        </div>
    </u:if>
    <u:if test="${mensaje_error != null}">
        <div class="alert alert-danger alert-dismissible" role="alert">
            <button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span></button>
            <strong>${mensaje_error}</strong>
        </div>
    </u:if>
    <div class="helper"><!-- 
    --></div>
    <div class="trans">
        <form action="loginusuarios.do" method="post">
            <center><p class="login_text login_title">Sistema de acceso</p></center>
            <br>
            <div class="form-group">
                <div class="input-group">
                    <div class="input-group-addon">
                        <span class="glyphicon glyphicon-user" aria-hidden="true"></span></div>
                        <input type="text" class="form-control" id="usuario" name="usuario" placeholder="usuario" required>
                    </div>  
            </div>
            <div class="form-group">
                <div class="input-group">
                    <div class="input-group-addon">
                        <span class="glyphicon glyphicon-asterisk" aria-hidden="true"></span></div>
                        <input type="password" class="form-control" id="clave" name="clave" placeholder="*******" required>
                </div>  
            </div>
            <div>
                <input id="VentanaLogin_LoginButton" class="btn btn-success" type="submit" value="INGRESAR" name="Ventanalogin$LoginButton"></input>
            </div>  			
            <div class="div_register">		  				
                <p class="login_text">Si no dispones de una cuenta . .</p>
                <a href="Registrarse.jsp" class="btn btn-danger" type="submit">REGISTRATE</a>
            </div>
        </form>
        <br>
        <p class="test">tambien puedes mirar los usuarios de <a  class="btn btn-info" href="listarusuarios.do">Prueba</a></p>
    </div>
</body>
</html>