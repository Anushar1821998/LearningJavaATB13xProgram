package June_25th_Tasks;

import java.util.Scanner;

public class Task17_Armstrong_Or_Not {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scanner.nextInt();
        int original_num = num;
        //153

        int armstrong = 0;
        int count = Integer.toString(num).length();

        while(num!=0) {
            int digit = num % 10;
            armstrong = (int) (armstrong + Math.pow(digit, count));
            num /= 10;
        }

        if(armstrong == original_num)
        {
            System.out.println(original_num + " " + "is a Armstrong number");
        }
        else
        {
            System.out.println(original_num + " " + "is not a Palindrome");
        }

    }
}
