package June_25th_Tasks;

import java.util.Scanner;

public class Task16_Palindrome_Or_Not {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scanner.nextInt();

        int reverse = Checker(num);

        if(reverse == num)
        {
            System.out.println(num + " " + "is a Palindrome number");
        }
        else
        {
            System.out.println(num + " " + "is not a Palindrome number");
        }

    }

    public static int Checker(int num)
    {
        int reversed_num = 0;

        while(num!=0) {
            int digit = num % 10;
            reversed_num = reversed_num * 10 + digit;
            num /= 10;
        }

        return reversed_num;
    }
}

