import java.util.*;

public class primerange {
    public static void primesinrange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    private static boolean isPrime(int i) {
        return false;
    }

    public static void main(String args[]) {
        primesinrange(20);
    }
}
