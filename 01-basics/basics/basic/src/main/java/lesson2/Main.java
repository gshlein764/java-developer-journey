package lesson2;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(5, 10);
        Rectangle rectangle2 = new Rectangle(3, 7);
        Rectangle rectangle3 = new Rectangle(8, 8);

        Rectangle[] rectangles = {
                rectangle1,
                rectangle2,
                rectangle3
        };

        // Вывод размеров
        for (Rectangle rectangle : rectangles) {
            rectangle.printInfo();
            System.out.println("Square: " + rectangle.isSquare());
            System.out.println("Area: " + rectangle.area());
            System.out.println("Perimeter: " + rectangle.perimeter());
            System.out.println();
        }
    }
}
