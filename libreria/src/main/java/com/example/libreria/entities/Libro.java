package com.example.libreria.entities;

import java.util.List;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
public class Libro {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String titolo;
	
	@ManyToMany(targetEntity = Autore.class)
	Set<Autore> autore;

	public Libro(Long id, String titolo, Set<Autore> autore) {
		this.id = id;
		this.titolo = titolo;
		this.autore = autore;
	}
	
	public Libro () {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public Set<Autore> getAutore() {
		return autore;
	}

	public void setAutore(Set<Autore> autore) {
		this.autore = autore;
	}

	
	
	
}
