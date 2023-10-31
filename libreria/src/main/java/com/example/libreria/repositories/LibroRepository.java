package com.example.libreria.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.libreria.entities.Libro;

public interface LibroRepository extends JpaRepository<Libro, Long> {

}
