<%-- 
    Document   : Registrarse
    Created on : 13-sep-2015, 13:00:29
    Author     : osanchez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Registro</title>
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="css/estilos.css">
    <script src="js/jquery-1.11.3.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
</head>
<body>
    <p class="ingresa">¿Ya te encuentras registrado? <a class="btn btn-danger" href="Index.jsp">INGRESA</a></p>
    <div class="helper"><!-- 
    --></div>
    <div class="trans">
        <form action="insertusuario.do" method="post">
            <div class="form-group">
                <div class="input-group">
                    <div class="input-group-addon">
                        <span class="glyphicon glyphicon-exclamation-sign" aria-hidden="true"></span></div>
                        <input type="text" class="form-control" id="nombres" name="nombres" placeholder="nombres" required>
                </div>
            </div>
            <div class="form-group">
                <div class="input-group">
                    <div class="input-group-addon">
                        <span class="glyphicon glyphicon-exclamation-sign" aria-hidden="true"></span></div>
                    <input type="text" class="form-control" id="apellidos" name="apellidos" placeholder="apellidos" required>
                </div>
            </div>
            <div class="form-group">
                <div class="input-group">
                    <div class="input-group-addon">
                        <span class="glyphicon glyphicon-envelope" aria-hidden="true"></span></div>
                        <input type="email" class="form-control" id="email" name="email" placeholder="email" required>
                </div>
            </div>
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
                        <input type="password" class="form-control" id="clave" name="clave" placeholder="clave" required>
                </div>
            </div>
            <button type="submit" class="btn btn-success">Registrar</button>
        </form>    		
    </div>
</body>
</html>