package com.example.biblioteca.controllers;

import java.util.Collection;
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

import com.example.biblioteca.models.Libro;
import com.example.biblioteca.services.LibroService;

@RestController
@RequestMapping("/libro")
public class LibroController {
	
	@Autowired
	private LibroService ls;
	
	@GetMapping
	public Collection<Libro> getAllLibri() {
		return ls.getAll();
	}
	
	@GetMapping("/{id}")
    public Libro getLibroById(@PathVariable Long id) {
        return ls.getLibroById(id);
    }
	
	@PostMapping
    public Libro nuovoLibro(@RequestBody Libro libro) {
        return ls.addLibro(libro);
    }
	
	@PutMapping("/{id}")
	public Libro modificaLibro(@PathVariable Long id, @RequestBody Libro libro) {
		return ls.updateLibro(libro, id);
	}
	
	@DeleteMapping("/{id}")
	public void elminaLibro(Long id) {
        ls.deleteLibro(id);
    }
}
