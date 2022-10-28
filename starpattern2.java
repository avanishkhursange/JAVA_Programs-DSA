import java.util.*;

public class starpattern2
// inverted star pattern
{
    public static void main(String args[]) {

        for (int line = 1; line <= 4; line++) {
            int n = 4;
            for (int star = 1; star <= n - line + 1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
