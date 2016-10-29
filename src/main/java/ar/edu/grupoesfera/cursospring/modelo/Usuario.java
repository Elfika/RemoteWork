package ar.edu.grupoesfera.cursospring.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column
    private String nombre;
	@Column
    private String apellido;
	@Column
    private int dni;
	@Column
    private String direccion;
	@Column
    private int numero;
	@Column
    private String country;
	@Column
    private String email;
	@Column
    private int telefono;
	@Column
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
    
    public Long getId() {
		return id;
	}
	public void setId(Long id) {
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
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }
	 @Override
	    public boolean equals(Object object) {
	        if (!(object instanceof Usuario)) {
	            return false;
	        }
	        Usuario other = (Usuario) object;
	        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
	            return false;
	        }
	        return true;
	    }
	 
	 @Override
	    public String toString() {
	        return "Usuario{" + "Id=" + id + "Nombre=" + nombre + ", Apellido=" + apellido +  ", DNI=" + dni + ", Dirección=" + direccion + ", Número=" + numero + ", País=" + country +", Email=" + email + "Telefono=" + telefono + "ID Skype=" + idSkype + '}';
	}
	
	/* @Override
		public int compareTo(Usuario usuario) {
			  return this.nombre.compareTo(usuario.getNombre());
			 }*/

	   /* @Override
	    public boolean equals(Object o) {
	      if (o instanceof Usuario) {
	    	  Usuario p = (Usuario)o;
	        return this.nombre.equals(p.nombre);
	      } else {
	        return false;
	      }
	    }	*/
}
