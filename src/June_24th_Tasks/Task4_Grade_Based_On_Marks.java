package June_24th_Tasks;

import java.util.Scanner;

public class Task4_Grade_Based_On_Marks {
    /* 90 - 100   A+
    80 - 89     A
    70 - 79      B
    60 - 69     C
    50 - 59      D
    40 - 49      E
    Below 40   Fail */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the marks");
        int mark = scanner.nextInt();


      if(mark>=0 && mark<=100)
        {
            if(mark>=90 && mark <=100)
            {
                System.out.println("Your Grade is A+");
            }
            else if (mark>=80 && mark<=89)
            {
                System.out.println("Your Grade is A");
            }
            else if (mark>=70 && mark<=79) {
                System.out.println("Your Grade is B");
            }
            else if (mark>=60 && mark<=69) {
                System.out.println("Your Grade is C");
            }
            else if (mark>=50 && mark<=59) {
                System.out.println("Your Grade is D");
            }
            else if (mark>=40 && mark<=49)
            {
                System.out.println("Your Grade is E");
            }
            else
            {
                System.out.println("FAIL");
            }


        }

      else
      {
          System.out.println("INVALID INPUT");
      }




    }
}
