package com.example.libreria.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.libreria.entities.Autore;
import com.example.libreria.services.AutoreService;

@RestController
@RequestMapping("/autore")
public class AutoreController {
	@Autowired
	private AutoreService autoreService;
	
	@GetMapping
	public List<Autore> listaAutori() {
		return autoreService.getAllAutori();
	}
	
	@GetMapping("/{id}")
	public Optional<Autore> getAutoreById(@PathVariable Long id) {
		return autoreService.getAutoreById(id);
	}
	
	@PostMapping
	public Autore nuovoAutore(@RequestBody Autore autore) {
		return autoreService.createAutore(autore);
	}
	
	@PutMapping("/{id}")
	public Autore modificaAutore(@PathVariable Long id, @RequestBody Autore autore) {
		return autoreService.updateAutore(id, autore);
	}
	
	@DeleteMapping("/{id}")
	public Autore eliminaAutore(@PathVariable Long id) {
		return autoreService.deleteAutore(id);
	}
	
}
