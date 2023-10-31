package com.example.book.entities;


public class Libro {
	
	private Long id;
	private String titolo;
	private String autore;
	private int annoPubblicazione;
	
	public Libro(long id, String titolo, String autore, int annoPubblicazione) {
		this.id = id;
		this.titolo = titolo;
		this.autore = autore;
		this.annoPubblicazione = annoPubblicazione;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public int getAnnoPubblicazione() {
		return annoPubblicazione;
	}

	public void setAnnoPubblicazione(int annoPubblicazione) {
		this.annoPubblicazione = annoPubblicazione;
	}
	
	
}
