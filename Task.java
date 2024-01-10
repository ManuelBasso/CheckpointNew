
import java.time.OffsetDateTime;
import java.util.UUID;

public class Task {
    private String description;
    private Boolean completed;
    private OffsetDateTime expiration;
    private final UUID id;

    public Task(String description, Boolean completed, OffsetDateTime expiration) {
        this.description = description;
        this.completed = completed;
        this.expiration = expiration;
        this.id = UUID.randomUUID();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    public OffsetDateTime getExpiration() {
        return expiration;
    }

    public void setExpiration(OffsetDateTime expiration) {
        this.expiration = expiration;
    }

    public UUID getId() {
        return id;
    }




    @Override
    public String toString() {
        return "Task{" +
                "description='" + description + '\'' +
                ", completed=" + completed +
                ", expiration=" + expiration +
                ", id=" + id +
                '}';
    }
}
