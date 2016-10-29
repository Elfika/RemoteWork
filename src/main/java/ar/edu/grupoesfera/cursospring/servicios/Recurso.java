package ar.edu.grupoesfera.cursospring.servicios;
import ar.edu.grupoesfera.cursospring.modelo.Usuario;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;



public class Recurso {

	 private Set<Usuario> recursos = new TreeSet<Usuario>();
	
	
	public void agregarRecurso(Usuario usuario) {
		this.recursos.add(usuario);
	}
	
	public int obtenerCantidadRecursos() {
		return recursos.size();
	}
	
	public void listarRecursos (TreeSet<Usuario> empleado){
		Iterator <Usuario> usuario = empleado.iterator();
		while (usuario.hasNext()){
			try{
				System.out.println((usuario.next()).toString());
			}catch (NullPointerException e){
				System.err.println ("No se encontraron recursos registrados");
			}
		}
	}
}
