package com.example.libreria.services;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.libreria.entities.Libro;
import com.example.libreria.repositories.LibroRepository;

@Service
public class LibroService {
	
	@Autowired
	private LibroRepository libroRepository;
	
	public List<Libro> getAllLibri() {
		return libroRepository.findAll();
	}
	
	public Optional<Libro> getLibroById(Long id) {
		return libroRepository.findById(id);
	}
	
	public Libro createLibro(Libro libro) throws Exception {
		if(libro.getAutore() == null) {
			throw new Exception("Autore nn può essere null!");
		}
		
		libro = libroRepository.save(libro);
		return libro;
	}
	
	public Libro updateLibro(Long id, Libro libroDaAggiornare) {
		Optional<Libro> optionalLibro = libroRepository.findById(id);

		if (optionalLibro.isEmpty()) {
			throw new IllegalStateException("Libro non trovato");
		}

		Libro libroDaPrendere = optionalLibro.get();

		libroDaAggiornare.setId(libroDaPrendere.getId());

		libroDaAggiornare = libroRepository.save(libroDaAggiornare);

		return libroDaAggiornare;
	}
	
	public Libro deleteLibro(Long id) {
		Optional<Libro> optionalLibro = libroRepository.findById(id);
		
		if(optionalLibro.isEmpty()) {
			throw new IllegalStateException("Libro non trovato");
		}
		
		Libro libroDaEliminare = optionalLibro.get();
		
		libroRepository.delete(libroDaEliminare);
		
		return libroDaEliminare;
	}
	
}
