<%-- 
    Document   : Logeado
    Created on : 13-sep-2015, 0:51:40
    Author     : osanchez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="u" %>
<html>
<head>
    <title>Perfil</title>
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="css/estilos.css">
    <script src="js/jquery-1.11.3.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
</head>
<body>
    <u:forEach items="${datos_usuario}" var="user">
        <u:set var="usuario" value="${user.usuario}"></u:set>
        <u:set var="clave" value="${user.clave}"></u:set>
        <u:set var="nombre" value="${user.nombre}"></u:set>
        <u:set var="apellido" value="${user.apellido}"></u:set>
        <u:set var="email" value="${user.email}"></u:set>
    </u:forEach>
    <nav>
        <div class="logout">
            <a class="btn btn-danger" href="Index.jsp">Cerrar Sesion</a>
	</div>
    </nav>
    <section>
        <form action="updateusuario.do" method="post">
	<div class="panel panel-default">  
            <div class="input-group">
                <div class="input-group-addon addon-perfil">
                    <span class="glyphicon glyphicon-user" aria-hidden="true"></span>
                </div>
                <div class="panel-heading">Datos de usuario</div>
            </div>
            <div class="panel-body">
                <div class="form-group">
                    <div class="input-group">
                        <div class="input-group-addon">Usuario</div>
                        <input type="text" class="form-control" id="usuario" name="usuario" value="${usuario}" required>
                    </div>
                </div>
                <div class="form-group">
                    <div class="input-group">
                        <div class="input-group-addon">Contraseña</div>
                        <input type="password" class="form-control" id="clave" name="clave" value="${clave}" required>
                    </div>
                </div>
            </div>
	</div>
	<div class="panel panel-default">
            <div class="input-group">
	        <div class="input-group-addon addon-perfil">
	    	<span class="glyphicon glyphicon-exclamation-sign" aria-hidden="true"></span>
                </div>
                <div class="panel-heading">Datos Personales</div>
            </div>
                <div class="panel-body">
                        <div class="form-group">
                            <div class="input-group">
                                <div class="input-group-addon">Nombres</div>
                                <input type="text" class="form-control" id="nombres" name="nombres" value="${nombre}" required>
                            </div>    
                        </div>
                        <div class="form-group">
                            <div class="input-group">
                                <div class="input-group-addon">Apellidos</div>
                                <input type="text" class="form-control" id="apellidos" name="apellidos" value="${apellido}" required="">
                            </div>    
                        </div>
                        <div class="form-group">
                            <div class="input-group">
                                <div class="input-group-addon">Email</div>
                                <input type="email" class="form-control" id="emai" name="email" value="${email}" required>
                            </div>
                        </div>
                        <button type="submit" class="btn btn-success">Actualizar</button>
                </div>
	</div>
    </form>
    </section>
</body>
</html>