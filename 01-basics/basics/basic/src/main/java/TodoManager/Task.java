package TodoManager;

import java.time.LocalDateTime;

public class Task {
    private final String title;
    private final String description;
    private TaskStatus status;
    private final Priority priority;
    private final LocalDateTime deadline;
    private static int nextId = 1;
    private final int id;

    public Task(String title, String description, TaskStatus status, Priority priority, LocalDateTime deadline) {
        if ((title == null || title.isBlank()) || (description == null || description.isBlank()) ||
                (status == null) || (priority == null) || (deadline == null)) {
            throw new IllegalArgumentException("Wrong input data format.");
        }

        this.title = title;
        this.description = description;
        this.status = status;
        this.priority = priority;
        this.deadline = deadline;
        this.id = nextId++;
    }

    // Геттеры
    public String getTitle() { return title; }
    public String getDescription() { return description; }
    public TaskStatus getStatus() { return status; }
    public Priority getPriority() { return priority; }
    public LocalDateTime getDeadline() { return deadline; }
    public int getId() { return id; }

    public void changeTaskStatus(TaskStatus newStatus) {
        if (newStatus == null) {
            throw new IllegalArgumentException("Status cannot be null");
        }
        status = newStatus;
    }

    @Override
    public String toString() {
        return """
               ID: %d
               Title: %s
               Description: %s
               TaskStatus: %s
               Priority: %s
               Deadline: %s
               """.formatted(id, title, description, status, priority, deadline);
    }
}
