package com.generation.helloworld.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {
	
	@GetMapping
	public String helloWorld() {
		return "Hello World!";
	}
	
	@GetMapping("/bsms")
    public List<String> bsmList() {
        List<String> bsms = Arrays.asList(
        		"Trabaho em Grupo",
        		"Persistência", 
        		"Proatividade"
        );
        return bsms;
    }

    @GetMapping("/objetivos")
    public List<String> objetivosA() {
        List<String> objetivos = Arrays.asList(
            "Aprender sobre Spring Boot",
            "Praticar a criação de endpoints",
            "Melhorar habilidades em desenvolvimento"
        );
        return objetivos;
    }
}
