package lesson4;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Martin Eden", "Jack London", 1909, 650.90);
        double newPrice = 700.99;
        System.out.println(book.getPrice());
        book.setPrice(newPrice);
        System.out.println(book);
    }
}
