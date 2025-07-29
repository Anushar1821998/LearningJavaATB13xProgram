package June_23rd_Tasks;

import java.util.Scanner;

public class Task5_Age_Check {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tell me your age:");
        int age = scanner.nextInt();

        System.out.println("Your age is:" + " " + age);

        if(age>=18)
        {
            System.out.println("Hurreyy.....You are eligible to vote");
        }

        else
        {
            System.out.println("Uffooo....You are not eligible to vote!");
        }
    }
}
