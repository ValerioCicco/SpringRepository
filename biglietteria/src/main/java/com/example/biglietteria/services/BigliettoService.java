package com.example.biglietteria.services;

import java.math.BigDecimal;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.biglietteria.models.Biglietto;
import com.example.biglietteria.repository.BigliettoRepository;

@Service
public class BigliettoService {
	
	@Autowired
	private BigliettoRepository br;
	
	public Collection<Biglietto> getAll() {
		return br.ottieniTutti();
	}
	
	public Biglietto getBigliettoById(Long id) {
		return br.ottieniBigliettoPerId(id);
	}
	
	//METODI CONCERTI, CINEMA E TEATRO
	public Collection<Biglietto> getAllByConcerto() {
		return br.ottieniTuttiByConcerto();
	}
	
	public Collection<Biglietto> getAllByCinema() {
		return br.ottieniTuttiByCinema();
	}
	
	public Collection<Biglietto> getAllByTeatro() {
		return br.ottieniTuttiByTeatro();
	}
	
	public Biglietto addBiglietto(Biglietto biglietto) {
		if(biglietto.getDataEvento() == null) {
			throw new NullPointerException("Devi inserire la data del biglietto!");
		}
		else if(biglietto.getPrezzo().compareTo(BigDecimal.ZERO) <= 0) {
			throw new IllegalArgumentException("Il prezzo del biglietto deve essere superiore a zero.");
		}
		return br.aggiungiBiglietto(biglietto);
	}
	
	public void deleteBiglietto(Long id) {
		br.eliminaBiglietto(id);
	}
	
	public Biglietto updateBiglietto(Biglietto biglietto, Long id) {
		return br.aggiornaBiglietto(id, biglietto);
	}
}
