package June_23rd_Tasks;

import java.util.Scanner;

public class Task2_Even_or_Odd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = scanner.nextInt();

        if(num%2==0)
        {
            System.out.println("Number is Even");
        }

        else
        {
            System.out.println("Number is odd");
        }
    }
}
