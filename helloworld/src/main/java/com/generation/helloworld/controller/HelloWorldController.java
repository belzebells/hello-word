package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/hello-world")

public class HelloWorldController {

	@GetMapping
	public String helloWorld() {
		return "Hello World!";
	}
	
	@GetMapping
	public String listaBsms() {
		return "BSM's da Generation!"
				+ "\nComunicação;"
				+ "\nProatividade;"
				+ "\nOrientação ao detalhe;"
				+ "\nTrabalho em equipe;"
				+ "\nOrientação ao futuro;"
				+ "\nResponsabilidade social;"
				+ "\nMentalidade de crescimento;"
				+ "\nPersistência";
	}
	
	@GetMapping
	public String objetivosAprendizagem() {
		return "objetivos de aprendizagem desta semana:"
				+ "fazer todos os exercícios no dia certo;"
				+ "rever a matéria passada no dia;"
				+ "entregar todas as atividades;"
				+ "tirar dúvidas com as pessoas instrutoras e da turma;"
				+ "não desistir;";		
						
	} 	
		
		
	

	
				
	}
	
	
