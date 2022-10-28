import java.util.*;

public class Primeornot {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        if (n == 8) {
            System.out.println("n isPrime");
        } else {
            boolean isPrime = true;
            for (int i = 2; i <= n - 1; i++)
                ;
            int i;
            if (n % i == 0) {
                isPrime = false;
            }
            if (isPrime == true) {
                System.out.println("n is prime");
            } else {
                System.out.println("n is not prime");
            }

        }
    }
}
