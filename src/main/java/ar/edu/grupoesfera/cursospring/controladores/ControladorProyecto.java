package ar.edu.grupoesfera.cursospring.controladores;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ar.edu.grupoesfera.cursospring.modelo.Proyecto;



public class ControladorProyecto {
	private static final String[] tipos = { "Web", "Mobil", "Marketing", "Publicidad", "Animación", "Gráfica", "Otro" };
	
	@RequestMapping(value = "/altaProyecto")
    public String home(Model model) {
        model.addAttribute("proyecto", new Proyecto());
        model.addAttribute("tipos",tipos);
        return "admin/altaProyecto";
    }
	
	@RequestMapping(value = "resultadoAltaProyecto", method = RequestMethod.POST)
    public String Form(Proyecto proyecto, Model model) {
        System.out.println(proyecto.toString());
        model.addAttribute("resultadoAltaProyecto", proyecto);
        return "admin/resultadoAltaProyecto";
	}
}
