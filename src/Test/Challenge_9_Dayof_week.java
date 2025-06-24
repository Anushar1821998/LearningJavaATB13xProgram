package Test;

import java.util.Scanner;

public class Challenge_9_Dayof_week {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your favourite day number");
        int day = scanner.nextInt();

        switch(day)
        {
            case 1 -> System.out.println("Its Monday");
            case 2 -> System.out.println("Its Tuesday");
            case 3 -> System.out.println("Its Wednesday");
            case 4 -> System.out.println("Its Thursday");
            case 5 -> System.out.println("Its Friday");
            case 6 -> System.out.println("Its Saturday");
            case 7 -> System.out.println("Its Sunday");
            default -> System.out.println("Invalid day number");
        }

    }
}
