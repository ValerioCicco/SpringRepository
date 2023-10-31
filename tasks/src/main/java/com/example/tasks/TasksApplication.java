package com.example.tasks;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.tasks.entities.Task;
// @SpringBootApplication indica la classe principale che avvia l'applicazione Spring Boot
@SpringBootApplication
public class TasksApplication {

	public static void main(String[] args) {
		SpringApplication.run(TasksApplication.class, args);
		
		/*
		 * Spiegazione delle annotazioni:
		@Entity: Indica che una classe è un'entità JPA e viene mappata su una tabella nel database.
		@Id: Specifica la proprietà dell'entità da utilizzare come chiave primaria.
		@GeneratedValue: Indica che il valore della chiave primaria deve essere generato automaticamente.
		@RestController: Indica che la classe è un controller che restituisce dati in formato JSON o XML.
		@RequestMapping: Mappa un URL di base a una classe o un metodo del controller.
		@PostMapping: Mappa le richieste HTTP POST a un metodo specifico.
		@GetMapping: Mappa le richieste HTTP GET a un metodo specifico.
		@PathVariable: Indica che un parametro del metodo deve essere legato a una variabile del percorso dell'URL.
		@RequestBody: Indica che un parametro del metodo deve essere legato al corpo della richiesta HTTP.
		In questo esercizio, abbiamo creato un'applicazione Spring Boot per gestire una lista di attività. Abbiamo utilizzato diverse annotazioni per definire come le richieste HTTP dovrebbero essere mappate ai metodi del controller e come i dati dovrebbero essere legati ai parametri del metodo.
		 * */
		
//		Task task = new Task((long) 1, "Fare la spesa");
//		Task task2 = new Task((long) 2, "Lavorare");
//		Task task3 = new Task((long) 3, "Dormire");
//		
//		ArrayList<Task> tasks = new ArrayList<Task>();
//		tasks.add(task);
//		tasks.add(task2);
//		tasks.add(task3);
	}

}
