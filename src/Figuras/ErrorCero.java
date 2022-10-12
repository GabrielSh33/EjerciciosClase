package Figuras;

public class ErrorCero {
    public static void main(String[]args) {
        int a = 4;
        int b = 0;
        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("No se puede realizar la division entre 0");
        }
    }
}
