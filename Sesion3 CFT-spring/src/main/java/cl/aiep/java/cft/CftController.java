package cl.aiep.java.cft;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CftController {
	
	@GetMapping("/")
	public String index( ) {
		return "index"; //nombre de la plantilla de Thymeleaf (sin .html)
	}
	
	@GetMapping ("/alumno")
	public String alumnoForm(Alumno alumno) {
		return "alumno-form";
	}
	
	@PostMapping ("alumno")
	public String alumnoProcesar(@Valid Alumno alumno, BindingResult informeValidacion) {
		if (informeValidacion.hasErrors()) {
			return "alumno-form"; //Si hubieron errores, vuelve a la vista del form
		}
		return "alumno-ficha"; // Si no hubieron errores, muestra la ficha de almuno
	}

}
