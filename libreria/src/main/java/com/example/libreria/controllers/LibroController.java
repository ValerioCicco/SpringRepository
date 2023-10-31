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

import com.example.libreria.entities.Libro;
import com.example.libreria.services.LibroService;

@RestController
@RequestMapping("/libro")
public class LibroController {
	
	@Autowired
	private LibroService libroService;
	
	@GetMapping
	public List<Libro> listaLibri() {
		return libroService.getAllLibri();
	}
	
	@GetMapping("/{id}")
	public Optional<Libro> getLibroById(@PathVariable Long id) {
		return libroService.getLibroById(id);
	}
	
	@PostMapping
	public Libro nuovoLibro(@RequestBody Libro libro) throws Exception {
		return libroService.createLibro(libro);
	}
	
	@PutMapping("/{id}")
	public Libro modificaLibro(@PathVariable Long id, @RequestBody Libro libro) {
		return libroService.updateLibro(id, libro);
	}
	
	@DeleteMapping("/{id}")
	public Libro eliminaLibro(@PathVariable Long id) {
		return libroService.deleteLibro(id);
	}
}
