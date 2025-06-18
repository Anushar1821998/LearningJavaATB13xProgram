package ex_09_Switch;

import java.util.Scanner;



public class Lab084_Switch {
    public static void main(String[] args) {
        //
        // Take a user input and tell them the day which they have told.
        // 1 to 7 -> 1 -> mon, 5 -> fri
        // 8 ? - Not allowed or error

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to know the day");
        int Day = scanner.nextInt();

        switch(Day)
        {
            case 1 -> System.out.println ("Its Monday");
            case 2 -> System.out.println("Its Tuesday");
            case 3 -> System.out.println ("Its Wednesday");
            case 4 -> System.out.println ("Its Thursday");
            case 5 -> System.out.println ("Its Friday");
            default -> System.out.println("Invalid input and not allowed");
        }
    }
}
