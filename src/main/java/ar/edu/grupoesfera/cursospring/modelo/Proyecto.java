package ar.edu.grupoesfera.cursospring.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Proyecto {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String id;
	@Column
    private String nombreProyecto;
	@Column
	private String tipoProyecto;
	@Column
	private String descripcionProyecto;
	
	
	//Constructor sin parametros
	public Proyecto(){
	}
	
	//Constructor con parametros
	public Proyecto(String nombreProyecto,String tipoProyecto, String descripcionProyecto ){
		this.nombreProyecto = nombreProyecto;
		this.tipoProyecto = tipoProyecto;
		this.descripcionProyecto = descripcionProyecto;
	}
	
	@Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }
	
	@Override
    public boolean equals(Object object) {
        if (!(object instanceof Proyecto)) {
            return false;
        }
        Proyecto other = (Proyecto) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }
	
	 @Override
	    public String toString() {
	        return "Proyecto{" + "Id=" + id + "Nombre Proyecto=" + nombreProyecto + ", Descripcion Proyecto=" + descripcionProyecto +  ", Tipo Proyecto=" + tipoProyecto + '}';
	}
}
