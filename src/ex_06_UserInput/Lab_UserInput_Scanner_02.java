package ex_06_UserInput;

import java.util.Scanner;

public class Lab_UserInput_Scanner_02 {
    public static void main(String[] args) {
        //take different types of inputs from user

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Integer value");
        int a = scanner.nextInt();
        System.out.println("Integer value entered is" + a);

        System.out.println("Enter your name");
        String Name = scanner.next();
        System.out.println("String value is"+Name);

        System.out.println("Enter the Double integer value");
        double num2 = scanner.nextDouble();
        System.out.println("Double integer value is" + num2);
    }
}
