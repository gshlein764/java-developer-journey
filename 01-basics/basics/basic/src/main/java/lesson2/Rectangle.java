package lesson2;

public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        if (width <= 0  || height <= 0) {
            throw new IllegalArgumentException("Размеры прямоугольника не должны быть отрицательными или нулевыми!");
        }
        this.height = height;
        this.width = width;
    }
    public double area() {
        return width * height;
    }

    public double perimeter() {
        return 2 * (width + height);
    }

    public void printInfo() {
        System.out.println("Размер прямоугольника: " + width + "x" + height);
    }

    public boolean isSquare() {
        return width == height;
    }
}
