package com.example.biblioteca.models;

import java.time.LocalDate;

public class Prenotazione {
	
	private Long id;
	private LocalDate dataInizio;
	private LocalDate dataFine;
	private Libro libro;
	
	public Prenotazione(Long id, LocalDate dataInizio, LocalDate dataFine, Libro libro) {
		this.id = id;
		this.dataInizio = dataInizio;
		this.dataFine = dataFine;
		this.libro = libro;
	}
	
	public Prenotazione() {
		this.id = id;
		this.dataInizio = dataInizio;
		this.dataFine = dataFine;
		this.libro = libro;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getDataInizio() {
		return dataInizio;
	}

	public void setDataInizio(LocalDate dataInizio) {
		this.dataInizio = dataInizio;
	}

	public LocalDate getDataFine() {
		return dataFine;
	}

	public void setDataFine(LocalDate dataFine) {
		this.dataFine = dataFine;
	}

	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}
	
	
}
