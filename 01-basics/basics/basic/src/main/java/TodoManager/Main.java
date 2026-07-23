package TodoManager;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();

        taskManager.addTask(new Task("Do pull-ups", "3 sets 10 reps.", TaskStatus.NEW, Priority.MEDIUM, LocalDateTime.of(2026, 7, 23, 11, 0)));
        taskManager.addTask(new Task("Do push-ups", "3 sets 20 reps.", TaskStatus.NEW, Priority.MEDIUM, LocalDateTime.of(2026, 7, 23, 11, 40)));
        taskManager.addTask(new Task("Learn Java", "New Theme: Enum. About 5 hours.", TaskStatus.DONE, Priority.HIGH, LocalDateTime.of(2026, 7, 22, 22, 0)));
        taskManager.addTask(new Task("Celebrate birthday with family", "Buy something cool. You need this bro.", TaskStatus.NEW, Priority.HIGH, LocalDateTime.of(2026, 7, 24, 18, 0)));
        taskManager.addTask(new Task("Make a cake with grandma", "Mmmm, delicious.", TaskStatus.NEW, Priority.MEDIUM, LocalDateTime.of(2026, 7, 24, 10, 0)));
        taskManager.addTask(new Task("Go shopping", "Do it when you want.", TaskStatus.NEW, Priority.LOW, LocalDateTime.of(2026, 7, 23, 16, 0)));

        taskManager.removeTaskById(2);
        System.out.println(taskManager.findTaskById(1));
        taskManager.printAllTasks();
        System.out.println();
        taskManager.printTasksByStatus(TaskStatus.DONE);
        System.out.println();
        taskManager.printTasksByStatus(TaskStatus.NEW);
        System.out.println();
        taskManager.printTasksByPriority(Priority.HIGH);


        List<String> doneTasks = taskManager.getTasks().stream()
                .filter(task -> task.getStatus() == TaskStatus.DONE)
                .map(task -> task.getDescription())
                .toList();
        doneTasks.forEach(x -> System.out.println(x));

        List<Task> sortedTasks = taskManager.getTasks().stream()
                .sorted(Comparator.comparing(task -> task.getDeadline()))
                .toList();
    }
}
