package June_23rd_Tasks;

import java.util.Scanner;

public class Task7_Largestof_3_numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the 1st number:");
        int num1 = scanner.nextInt();
        System.out.println("number1:" + " " + num1);

        System.out.println("Enter the 2nd number:");
        int num2 = scanner.nextInt();
        System.out.println("number1:" + " " + num2);

        System.out.println("Enter the 3rd number:");
        int num3 = scanner.nextInt();
        System.out.println("number1:" + " " + num3);

        String max = (num1>num2) ? (num1>num3) ? num1 + "is the max number" : num3 + " is the max number" : (num2>num3) ? num2 + "is the max number" : num3 + "is the max number";

        System.out.println(max);
    }
}
