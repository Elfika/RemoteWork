package ar.edu.grupoesfera.cursospring.modelo;

public class UsuarioInfo {
	 private String userName;
	 private String password;
	 
	//Constructor sin parametros
	 public UsuarioInfo(){		 
	 }
	 
	 //Constructor con parametros
	 public UsuarioInfo(String userName, String password){	
		 this.userName = userName;
		 this.password = password;
	 }
	 
	 public String getUserName() {
	     return userName;
	 }
	 
	 public void setUserName(String userName) {
	     this.userName = userName;
	 }
	 
	 public String getPassword() {
	     return password;
	 }
	 
	 public void setPassword(String password) {
	     this.password = password;
	 }
	 
}
