package lesson3;

import java.time.LocalDate;

public class User {
    private String name;
    private LocalDate birthday;
    private int id;

    public User(String name, LocalDate birthday, int id) {
        this.name = name;
        this.birthday = birthday;
        this.id = id;
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Birthday: " + birthday);
        System.out.println("ID: " + id);
    }

    public String getName() {
        return name;
    }
}
