package com.helloworld.hello.objetivo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivo")
public class Objetivo {

	@GetMapping
	public String objetivo() {
		return "Meu objetivo de aprendizagem foi alinhar melhor o conceito de banco de dados, "
				+ "conhecer o Spring Boot e como ele facilita os processos de uma API e familiarizar "
				+ "com o novo professor. E iniciar o projeto integrador.";
	}
}
