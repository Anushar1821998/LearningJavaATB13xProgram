package June_25th_Tasks;

import java.util.Scanner;

public class Task22_Travel_Eligibility_Check {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age");
        int Age = scanner.nextInt();

        System.out.println("Enter if your VISA status is Valid/Invalid");
        String Status = scanner.next();

        Eligibility_Check e = new Eligibility_Check();
        boolean status = e.checker(Age,Status);

        if(status)
        {
            System.out.println("You are eligible to Travel");
        }

        else
        {
            System.out.println("Sorryy!!!! You are not eligible to travel");
        }


    }
}

class Eligibility_Check
{
    boolean checker (int Age, String Status)
    {
        if(Age>0 && Age>=18 && Status.equals("Valid"))
        {
            return true;
        }

        return false;
    }
}
