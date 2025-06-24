package Test;

import java.util.Scanner;

public class Challenge_8_Leap_Year {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your favourite year");
        int year = scanner.nextInt();

        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
        {
            System.out.println("Its a leap year");
        }
        else
        {
            System.out.println("Its not a leap year");
        }
    }

}
