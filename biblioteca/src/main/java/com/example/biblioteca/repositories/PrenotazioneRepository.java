package com.example.biblioteca.repositories;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.example.biblioteca.models.Prenotazione;


@Repository
public class PrenotazioneRepository {
	private final Map<Long, Prenotazione> prenotazioni = new HashMap<>();
	private Long currentId = 1L;
	
	public Prenotazione creaPrenotazione(Prenotazione prenotazione) {
		prenotazione.setId(currentId++);
		prenotazioni.put(prenotazione.getId(), prenotazione);
        return prenotazione;
	}
	
	public Collection<Prenotazione> ottieniTutti() {
		return prenotazioni.values();
	}
	
	public Optional<Prenotazione> findById(Long id) {
		return Optional.ofNullable(prenotazioni.get(id));
	}
	
	public Prenotazione aggiornaPrenotazione(Long id, Prenotazione prenotazione) {
        if (prenotazioni.containsKey(id)) {
        	prenotazione.setId(id);
        	prenotazioni.put(id, prenotazione);
            return prenotazione;
        }
        return null; 
    }
	
	public void eliminaPrenotazione(Long id) {
		prenotazioni.remove(id);
    }
}
