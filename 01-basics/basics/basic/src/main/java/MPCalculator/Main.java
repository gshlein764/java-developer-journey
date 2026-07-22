package MPCalculator;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(67.52, 52.48));
        System.out.println(calculator.subtract(67.52, 52.48));
        System.out.println(calculator.multiply(67.52, 52.48));
        try {
            System.out.println(calculator.divide(10, 0));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}