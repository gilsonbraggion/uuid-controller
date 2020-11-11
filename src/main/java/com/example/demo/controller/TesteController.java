package com.example.demo.controller;

import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TesteController {
	
	@GetMapping(value = "/teste/{idObjeto}")
	public void testeMApping(@PathVariable UUID idObjeto) {
		
		System.out.println("Dado recebido -> " + idObjeto);
		
	}
	
}
