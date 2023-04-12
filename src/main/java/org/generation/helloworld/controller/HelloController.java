package org.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// indica para o spring que o codigo abaixo vai ser um controller
@RestController

// indica o endpoint da nossa classe controladora
@RequestMapping("/hello")
public class HelloController {

	@GetMapping
	public String hello() {
		return "Olá,Raylane. Você precisa de mais atenção aos detalhes!";
   }

	
	@GetMapping("/bsm")
	public String bsm() {
		return "Comunicação, mentalidade de crescimento, persistencia, responsabilidade pessoal, orientação ao futuro, orientação ao detalhe, proatividade, trabalho em equipe";
   }
	
	@GetMapping("/meta")
	public String meta() {
		return "Olá, eu me chamo Raylane, e para essa semana pretendo focar no trabalho em equipe.";
   }
}	
	

	