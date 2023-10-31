package com.example.biblioteca.models;

import java.util.ArrayList;

public class Membro {
	
	private Long id;
	private String nome;
	private String cognome;
	private String email;
	private ArrayList<Prenotazione> prenotazioni;
	
	public Membro(Long id, String nome, String cognome, String email, ArrayList<Prenotazione> prenotazioni) {
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		this.prenotazioni = prenotazioni;
	}
	
	public Membro(Long id) {
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		this.prenotazioni = prenotazioni;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public ArrayList<Prenotazione> getPrenotazioni() {
		return prenotazioni;
	}

	public void setPrenotazioni(ArrayList<Prenotazione> prenotazioni) {
		this.prenotazioni = prenotazioni;
	}
	
	
}
