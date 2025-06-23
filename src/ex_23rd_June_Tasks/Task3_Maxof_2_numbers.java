package ex_23rd_June_Tasks;

import java.util.Scanner;

public class Task3_Maxof_2_numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = scanner.nextInt();
        System.out.println("num1:" + " " + num1);

        System.out.println("Enter the Second number:");
        int num2 = scanner.nextInt();
        System.out.println("num1:" + " " + num1);

        String max = (num1>num2) ? num1 + " " + "is the max number" : num2 + " " + "is the max number";

        System.out.println(max);

    }
}
