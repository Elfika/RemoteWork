$(document).ready(function(){
	var selTipoAyuda;
	$("#tipoAyuda").click(function () {	 
		selTipoAyuda = $('input:radio[name=recupera]:checked').val();
		if(selTipoAyuda=="recuperaUsuario"){
			$('#recuperaAyuda').hide();
			$('#recuperaUsuario').show();
		}
		else{
			$('#recuperaAyuda').hide();
			$('#recuperaContrasenia').show();
			
		};
	});
});





function validacion() {
	var usu = document.getElementById("usuario").value;
	var pass = document.getElementById("password").value;

	if(usu == null || usu.length == 0) {
	  return false;
	}
	
	if( pass == null || pass.length == 0) {
		  return false;
	}
 return datosIngreso();
	
};

function datosIngreso(){
	var usu = document.getElementById("usuario").value;
	var pass = document.getElementById("password").value;
	
	if (usu=="admin" && pass=="admin"){
		alert("ingresa admin");
	}
	
	if(usu=="guest" && pass=="guest"){
		alert("ingresa invitado");
	}
};

