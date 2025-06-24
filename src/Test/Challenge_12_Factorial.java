package Test;

import java.util.Scanner;

public class Challenge_12_Factorial {
    // Method to calculate factorial using recursion
    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // Base case
        }
        return n * factorial(n - 1); // Recursive case
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to calculate its factorial: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long result = factorial(number);
            System.out.println("The factorial of " + number + " is: " + result);
        }

        scanner.close();
    }
}
