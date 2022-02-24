
import java.util.Scanner;

public class V_Permutation_n_Combi {
    public static int fact(int num) {
        int fact = 1, i;
        for (i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String args[]) {
        int n, r;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Value of n : ");
        n = scanner.nextInt();
        System.out.print("Enter Value of r : ");
        r = scanner.nextInt();

        System.out.print("Combination: " + (fact(n) / (fact(n - r) * fact(r))));
        System.out.print("\nPermutation:  " + (fact(n) / (fact(n - r))));
        scanner.close();
    }

}