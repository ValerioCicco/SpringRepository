package com.example.biblioteca.repositories;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.example.biblioteca.models.Libro;


@Repository
public class LibroRepository {
	private final Map<Long, Libro> libri = new HashMap<>();
	private Long currentId = 1L;
	
	
	public Libro creaLibro(Libro libro) {
		libro.setId(currentId++);
		libri.put(libro.getId(), libro);
		return libro;
	}
	
	public Collection<Libro> ottieniTutti() {
		return libri.values();
	}
	
	public Libro getLibroById(Long id) {
		return libri.get(id);
	}
	
	//METODO PER CERCARE LIBRI DA TITOLO
	public Optional<Libro> findByTitolo(String titolo) {
	    return libri.values().stream()
	            .filter(libro -> libro.getTitolo().equalsIgnoreCase(titolo))
	            .findFirst();
	}
	
	public Libro aggiornaLibro(Long id, Libro libro) {
        if (libri.containsKey(id)) {
        	libro.setId(id);
        	libri.put(id, libro);
            return libro;
        }
        return null; 
    }
	
	public void eliminaLibro(Long id) {
		libri.remove(id);
    }
}
