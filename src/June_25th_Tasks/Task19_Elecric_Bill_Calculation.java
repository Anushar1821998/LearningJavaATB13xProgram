package June_25th_Tasks;

import java.util.Scanner;

public class Task19_Elecric_Bill_Calculation {

    /*  :-  First 100 units: 0.50Rs per unit
            :-  Next 100 units (101-200): 0.75Rs per unit
            :- Next 100 units (201-300): 1.20Rs per unit
            :- Above 300 units: 1.50Rs per unit */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of power units utilized");
        double unit = scanner.nextFloat();
        double Bill_amount;

        if(unit<=100)
        {
            Bill_amount = (unit * 0.50);
            System.out.println("Your electricity bill amount to be paid is: Rs." + Bill_amount);
        } else if (unit>100 && unit<=200)
        {
            Bill_amount = ((100*0.50) + ((unit-100)*0.75));
            System.out.println("Your electricity bill amount to be paid is: Rs."  + Bill_amount);
        }
        else if (unit>200 && unit<=300)
        {
            Bill_amount = ((100*0.50) + (100*0.75) + ((unit-200)*1.20));
            System.out.println("Your electricity bill amount to be paid is: Rs."  + Bill_amount);
        }
        else
        {
            Bill_amount = ((100*0.50) + (100*0.75) + (100*1.20) + ((unit-300)*1.20) );
            System.out.println("Your electricity bill amount to be paid is: Rs."  + Bill_amount);
        }



    }
}
