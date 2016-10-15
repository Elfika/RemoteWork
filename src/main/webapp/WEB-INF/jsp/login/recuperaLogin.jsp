<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="css/style.css" type="text/css">
<link href="css/bootstrap.min.css" rel="stylesheet" media="screen">
<link href="css/bootstrap-theme.min.css" rel="stylesheet" media="screen">
<script type='text/javascript' src="js/jquery-1.11.3.min.js"></script>
<script type='text/javascript' src="js/login.js"></script>
<title>Remote Work :: Recupera datos de ingreso</title>
</head>
<body>
	<div id="recupera-contenedor" class="form-container ">
		<div id="recuperaAyuda">
			<form class="form-not-signin" name="formRec" id="formRec">
				<h4>¿En qué necesitas ayuda?</h4>
				<div class="contenedor-submit">
					<input type="radio" checked value="recuperaUsuario" name="recupera">
					Olvidé mi usuario
					<br>
					<input type="radio"  value="recuperaContrasena" name="recupera">
					Olvidé mi contraseña
					<br>
					<button class="btn btn-large btn-primary" type="button" id="tipoAyuda">Siguiente</button>
				</div>
				<a class="text-info" href="login">Volver a login</a>
			</form>
		</div>
		<div id="recuperaUsuario" class="ocultarForm">
			<form class="form-not-signin">
				<small>Para recuperar su usuario, por favor ingrese su email</small>
					<div class="contenedor-submit">
						<input class="input-block-level" type="text" placeholder="Email">
						<button class="btn btn-large btn-primary" type="submit">Enviar</button> 
					</div>
				<a class="text-info" href="recuperaLogin">Cancelar</a>
			</form>
		</div>
		<div id="recuperaContrasenia" class="recPass ocultarForm">
			<form class="form-not-signin">
				<small>Para recuperar su contraseña, por favor ingrese su usuario</small>
				<div class="contenedor-submit">
					<input class="input-block-level" type="text" placeholder="Usuario">
					<button class="btn btn-large btn-primary" type="submit">Enviar</button>
				</div>
				<a class="text-info" href="recuperaLogin">Cancelar</a>
			</form>
		</div>
	</div>
</body>
</html>