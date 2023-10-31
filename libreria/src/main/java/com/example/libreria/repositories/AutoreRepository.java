package com.example.libreria.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.libreria.entities.Autore;

public interface AutoreRepository extends JpaRepository<Autore, Long> {

}
