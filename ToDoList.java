
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

public class ToDoList {
    private final List<Task> listTask;

    public ToDoList() {
        this.listTask = new ArrayList<>();
    }

    public Boolean addToList(Task t) {
        if (t != null) {
            listTask.add(t);
            return true;
        } else {
            return false;
        }
    }

    public Boolean removeToList(Task t) {
        if (t != null) {
            listTask.remove(t);
            return true;
        } else {
            return false;
        }
    }

    public void printList() {
        for (Task t : listTask) {
            System.out.println(t);
        }
    }

    public Boolean changeStatus(String id, boolean isCompleted) {
        for (Task t : listTask) {
            if (t.getId().toString().equals(id)) {
                t.setCompleted(isCompleted);
                return true;
            }
        }
        return false;
    }

    //- Visualizzare il dettaglio di un compito identificato attraverso un parametro specifico.
    public Task showTaskByID(String id) {
        Task toShow = null;
        for (Task t : listTask) {
            if (t.getId().toString().equals(id)) {
                toShow = t;
            }
        }
        return toShow;
    }

    //- Visualizzare i compiti in scadenza nei prossimi 2 giorni formattando la data in un formato
    // comprensibile all’utente.

    public List<Task> expiringInTwoDaysTasks() {
        List<Task> expiringTasks = new ArrayList<>();
        OffsetDateTime minRange = OffsetDateTime.now();
        OffsetDateTime maxRange = minRange.plusDays(2);
        for (Task t : listTask) {
            if (t.getExpiration().isAfter(minRange) && t.getExpiration().isBefore(maxRange)) {
                expiringTasks.add(t);
            }
        }
        return expiringTasks;
    }
}