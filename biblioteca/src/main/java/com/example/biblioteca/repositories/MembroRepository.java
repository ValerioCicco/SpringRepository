package com.example.biblioteca.repositories;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.example.biblioteca.models.Membro;

@Repository
public class MembroRepository {
	private final Map<Long, Membro> membri = new HashMap<>();
	private Long currentId = 1L;
	
	public Membro creaMembro(Membro membro) {
		membro.setId(currentId++);
		membri.put(membro.getId(), membro);
        return membro;
	}
	
	public Collection<Membro> ottieniTutti() {
		return membri.values();
	}
	
	public Membro getMembroById(Long id) {
		return membri.get(id);
	}
	
	public Membro aggiornaMembro(Long id, Membro membro) {
        if (membri.containsKey(id)) {
        	membro.setId(id);
        	membri.put(id, membro);
            return membro;
        }
        return null; 
    }
	
	public void eliminaMembro(Long id) {
		membri.remove(id);
    }
}
