package ar.edu.grupoesfera.cursospring.controladores;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import ar.edu.grupoesfera.cursospring.modelo.Usuario;

@Controller
public class ControladorUsuario {
	private static final String[] countries = { "Spain", "México", "Ecuador" };

    @RequestMapping(value = "/altaUsuario")
    public String home(Model model) {
        model.addAttribute("usuario", new Usuario());
        model.addAttribute("countries",countries);
        return "altaUsuario";
    }

    @RequestMapping(value = "resultadoAltaUsuario", method = RequestMethod.POST)
    public String Form(Usuario usuario, Model model) {
        System.out.println(usuario.toString());
        model.addAttribute("resultadoAltaUsuario", usuario);
        return "resultadoAltaUsuario";
} 
}
