import java.util.*;

public class Recursion_Increasing {
    public static void PrintInc(int n) {
        if (n == 1) {
            System.out.println(n + " ");
            return;
        }

        PrintInc(n - 1);
        System.out.println(n + " ");

    }

    public static void main(String args[]) {
        int n = 10;
        PrintInc(n);
    }
}