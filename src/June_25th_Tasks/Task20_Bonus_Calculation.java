package June_25th_Tasks;

import java.util.Scanner;

public class Task20_Bonus_Calculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Salary");
        int salary = scanner.nextInt();

        System.out.println("Enter your year of experience in whole number");
        int Exp_year = scanner.nextInt();
        int Bonus;
        int total;

        if(Exp_year<1)
        {
            System.out.println("There is no bonus for you");
        } else if ( Exp_year>=1 && Exp_year<=3)
        {
            Bonus = (salary*5) / 100;
            total = salary + Bonus;
            System.out.println("Your BONUS amount is: Rs." + Bonus);
            System.out.println("Your total salary amount after the Bonus is Rs." + total);

        }
        else if ( Exp_year>=4 && Exp_year<=6)
        {
            Bonus = (salary*10) / 100;
            total = salary + Bonus;
            System.out.println("Your BONUS amount is: Rs." + Bonus);
            System.out.println("Your total salary amount after the Bonus is Rs." + total);

        }

        else
        {
            Bonus = (salary*15) / 100;
            total = salary + Bonus;
            System.out.println("Your BONUS amount is: Rs." + Bonus);
            System.out.println("Your total salary amount after the Bonus is Rs." + total);
        }


    }
}
