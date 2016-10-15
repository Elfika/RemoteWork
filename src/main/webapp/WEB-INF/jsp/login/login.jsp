<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="css/style.css" type="text/css">
<link href="css/bootstrap.min.css" rel="stylesheet" media="screen">
<link href="css/bootstrap-theme.min.css" rel="stylesheet" media="screen">
<script type='text/javascript' src="js/login.js"></script>
<title>Remote Work :: Login</title>
</head>
<body>
	<div class="form-container text-center">
		<form class="form-signin" onsubmit="return validarFormulario()">
			<h2>Remote Work</h2>
			<input id="usuario" class="input-block-level" type="text" placeholder="Usuario"  title="Ingresa tu usuario" required>
			<p class="text-error">Dato Requerido</p>
			<input id="password" class="input-block-level" type="password" placeholder="Contraseña" required>
			<p class="text-error">Dato Requerido</p>
			<label class="checkbox">
				<input type="checkbox" value="remember-me">
				Recuerda mi usuario
			</label>
			<button class="btn btn-large btn-primary" type="submit" onclick="validacion()">Ingrese</button>
		</form>
		<br>
		<a class="text-info" href="recuperaLogin">¿Necesitas ayuda para ingresar?</a>
	</div>
</body>
</html>