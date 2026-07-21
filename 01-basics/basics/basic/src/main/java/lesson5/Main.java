package lesson5;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Ernst", 20);
        Student s2 = new Student("Jason", 45);
        Student s3 = new Student("Killian", 33);

        s1.printInfo();
        System.out.println();
        s2.printInfo();
        System.out.println();
        s3.printInfo();
        System.out.println();

        Student.printUniversity();
        System.out.println(Student.getStudentsCount());
    }
}
