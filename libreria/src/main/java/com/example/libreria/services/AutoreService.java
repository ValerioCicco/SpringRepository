package com.example.libreria.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.libreria.entities.Autore;
import com.example.libreria.repositories.AutoreRepository;

@Service
public class AutoreService {
	@Autowired
	private AutoreRepository autoreRepository;

	public List<Autore> getAllAutori() {
		return autoreRepository.findAll();
	}
	
	public Optional<Autore> getAutoreById(Long id) {
		return autoreRepository.findById(id);
	}

	public Autore createAutore(Autore autore) {
		autore = autoreRepository.save(autore);

		return autore;
	}

	public Autore updateAutore(Long id, Autore autoreDaAggiornare) {
		Optional<Autore> optionalAutore = autoreRepository.findById(id);

		if (optionalAutore.isEmpty()) {
			throw new IllegalStateException("Autore non trovato");
		}

		Autore autoreDaPrendere = optionalAutore.get();

		autoreDaAggiornare.setId(autoreDaPrendere.getId());

		autoreDaAggiornare = autoreRepository.save(autoreDaAggiornare);

		return autoreDaAggiornare;
	}

	public Autore deleteAutore(Long id) {
		Optional<Autore> optionalAutore = autoreRepository.findById(id);
		
		if(optionalAutore.isEmpty()) {
			throw new IllegalStateException("Autore non trovato");
		}
		
		Autore autoreDaEliminare = optionalAutore.get();
		
		autoreRepository.delete(autoreDaEliminare);
		
		return autoreDaEliminare;
	}
}
