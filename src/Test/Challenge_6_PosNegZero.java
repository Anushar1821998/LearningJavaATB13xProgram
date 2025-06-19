package Test;

import java.util.Scanner;

public class Challenge_6_PosNegZero {
    public static void main(String[] args) {
        //Write a program to check if a number is positive, negative, or zero.
        // **Requirements:** - Read an integer from user input - Use if-else statements to classify the number -
        // Print appropriate message for each case

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number");
        int num = scanner.nextInt();

        if(num>0)
        {
            System.out.println("Entered number is Positive");
        }

        else if (num<0)
        {
            System.out.println("Entered number is Negative");
        }

        else
        {
            System.out.println("Number is zero");
        }
    }
}
