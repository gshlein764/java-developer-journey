package lesson1;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("German", 19, "4383", 3.8);
        student.printInfo();
        System.out.println(student.isExcellentStudent());
        student.birthday();
        student.printInfo();
    }
}
