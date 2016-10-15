function validarFormulario(){
  var nombre = document.forms["formulario"]["nombre"].value;
  var email = document.forms["formulario"]["email"].value;
  var nip = document.forms["formulario"]["nip"].value;
  var nip_again = document.forms["formulario"]["nip_again"].value;
  var email_t = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;
  
  /* document.getElementById("nombre").style.border="1px solid black";
  document.getElementById("email").style.border="1px solid black";
  document.getElementById("nip").style.border="1px solid black";
  document.getElementById("nip_again").style.border="1px solid black"; */
  var error = false;
  
  if(nombre == ""){
    document.getElementById("nombre").style.border="1px solid red";
    error = true;
  }
  if(email == "" || !email_t.test(email)){
    document.getElementById("email").style.border="1px solid red";
    error = true;
  }
  if(nip == "" || nip.length != 4){
    document.getElementById("nip").style.border="1px solid red";
    error = true;
  }
  if(nip_again == "" || nip_again.length != 4){
    document.getElementById("nip_again").style.border="1px solid red";
    error = true;
  }
  if(nip != nip_again){
    document.getElementById("nip").style.border="1px solid red";
    document.getElementById("nip_again").style.border="1px solid red";
    error = true;
  }
  
  if(error){
    return false;
  }
  return true;
}