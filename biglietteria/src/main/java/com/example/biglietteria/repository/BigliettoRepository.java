package com.example.biglietteria.repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.example.biglietteria.models.Biglietto;


@Repository
public class BigliettoRepository {
	
	private final Map<Long, Biglietto> biglietti = new HashMap<>();
	private Long currentId = 1L;
	private ArrayList<Biglietto> concerti = new ArrayList<Biglietto>();
	private ArrayList<Biglietto> cinema = new ArrayList<Biglietto>();
	private ArrayList<Biglietto> teatro = new ArrayList<Biglietto>();
	
	//Metodo per aggiungere un biglietto
	public Biglietto aggiungiBiglietto(Biglietto biglietto) {
		if(biglietto.getNomeEvento().equalsIgnoreCase("concerto")) {
			concerti.add(biglietto);
		} else if (biglietto.getNomeEvento().equalsIgnoreCase("cinema")) {
			cinema.add(biglietto);
		} else if (biglietto.getNomeEvento().equalsIgnoreCase("teatro")){
			teatro.add(biglietto);
		}
		biglietto.setId(currentId++);
		biglietti.put(biglietto.getId(), biglietto);
        return biglietto;
    }
	
	//Metodo per ottenere tutti i biglietto
	public Collection<Biglietto> ottieniTutti() {
		return biglietti.values();
	}
	
	//METODI CONCERTI, CINEMA E TEATRO
	public Collection<Biglietto> ottieniTuttiByConcerto() {
		return concerti;
	}
	
	public Collection<Biglietto> ottieniTuttiByCinema() {
		return cinema;
	}
	
	public Collection<Biglietto> ottieniTuttiByTeatro() {
		return teatro;
	}
	
	//Metodo per ottenere il biglietto per ID
	public Biglietto ottieniBigliettoPerId(Long id) {
		return biglietti.get(id);
	}
	
	//Metodo per aggiornare un biglietto
	public Biglietto aggiornaBiglietto(Long id, Biglietto biglietto) {
        if (biglietti.containsKey(id)) {
        	biglietto.setId(id);
        	biglietti.put(id, biglietto);
            return biglietto;
        }
        return null;  // o potresti lanciare un'eccezione.
    }
	
	//Metodo per eliminare un biglietto
	public void eliminaBiglietto(Long id) {
		biglietti.remove(id);
    }
}
