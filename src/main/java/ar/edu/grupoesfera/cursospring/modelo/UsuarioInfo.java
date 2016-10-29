package ar.edu.grupoesfera.cursospring.modelo;

public class UsuarioInfo {
	 private String usuario;
	 private String password;
	 private String check;
	 
	//Constructor sin parametros
	 public UsuarioInfo(){		 
	 }
	 
	 //Constructor con parametros
	 public UsuarioInfo(String usuario, String password, String check){	
		 this.usuario = usuario;
		 this.password = password;
		 this.check = check;
	 }
	 
	 public String getUsuario() {
	     return usuario;
	 }
	 
	 public void setUsuario(String usuario) {
	     this.usuario = usuario;
	 }
	 
	 public String getPassword() {
	     return password;
	 }
	 
	 public void setPassword(String password) {
	     this.password = password;
	 }

	public String getCheck() {
		return check;
	}

	public void setCheck(String check) {
		this.check = check;
	}
	 
}
