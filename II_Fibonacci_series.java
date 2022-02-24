
import java.util.Scanner;

class Fibonacci_series {

    // Function to print N Fibonacci Number
    static void Fibonacci(int N) {
        int num1 = 0, num2 = 1;

        int counter = 0;

        while (counter < N) {

            System.out.print(num1 + " ");

            // Swap
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter = counter + 1;
        }
    }

    public static void main(String args[]) {

        System.out.print("Enter a number- ");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        // Function Call
        Fibonacci(N);
        sc.close();
    }
}
