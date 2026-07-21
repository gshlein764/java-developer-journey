package lesson4;

public class Book {
    private final String title;
    private final String author;
    private final int year;
    private double price;

    public Book(String title, String author, int year, double price) {
        if ((title == null || title.isBlank()) || (author == null || author.isBlank()) || year <= 0 || price < 0) {
            throw new IllegalArgumentException("Wrong format.");
        }
        this.title = title;
        this.author = author;
        this.year = year;
        this.price = price;
    }

    // Геттеры для всех полей
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    // Сеттер для поля price
    public void setPrice(double newPrice) {
        if (newPrice < 0) {
            throw new IllegalArgumentException("Price can't be negative.");
        }
        price = newPrice;
    }

    @Override
    public String toString() {
        return """
                Book
                Title: %s
                Author: %s
                Year: %d
                Price: %.2f
                """.formatted(title, author, year, price);
    }
}
