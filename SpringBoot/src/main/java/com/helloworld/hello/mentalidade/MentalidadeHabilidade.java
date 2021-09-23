package com.helloworld.hello.mentalidade;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mentalidade-habilidade")
public class MentalidadeHabilidade {
	
	@GetMapping 
	public String mentalidadeHabilidade() {
		return "Persistência e Trabalho em Equipe";
	}
	
}
