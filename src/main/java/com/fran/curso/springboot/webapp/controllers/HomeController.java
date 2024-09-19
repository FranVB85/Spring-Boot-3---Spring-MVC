package com.fran.curso.springboot.webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Clase HomeController
 */
@Controller
public class HomeController {

	/**
	 * @return String
	 */
	@GetMapping({ "", "/", "/home" })
	public String home() {

//		return "forward:/list"; // Redirige sin cambiar la URL, usado para Swith dentro de la misma Request

		return "redirect:/list"; // Redirige cambiando toda la URL, típico en CRUD
	}

}
