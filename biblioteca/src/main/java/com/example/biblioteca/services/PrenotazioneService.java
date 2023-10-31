package com.example.biblioteca.services;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.biblioteca.models.Libro;
import com.example.biblioteca.models.Membro;
import com.example.biblioteca.models.Prenotazione;
import com.example.biblioteca.repositories.PrenotazioneRepository;

@Service
public class PrenotazioneService {
	
	@Autowired
	private PrenotazioneRepository pr;
	@Autowired
	private LibroService libroServ;
	
	@Autowired
	private MembroService membroServ;
	
	@Autowired
	private LibroService ls;
	
	public Collection<Prenotazione> getAll() {
		return pr.ottieniTutti();
	}
	
	public Optional<Prenotazione> getPrenotazioneById(Long id) {
		return pr.findById(id);
	}
	
	public Prenotazione addPrenotazione(Prenotazione prenotazione) {
		return pr.creaPrenotazione(prenotazione);
	}
	
	public void deletePrenotazione(Long id) {
		pr.eliminaPrenotazione(id);
	}
	
	public Prenotazione updatePrenotazione(Prenotazione prenotazione, Long id) {
		return pr.aggiornaPrenotazione(id, prenotazione);
	}
	
	//METODO PER PRENOTARE LIBRO CON CONTROLLI 
	public boolean addPrenotazione(Prenotazione prenotazione, Long id) {
		Libro libro = prenotazione.getLibro();
		Membro membro = membroServ.getMembroById(id);
		
		if(libro.getQuantitàDisponibile() > 0 && libro != null && membro.getPrenotazioni().size() < 3 && membro != null) {
			prenotazione.setDataInizio(LocalDate.now());
			prenotazione.setDataFine(prenotazione.getDataInizio().plusDays(3));
			
			libroServ.decrementaQuantitaDisponibile(libro.getId());
			membro.getPrenotazioni().add(prenotazione);
			
//			prenotazioneRepo.addPrenotazione(prenotazione);
			
			return true;
		}
		
		return false;
	}

}
