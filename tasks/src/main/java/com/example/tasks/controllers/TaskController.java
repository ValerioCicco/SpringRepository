package com.example.tasks.controllers;

import org.springframework.web.bind.annotation.*;


import com.example.tasks.entities.Task;

import java.util.ArrayList;
import java.util.List;


//@RestController indica che questa classe è un controller REST.
@RestController
@RequestMapping("/tasks")
public class TaskController {
	// Una semplice lista per memorizzare le attività come esempio.
	private final List<Task> tasks = new ArrayList<>();
	
	// @PostMapping mappa le richieste HTTP POST a questo metodo.
	@PostMapping
	public void addTask(@RequestBody Task task) {
		tasks.add(task);
	}
	
	 // @GetMapping mappa le richieste HTTP GET a questo metodo.
	@GetMapping
	public List<Task> getAllTasks() {
		return tasks;
	}
	
	// @GetMapping con un percorso variabile mappa le richieste GET con un ID specifico a questo metodo.
	@GetMapping("/{id}")
	public Task getTaskById(@PathVariable Long id) {
		return tasks.stream().filter(t -> t.getId().equals(id)).findFirst().orElse(null);
	}
	
	// @DeleteMapping mappa le richieste HTTP DELETE a questo metodo.
	@DeleteMapping("/{id}")
	public void deleteTaskById(@PathVariable Long id) {
		tasks.removeIf(t -> t.getId().equals(id));
	}
}