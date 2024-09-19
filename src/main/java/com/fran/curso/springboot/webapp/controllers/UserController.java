package com.fran.curso.springboot.webapp.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.fran.curso.springboot.webapp.models.User;

/**
 * Controller
 */
@Controller
public class UserController {

	/**
	 * @param model
	 * @return String
	 */
	@GetMapping("/details")
	public String details(Model model) {

		User user = new User("Fran", "Vázquez", "fjvazquez85@hotmail.com");
		user.setEmail("fjvazquez85@hotmail.com");
		model.addAttribute("title", "Hola Mundo Spring Boot");
		model.addAttribute("user", user);

		return "details";
	}

	/**
	 * @param model
	 * @return String
	 */
	@GetMapping("/list")
	public String list(Model model) {

		// model.addAttribute("users", users);
		model.addAttribute("title", "Listado de usuarios!");

		return "list";
	}

	/**
	 * @return List<User>
	 */
	@ModelAttribute("users")
	public List<User> usersModel() {
		return Arrays.asList(new User("Pablo", "Vázquez"), new User("Gonzalo", "Vázquez"),
				new User("Elisa", "Gómez", "elisalaura85@hotmail.com"),
				new User("Francisco", "Vázquez", "fjvazquez85@hotmial.com"));
	}

}
