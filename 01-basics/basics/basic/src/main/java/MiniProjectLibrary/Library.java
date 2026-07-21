package MiniProjectLibrary;
import java.util.ArrayList;

public class Library {
    private final ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(String title) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getTitle().equals(title)) {
                books.remove(i);
                return;
            }
        }
    }

    public Book findBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        System.out.println("Nothing found.");
        return null;
    }

    public void printAllBooks() {
        if (books.isEmpty()) {
            System.out.println("The library is empty.");
            return;
        }

        for (Book book : books) {
            System.out.println(book);
        }
    }
}
