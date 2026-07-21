package lesson6;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Mary", 21));
        students.add(new Student("Billie", 26));
        students.add(new Student("Kenny", 18));
        students.add(new Student("Bonny", 33));
        students.add(new Student("Kelvin", 55));

        System.out.println("All our students:");
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("Количество студентов: " + students.size());

        students.remove(2);
        System.out.println("NEW:");
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("Количество студентов: " + students.size());

        System.out.println("First student:");
        System.out.println(students.get(0));
    }
}
