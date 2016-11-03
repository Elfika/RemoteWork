package ar.edu.grupoesfera.cursospring.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ar.edu.grupoesfera.cursospring.servicios.Recurso;
import ar.edu.grupoesfera.cursospring.modelo.Usuario;

@Controller
public class ControladorUsuario {
	private static final String[] countries = { "Argentina", "Uruguay", "Brazil", "Chile", "México", "Ecuador", "Colombia", "Otro" };

    @RequestMapping(value = "/altaUsuario")
    public String home(Model model) {
        model.addAttribute("usuario", new Usuario());
        model.addAttribute("countries",countries);
        return "admin/altaUsuario";
    }
    
 /*  @Autowired
    private Recurso Recurso;
    @RequestMapping(value="/resultadoAltaUsuario", method = RequestMethod.POST)
    public ModelAndView listado(Usuario usuario, Model model) {
     Recurso.getRecursos();
      return new ModelAndView("resultadoAltaUsuario", usuario);
    }*/
    
    @RequestMapping(value = "resultadoAltaUsuario", method = RequestMethod.POST)
    public String Form(Usuario usuario, Model model) {
        System.out.println(usuario.toString());
        model.addAttribute("resultadoAltaUsuario", usuario);
        return "admin/resultadoAltaUsuario";
}  
}
