package June_24th_Tasks;

import java.util.Scanner;

public class Task7_ATM_Withdrawal_Simulation {
    public static void main(String[] args) {
        int acc_balance = 10000;
        int curr_balance = 0;
        int can_withdraw = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount to withdraw");
        int to_withdraw = scanner.nextInt();


        if(to_withdraw>0 && to_withdraw%100==0 && to_withdraw<=acc_balance)
        {
            curr_balance = acc_balance - to_withdraw;
            System.out.println("Transaction is successful !!");
            System.out.println("Please collect the cash");
            System.out.println("Your Current Available Balance is" + " " + curr_balance);
        }


        else if (to_withdraw % 100 != 0)
        {
            System.out.println("Please enter the amount in multiples of 100");
        }
        else if (to_withdraw<=0)
        {
            System.out.println("Please enter the amount greater than 0");
        }

        else if(to_withdraw>=acc_balance)
        {
            System.out.println("You cannot exceed the Account balance");
            System.out.println("Your Account balance is = " + " " + acc_balance);
        }
        else
        {
            System.out.println("Try another time");
        }


    }
}
