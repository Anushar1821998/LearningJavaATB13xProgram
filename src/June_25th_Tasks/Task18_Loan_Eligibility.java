package June_25th_Tasks;

import java.util.Scanner;

public class Task18_Loan_Eligibility {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Age");
        int Age = scanner.nextInt();

        System.out.println("Enter your Salary");
        float Salary = scanner.nextInt();

        System.out.println("Enter your Credit Score");
        int credit_score = scanner.nextInt();

        Loan l= new Loan();
        boolean Age_check= l.Age_Check(Age);
        boolean salary_val = l.Salary_Validation(Salary);
        boolean credit_check = l.Credit_Score_Check(credit_score);

        if(Age_check && salary_val && credit_check)
        {
            System.out.println("You are Eligible to take the loan");
        }

        else {
            System.out.println("You are Not Eligible to take the Loan");
        }
    }
}

class Loan
{
    boolean Age_Check(int Age)
    {

              if(Age>0 && Age>=18 && Age<=80)

                  return true;


        System.out.println("Age must be greater than 18");
          return false;
    }

    boolean Salary_Validation(float Salary)
    {

            if(Salary>0 && Salary>=30000)
            {
                return true;
            }

        System.out.println("Your Salary must be above 30k to opt for the loan");
        return false;
    }

    boolean Credit_Score_Check(int Credit)
    {

            if(Credit>0 && Credit>=650 && Credit<=850)
            {
                return true;
            }

            System.out.println("You should have a minimum credit score of 650 to opt for the loan");
        return false;
    }
}
