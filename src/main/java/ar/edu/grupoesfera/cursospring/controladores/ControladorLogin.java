package ar.edu.grupoesfera.cursospring.controladores;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControladorLogin {
	@RequestMapping (value="/login")
	public ModelAndView mostrarLogin(){		
		return new ModelAndView("login/login");
	}
	
	@RequestMapping (value="/recuperaLogin")
	public ModelAndView mostrarRecuperaLogin(){
		return new ModelAndView ("login/recuperaLogin");
	}
	
	@RequestMapping (value="/cambiaContrasena")
	public ModelAndView mostrarCambiaContrasena(){
		return new ModelAndView ("login/cambiaContrasena");
	}
	
}