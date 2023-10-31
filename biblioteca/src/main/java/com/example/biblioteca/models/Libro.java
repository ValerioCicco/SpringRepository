package com.example.biblioteca.models;

public class Libro {
	
	private Long id;
	private String titolo;
	private String autore;
	private String genere;
	private int annoPubblicazione;
	private int quantitàDisponibile;
	
	public Libro(Long id, String titolo, String autore, String genere, int annoPubblicazione, int quantitàDisponibile) {
		this.id = id;
		this.titolo = titolo;
		this.autore = autore;
		this.genere = genere;
		this.annoPubblicazione = annoPubblicazione;
		this.quantitàDisponibile = quantitàDisponibile;
	}
	
	public Libro(Long id) {
		this.id = id;
		this.titolo = titolo;
		this.autore = autore;
		this.genere = genere;
		this.annoPubblicazione = annoPubblicazione;
		this.quantitàDisponibile = quantitàDisponibile;
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

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public String getGenere() {
		return genere;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}

	public int getAnnoPubblicazione() {
		return annoPubblicazione;
	}

	public void setAnnoPubblicazione(int annoPubblicazione) {
		this.annoPubblicazione = annoPubblicazione;
	}

	public int getQuantitàDisponibile() {
		return quantitàDisponibile;
	}

	public void setQuantitàDisponibile(int quantitàDisponibile) {
		this.quantitàDisponibile = quantitàDisponibile;
	}
	
	
}
