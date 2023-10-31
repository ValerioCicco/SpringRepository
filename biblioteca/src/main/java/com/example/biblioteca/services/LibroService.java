package com.example.biblioteca.services;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.biblioteca.models.Libro;
import com.example.biblioteca.repositories.LibroRepository;

@Service
public class LibroService {
	
	@Autowired
	private LibroRepository lr;
	
	public Collection<Libro> getAll() {
		return lr.ottieniTutti();
	}
	
	public Libro getLibroById(Long id) {
		return lr.getLibroById(id);
	}
	
	public Libro addLibro(Libro libro) {
		return lr.creaLibro(libro);
	}

	public void deleteLibro(Long id) {
		lr.eliminaLibro(id);
	}
	
	public Libro updateLibro(Libro libro, Long id) {
		return lr.aggiornaLibro(id, libro);
	}
	
	//METODO GESTIONE QUANTITà DISPONIBILE DEI LIBRI (PRESO DA MIRKO)
	public void decrementaQuantitaDisponibile(Long libroId) {
        Libro libro = lr.getLibroById(libroId);
        if (libro != null && libro.getQuantitàDisponibile() > 0) {
        	libro.setQuantitàDisponibile(libro.getQuantitàDisponibile() - 1);
        }
	}
		
	public void incrementaQuantitaDisponibile(Long libroId) {
        Libro libro = lr.getLibroById(libroId);
        if (libro != null) {
            libro.setQuantitàDisponibile(libro.getQuantitàDisponibile() + 1);
        }
    }
}
