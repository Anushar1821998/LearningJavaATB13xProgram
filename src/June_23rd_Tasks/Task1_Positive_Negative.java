package June_23rd_Tasks;

import java.util.Scanner;

public class Task1_Positive_Negative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = scanner.nextInt();

        if (num>0)
        {
            System.out.println("Number is positive");
        }

        else if(num==0)
        {
            System.out.println("Number is 0");
        }

        else
        {
            System.out.println("Number is negative");
        }
    }
}
