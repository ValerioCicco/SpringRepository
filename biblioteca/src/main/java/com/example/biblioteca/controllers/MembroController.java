package com.example.biblioteca.controllers;

import java.util.ArrayList;
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

import com.example.biblioteca.models.Membro;
import com.example.biblioteca.models.Prenotazione;
import com.example.biblioteca.services.MembroService;

@RestController
@RequestMapping("/membro")
public class MembroController {
	
	@Autowired
	private MembroService ms;
	
	@GetMapping
	public Collection<Membro> getAllMembri() {
		return ms.getAll();
	}
	
	@GetMapping("/{id}")
    public Membro getMembroById(@PathVariable Long id) {
        return ms.getMembroById(id);
    }
	
	//METODO DI PRENOTAZIONI PER MEMBRO
	@GetMapping("/{id}/prenotazioni")
	public ArrayList<Prenotazione> getPrenotazioniMembro(@PathVariable Long id) {
	    return ms.getAllMembroPrenotazione(id);
	}
	
	@PostMapping
    public Membro nuovoMembro(@RequestBody Membro membro) {
        return ms.addMembro(membro);
    }
	
	@PutMapping("/{id}")
	public Membro modificaMembro(@PathVariable Long id, @RequestBody Membro membro) {
		return ms.updateMembro(membro, id);
	}
	
	@DeleteMapping("/{id}")
	public void elminaMembro(Long id) {
        ms.deleteMembro(id);
    }
}
