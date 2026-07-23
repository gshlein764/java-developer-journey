package TodoManager;

import java.util.List;
import java.util.ArrayList;
import java.util.NoSuchElementException;

public class TaskManager {
    private final List<Task> tasks = new ArrayList<>();

    public List<Task> getTasks() {
        return tasks;
    }

    public void addTask(Task task) {
        if (task == null) {
            throw new IllegalArgumentException("Task cannot be null");
        }
        tasks.add(task);
    }

    public void removeTaskById(int id) {
        if (id <= 0) {
            throw new IllegalArgumentException("Id must be positive.");
        }

        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getId() == id) {
                tasks.remove(i);
                return;
            }
        }
    }

    public Task findTask(String title) {
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("Title can't be null or empty.");
        }

        for (Task task : tasks) {
            if (task.getTitle().equals(title)) {
                return task;
            }
        }
        throw new NoSuchElementException("Task not found");
    }

    public Task findTaskById(int id) {
        if (id <= 0) {
            throw new IllegalArgumentException("Id must be positive.");
        }

        for (Task task : tasks) {
            if (task.getId() == id) {
                return task;
            }
        }

        throw new NoSuchElementException("Task with id " + id + " not found");
    }

    public void printAllTasks() {
        for (Task task : tasks) {
            System.out.println(task);
        }
    }

    public void printTasksByStatus(TaskStatus status) {
        for (Task task : tasks) {
            if (task.getStatus() == status) {
                System.out.println(task);
            }
        }
    }

    public void printTasksByPriority(Priority priority) {
        for (Task task : tasks) {
            if (task.getPriority() == priority) {
                System.out.println(task);
            }
        }
    }
}
