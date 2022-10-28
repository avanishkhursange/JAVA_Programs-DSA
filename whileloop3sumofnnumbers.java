import java.util.*;

public class whileloop3sumofnnumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int i = 1;
        while (i <= n) {
            sum += i;
            i++;
            sc.close();
        }
        System.out.println("sum is :" + sum);
    }
}
