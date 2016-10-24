package ar.edu.grupoesfera.cursospring.modelo;

public class Usuario {
	private int id;
    private String nombre;
    private String apellido;
    private int dni;
    private String direccion;
    private int numero;
    private String country;
    private String email;
    private int telefono;
    private String idSkype;
    
  //Constructor sin parametros
    public Usuario() {
    }
    
  //Constructor con parametros 
    public Usuario(String nombre, String apellido, int dni, String direccion, int numero, String country, String email, int telefono, String idSkype ) {
    	this.nombre= nombre;
    	this.apellido = apellido;
    	this.dni = dni;
    	this.direccion = direccion;
    	this.numero = numero;
    	this.country = country;
    	this.email = email;
    	this.telefono = telefono;
    	this.idSkype = idSkype;
    }
    
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getIdSkype() {
		return idSkype;
	}
	public void setIdSkype(String idSkype) {
		this.idSkype = idSkype;
	}
	
	 @Override
	    public String toString() {
	        return "Usuario{" + "Nombre=" + nombre + ", Apellido=" + apellido +  ", DNI=" + dni + ", Dirección=" + direccion + ", Número=" + numero + ", País=" + country +", Email=" + email + "Telefono=" + telefono + "ID Skype=" + idSkype + '}';
	}
	
}
