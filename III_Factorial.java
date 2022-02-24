
import java.util.*;

public class III_Factorial {
    public static void main(String args[]) {
        int num, factorial = 1, i;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter an Integer");
        num = in.nextInt();

        for (i = 1; i <= num; i++) {
            factorial = factorial * i;
        }

        System.out.println( num + "!" + " = " + factorial);
    }
}