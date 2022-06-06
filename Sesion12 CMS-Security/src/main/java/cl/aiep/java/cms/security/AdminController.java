package cl.aiep.java.cms.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import cl.aiep.java.cms.model.Usuario;
import cl.aiep.java.cms.service.UsuarioService;

@Controller
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	UsuarioService usuarioService;
	
	@GetMapping("/instalar")
	public String instalar() {
		if(usuarioService.cantidadUsuarios() == 0){
		// Si la tabla de usuarios esta vacia, crea un usuario administrador generico.
		Usuario usuario = new Usuario(null,"juan@123.cl", "1234", "ADMIN");
		usuarioService.crearUsuario(usuario);
		}
		return "redirect:/";
	}
	
	@GetMapping("/reporte")
	public String reporte() {
		return "admin/reporte";
	}

	@GetMapping("/index")
	public String index() {
		return "admin/index";
	}

	
	
}