package com.fran.curso.springboot.webapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fran.curso.springboot.webapp.models.dto.ParamDto;
import com.fran.curso.springboot.webapp.models.dto.ParamMixDto;

import jakarta.servlet.http.HttpServletRequest;

/**
 * Clase Request
 * 
 */
@RestController
@RequestMapping("/api/params")
public class RequestParamsController {

	/**
	 * @param message
	 * @return ParamDto
	 */
	@GetMapping("/foo")
	public ParamDto foo(@RequestParam(required = false, defaultValue = "Hola que tal") String message) {

		ParamDto param = new ParamDto();
		param.setMessage(message);
		return param;
	}

	/**
	 * @param text
	 * @param code
	 * @return ParamDto
	 */
	@GetMapping("/bar")
	public ParamMixDto bar(@RequestParam String text, @RequestParam Integer code) {

		ParamMixDto params = new ParamMixDto();
		params.setMessage(text);
		params.setCode(code);
		return params;
	}

	/**
	 * Metodo Request
	 * 
	 * @param request
	 * @return ParamMixDto
	 */
	@GetMapping("/request")
	public ParamMixDto request(HttpServletRequest request) {
		Integer code = 0;
		try {
			code = Integer.parseInt(request.getParameter("code"));
		} catch (NumberFormatException e) {

		}
		ParamMixDto params = new ParamMixDto();
		params.setCode(code);
		params.setMessage(request.getParameter("message"));
		return params;
	}
}
