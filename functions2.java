import java.util.Scanner;

public class functions2 {

    public static int multiply(int a, int b) {
        int product = a * b;
        return product;
    }

    public static void main(String args[]) {
        int a = 12;
        int b = 43;
        int prod = multiply(a, b);
        System.out.println(" a*b=" + prod);
        prod = multiply(43, 4);
        System.out.println("a*b=" + prod);
    }
}