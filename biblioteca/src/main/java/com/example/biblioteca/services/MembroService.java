package com.example.biblioteca.services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.biblioteca.models.Membro;
import com.example.biblioteca.models.Prenotazione;
import com.example.biblioteca.repositories.MembroRepository;

@Service
public class MembroService {
	
	@Autowired
	private MembroRepository mr;
	
	public Collection<Membro> getAll() {
		return mr.ottieniTutti();
	}
	
	public Membro getMembroById(Long id) {
		return mr.getMembroById(id);
	}
	
	//METODO PER OTTENERE LE PRENOTAZIONI DI UN MEMBRO SPECIFICO
	public ArrayList<Prenotazione> getAllMembroPrenotazione(Long id){
		return mr.getMembroById(id).getPrenotazioni();
	}
	
	public Membro addMembro(Membro membro) {
		return mr.creaMembro(membro);
	}
	
	public void deleteMembro(Long id) {
		mr.eliminaMembro(id);
	}
	
	public Membro updateMembro(Membro membro, Long id) {
		return mr.aggiornaMembro(id, membro);
	}
}
