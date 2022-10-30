import java.util.Scanner;

public class breakkeyword {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        do {
            System.out.println("ENTER THE NUMBER");
            int n = sc.nextInt();
            if (n % 10 == 0) {
                break;

            }
            System.out.println(n);
        } while (true);

    }
}
