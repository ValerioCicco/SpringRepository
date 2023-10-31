package com.example.biblioteca.controllers;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.biblioteca.models.Libro;
import com.example.biblioteca.models.Membro;
import com.example.biblioteca.models.Prenotazione;
import com.example.biblioteca.services.PrenotazioneService;

@RestController
@RequestMapping("/prenotazione")
public class PrenotazioneController {
	
	@Autowired
	private PrenotazioneService ps;
	
	@GetMapping
	public Collection<Prenotazione> getAllPrenotazioni() {
		return ps.getAll();
	}
	
	@GetMapping("/{id}")
    public Optional<Prenotazione> getPrenotazioneById(@PathVariable Long id) {
        return ps.getPrenotazioneById(id);
    }
	
	@PostMapping
    public Prenotazione nuovaPrenotazione(@RequestBody Prenotazione prenotazione) {
        return ps.addPrenotazione(prenotazione);
    }
	
	@PostMapping("/membro/{id}")
	public String addNewPrenotazione(@RequestBody Prenotazione prenotazione, @PathVariable Long id) {
		
		String s = ps.addPrenotazione(prenotazione, id) ? "Prenotazione aggiunta con successo" : "Qualcosa è andato storto";
		return s;

	}
	
	@PutMapping("/{id}")
	public Prenotazione modificaPrenotazione(@PathVariable Long id, @RequestBody Prenotazione prenotazione) {
		return ps.updatePrenotazione(prenotazione, id);
	}
	
	@DeleteMapping("/{id}")
	public void elminaPrenotazione(Long id) {
        ps.deletePrenotazione(id);
    }
}
