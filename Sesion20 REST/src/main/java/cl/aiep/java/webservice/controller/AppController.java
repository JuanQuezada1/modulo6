package cl.aiep.java.webservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import cl.aiep.java.webservice.modelo.Usuario;

@Controller
public class AppController {

	@GetMapping("/")
	public String consumirWebService(RestTemplate restTemplate, Model modelo) {
		String url = "https://jsonplaceholder.typicode.com/users";
		// transforma el json recibido en un array de usuarios
		Usuario[] usuarios = restTemplate.getForObject(url, Usuario[].class);
		modelo.addAttribute("usuarios",usuarios);
		return "usuarios";
	}
}