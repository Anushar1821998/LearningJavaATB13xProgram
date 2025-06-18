package ex_09_Switch;

import java.util.Scanner;

public class _16th_June_Task_Break {
    public static void main(String[] args) {
        //Write a program that classifies a triangle based on its side lengths.
        // Given three input values representing the lengths of the sides,
        // determine if the triangle is equilateral (all sides are equal),
        // isosceles (exactly two sides are equal),
        // or scalene (no sides are equal).
        // Use an if-else statement to classify the triangle.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Print side1 value:");
        int side1 = scanner.nextInt();

        System.out.println("Print side2 value:");
        int side2 = scanner.nextInt();

        System.out.println("Print side3 value:");
        int side3 = scanner.nextInt();

        if (side1==side2 && side2==side3)
        {
            System.out.println("Triangle is equilateral");
        }
        else if (side1==side2 || side1==side3 || side2==side3)
        {
            System.out.println("Triangle is isosceles ");
        }

        else
        {
            System.out.println("Triangle is scalene");
        }
    }
}
