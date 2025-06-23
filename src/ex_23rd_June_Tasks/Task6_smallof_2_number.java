package ex_23rd_June_Tasks;

import java.util.Scanner;

public class Task6_smallof_2_number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = scanner.nextInt();
        System.out.println("number1:" + " " + num1);

        System.out.println("Enter the second number:");
        int num2 = scanner.nextInt();
        System.out.println("number1:" + " " + num2);

        String small = (num1<num2) ? num1 + "is the small number" : num2 + "is the small number";

        System.out.println(small);
    }
}
