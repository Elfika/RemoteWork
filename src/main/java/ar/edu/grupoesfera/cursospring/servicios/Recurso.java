package ar.edu.grupoesfera.cursospring.servicios;
import ar.edu.grupoesfera.cursospring.dao.Dao;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;


@Service
public class Recurso {

	@Resource
	private Dao dao;
	
	public Recurso newRecurso(){
		return new Recurso();
	}
	
	public List<Recurso> getRecursos() {
		final List<Recurso> list = dao.find(Recurso.class);
		return list;
	}
	
}
