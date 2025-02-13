package com.fran.curso.springboot.webapp.controllers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fran.curso.springboot.webapp.models.User;
import com.fran.curso.springboot.webapp.models.dto.UserDto;

/**
 * Controller
 */
@RestController
@RequestMapping("/api")
public class UserRestController {

	/**
	 * @return UserDto
	 */
	@GetMapping("/details")
	public UserDto details() {

		User user = new User("Fran", "Vázquez");

		UserDto userDto = new UserDto();
		userDto.setUser(user);
		userDto.setTitle("Hola Mundo Spring Boot");

		return userDto;
	}

	/**
	 * @return List<User>
	 */
	@GetMapping("/list")
	public List<User> list() {
		User user = new User("Fran", "Vázquez");
		User user2 = new User("Elisa", "Gómez");
		User user3 = new User("Pablo", "Vázquez");
		User user4 = new User("Gonzalo", "Vázquez");

		// Opcion 1
		List<User> users = Arrays.asList(user, user2, user3, user4);

		// Opcion 2
//		List<User> users = new ArrayList<>();
//		users.add(user);
//		users.add(user2);
//		users.add(user3);
//		users.add(user4);

		return users;
	}

	/**
	 * @return String
	 */
	@GetMapping("/details-map")
	public Map<String, Object> detailsMap() {
		User user = new User("Fran", "Vázquez");
		Map<String, Object> body = new HashMap<>();

		body.put("title", "Hola Mundo Spring Boot");
		body.put("user", user);
		return body;
	}

}
