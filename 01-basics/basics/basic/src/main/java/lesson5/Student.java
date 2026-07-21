package lesson5;

public class Student {
    private String name;
    private int age;

    private static int studentsCount;
    private static final String UNIVERSITY = "LETI";

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        studentsCount++;
    }

    public static void printUniversity() {
        System.out.println(UNIVERSITY);
    }

    public void printInfo() {
        System.out.println("""
                Name: %s
                Age: %d
                University: %s
                """.formatted(name, age, UNIVERSITY));
    }

    public static int getStudentsCount() {
        return studentsCount;
    }
}
