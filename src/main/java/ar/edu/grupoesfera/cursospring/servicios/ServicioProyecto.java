package ar.edu.grupoesfera.cursospring.servicios;
import java.util.List;
import javax.annotation.Resource;
import ar.edu.grupoesfera.cursospring.dao.Dao;
import ar.edu.grupoesfera.cursospring.modelo.Proyecto;

public class ServicioProyecto {
	@Resource
	private Dao dao;
	
	public Proyecto newProyecto(){
		return new Proyecto();
	}
	
	public List<Proyecto> getProyecto() {
		final List<Proyecto> list = dao.find(Proyecto.class);
		return list;
	}
}
