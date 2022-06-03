package cl.holamundo2.java;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AppControlador {
	
	@GetMapping("/saludo")
	public String saludar(Model modelo){
		modelo.addAttribute("nombre","Juan");
		return "saludo-view";
	}
	
	@GetMapping("/saludo2")
	public String saludar2(Model modelo){
		modelo.addAttribute("nombre","Pablo");
		return "saludo-view2";
	}
	
	@GetMapping("/saludo3")
	public String saludar3(@RequestParam(name="nombre", defaultValue = "Mundo") String nombre, Model modelo){
		modelo.addAttribute("nombre", nombre);
		return "saludo-view";
	}

}
