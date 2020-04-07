package com.uca.capas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.uca.capas.domain.usuario;

@Controller
public class Maincontroller {
	@GetMapping("/agregarusuario")
	public String enviarForm(usuario usuario) {
		return "agregarusuario";
	}
	@PostMapping("/agregarusuario")
	public String procesarForm(usuario usuario) {
		return "mostrarmensaje";
	}
}
