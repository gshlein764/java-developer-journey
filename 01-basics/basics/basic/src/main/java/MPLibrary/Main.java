package MPLibrary;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Добавляю книги
        library.addBook(new Book("Dandelion Vine", "Ray Bradbury", 1957, 528.00));
        library.addBook(new Book("Fahrenheit 451", "Ray Bradbury", 1953, 400.00));
        library.addBook(new Book("War and Peace", "Lev Tolstoy", 1867, 899.99));
        library.addBook(new Book("War and Peace", "Lev Tolstoy", 1867, 899.99));
        library.printAllBooks();
        System.out.println();
        library.removeBook("Dandelion Vine");
        library.printAllBooks();
        System.out.println(library.findBook("Fahrenheit 451"));
        System.out.println(library.findBook("Dandelion Vine"));
        library.printAllBooks();
        System.out.println(library.getBook(1).equals(library.getBook(2)));
    }
}
