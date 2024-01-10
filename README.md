# CheckpointNew

# Checkpoint

# Traccia : Applicazione Java per la Gestione di una una lista di compiti (To-Do List).
La tua applicazione dovrebbe essere composta da due classi: Task e ToDoList.

##La classe Task.
Rappresenta un singolo compito.
Ogni compito ha una descrizione una scadenza e uno stato che indica se è stato completato o meno.
La classe dovrebbe avere i seguenti attributi privati:
- description: la descrizione del compito.
- completed: uno stato che indica se il compito è stato completato o meno.
- expiration: rappresenta la scadenza prefissata per quel compito.


La classe dovrebbe avere un costruttore che accetta la descrizione del compito, la scadenza e il valore di completato.
Deve fornire metodi pubblici (getter e setter) per tutti i parametri definiti.


La classe TodoList dovrebbe gestire una lista di compiti. Deve fornire le seguenti funzionalità:
- Aggiungere un nuovo compito alla lista.
- Rimuovere un compito dalla lista.
- Visualizzare l'elenco completo dei compiti.
- Contrassegnare un compito specifico come completato.

Utilizzare il main per testare che tutte le funzionalità eseguano i propri compiti.

# Traccia Bonus:
- Visualizzare il dettaglio di un compito identificato attraverso un parametro specifico.
- Visualizzare i compiti in scadenza nei prossimi 2 giorni formattando la data in un formato comprensibile all’utente.
- Partendo dall’ultimo punto bonus “Visualizzare i compiti in scadenza nei prossimi 2 giorni formattando la data
  in un formato comprensibile all’utente” aggiungere almeno 2 test che provino il funzionamento del metodo.
