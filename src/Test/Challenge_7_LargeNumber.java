package Test;

import java.util.Scanner;

public class Challenge_7_LargeNumber {
    public static void main(String[] args) {
        //Create a program to find the largest among three numbers using if-else statements.
        // **Requirements:** - Read three integers from user input -
        // Use nested if-else or if-else if statements - Handle cases where numbers might be equal

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = scanner.nextInt();

        System.out.println("Enter second number");
        int num2 = scanner.nextInt();

        System.out.println("Enter third number");
        int num3 = scanner.nextInt();

        if (num1>num2)
        {
            if (num1>num3)
            {
                System.out.println(num1 + "is the large number");
            }

            else
            {
                System.out.println(num3 + "is the large number");
            }
        }

        else if (num2>num3)
        {
            System.out.println(num2 + "is the large number");

        }

        else
        {
            System.out.println(num3 + " is the large number");
        }
    }
}
