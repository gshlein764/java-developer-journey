package lesson6;

public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name can't be empty or null!");
        }

        if (age <= 0) {
            throw new IllegalArgumentException("Age must be positive!");
        }

        this.name = name;
        this.age = age;
    }

    // Геттеры
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return """
               Name: %s
               Age: %d 
               """.formatted(name, age);
    }
}
