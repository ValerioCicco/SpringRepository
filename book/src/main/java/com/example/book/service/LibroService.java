package com.example.book.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.book.entities.Libro;

@Service
public class LibroService {
	private final Map<Long, Libro> libri = new HashMap<>();
	private Long currentId = 1L;
	
	//Metodo per aggiungere un libro
	public Libro aggiungiLibro(Libro libro) {
        libro.setId(currentId++);
        libri.put(libro.getId(), libro);
        return libro;
    }
	
	//Metodo per ottenere tutti i libri
	public Collection<Libro> ottieniTutti() {
		return libri.values();
	}
	
	//Metodo per aggiornare un libro
	public Libro aggiornaLibro(Long id, Libro libro) {
        if (libri.containsKey(id)) {
            libro.setId(id);
            libri.put(id, libro);
            return libro;
        }
        return null;  // o potresti lanciare un'eccezione.
    }
	
	//Metodo per eliminare un libro
	public void eliminaLibro(Long id) {
        libri.remove(id);
    }

}