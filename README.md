# SpringRepository
SpringRepo è una repository che contiene il mio percorso Spring e i progetti che ho svolto durante il mio percorso Academy, per ogni cartella abbiamo la spiegazione traccia, i tasks svolti e l'obiettivo raggiunto:

# FOLDER libreria 
(contiene un esercizio con la seguente traccia: "Supponiamo di voler creare un'applicazione di base per gestire una libreria. Nella nostra libreria abbiamo libri e autori. Ogni libro può avere uno o più autori e ogni autore può aver scritto uno o più libri. Vogliamo poter creare, leggere, aggiornare e cancellare sia libri che autori.")

Tasks:

1. Configurazione ambiente
2. Aggiunte dovute dipendenze
3. Creazione entità 
4. Creazione interfacce repository JPA
5. Creazioni servizi per gestire le operazioni CRUD
6. Creazioni controller REST per esporre API per gestire Libro e Autore
7. Scrittura TEST su Postman (Funzionanti)


Obiettivo raggiunto: Ho creato un'applicazione base per gestire una libreria associando gli elementi citati nelle tasks, gestendo la relazione ManyToMany. 

# FOLDER tasks 
(contiene un esercizio stile helloworld in cui l'obiettivo era riuscire a effettuare le operazioni CRUD")

Tasks: 

1. Creazione entità
2. Creazioni controller REST per esporre API per gestire Task
3. Scrittura TEST su Postman (Funzionanti)

Obiettivo raggiunto: Ho creato un'applicazione helloworld in cui ho svolto le operazioni CRUD.

# FOLDER book 
(Creazione di un servizio RESTful per la gestione di un catalogo di libri con Spring Boot. Vuoi creare un'applicazione Spring Boot che fornisca un servizio RESTful per gestire un catalogo di libri. Ogni libro avrà un ID, un titolo, un autore e un anno di pubblicazione. Il catalogo di libri sarà memorizzato in memoria utilizzando una struttura dati come una List o una Map.)

Tasks: 

1. Creazione entità
2. Creazione interfacce repository
3. Creazioni servizi per gestire le operazioni CRUD
4. Creazioni controller REST per esporre API per gestire Task
5. Scrittura TEST su Postman (Funzionanti)

Obiettivo raggiunto: Ho creato un'applicazione per la gestione di un catalogo libri in cui ho svolto le operazioni CRUD.

# FOLDER biglietteria 
(Creazione di un servizio RESTful per la gestione di una biglietteria dove bisogna effettuare dei controlli sul biglietto riguardo la vendita (questo esercizio è stato svolto con l'aiuto di 2 due colleghi) )

Tasks: 

1. Creazione entità
2. Creazione interfacce repository
3. Creazioni servizi per gestire le operazioni CRUD con controlli specifici
4. Creazioni controller REST per esporre API per gestire Task
5. Scrittura TEST su Postman (Funzionanti)

Obiettivo raggiunto: Ho creato un'applicazione per la gestione di una biglietteria in cui ho svolto le operazioni CRUD.

# FOLDER biblioteca 
(Sviluppo una piattaforma per una biblioteca municipale che consente ai membri di prenotare libri online. La biblioteca ha una serie di libri, ognuno con una quantità limitata. Un membro può prenotare un libro, e una volta prenotato, il libro sarà riservato per lui/lei per 3 giorni. Se il membro non viene a ritirare il libro entro 3 giorni, la prenotazione viene annullata.)

Tasks: 

1. Creazione entità
2. Creazione interfacce repository (in memoria)
3. Creazioni servizi per gestire le operazioni CRUD con controlli specifici sulle prenotazioni dei membri e prenotazioneService che gestisce la logica delle prenotazioni, verificando la disponibilità dei libri e assicurandosi che un membro non ecceda il limite di prenotazioni.
4. Creazioni controller REST per esporre API per gestire Task
5. Logica di business: Se un membro tenta di prenotare un libro non disponibile, l'applicazione dovrebbe restituire un messaggio di errore. Se un membro ha già 3 prenotazioni attive, non dovrebbe essere in grado di prenotare un altro libro.
6. Scrittura TEST su Postman (Funzionanti)

Obiettivo raggiunto: Ho creato un'applicazione per la gestione di una biblioteca municipale in cui ogni Membro può prenotare un libro.

*** Link alla repository di Java-JDBC: https://github.com/ValerioCicco/Repo_Java-JDBC ***
