package lesson1;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Student {
    private String name;
    private int age;
    private String group;
    private double averageGrade;

    // Создаю конструктор
    public Student(String name, int age, String group, double averageGrade) {
        this.name = name;
        this.age = age;
        this.group = group;
        this.averageGrade = averageGrade;
    }

    public void printInfo() {
        System.out.println("Полная информация о студенте:");
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
        System.out.println("Группа: " + group);
        System.out.println("Средний балл: " + averageGrade);
    }

    public boolean isExcellentStudent() {
        return averageGrade >= 4.5;
    }

    public void birthday() {
        age++;
    }

    public LocalDateTime dateToday() {
        return LocalDateTime.now();
    }
}
