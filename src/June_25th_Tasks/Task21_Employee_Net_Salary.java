package June_25th_Tasks;

import ex_19_OOps_Inheritance.multilevel_inheritance.Grandfather;

import java.util.Scanner;
import java.util.SortedMap;

public class Task21_Employee_Net_Salary {
    public static void main(String[] args) {
        //Calculate Employee Net Salary (Basic Pay, HRA, DA, Tax Deductions,)

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Basic Pay");
        double Basic_pay =  scanner.nextDouble();

        // Calculate HRA (assuming metro city: 50% of basic pay)
        double HRA = (Basic_pay*50) / 100;

        // Calculate DA (Dearness Allowance, common: 50% of basic pay)
        double DA = (Basic_pay*50) /100;

        // Calculate Gross Salary
        double Gross_Salary = Basic_pay + HRA + DA;

        // Calculate annual gross salary for tax
        double Annual_Gross = Gross_Salary * 12;

        // Calculate tax deduction as per FY2025-26 slabs (New Regime - default):
        // Up to ₹4,00,000: Nil
        // ₹4,00,001 - ₹8,00,000: 5% above ₹4,00,000
        // ₹8,00,001 - ₹12,00,000: 10% above ₹8,00,000
        // ₹12,00,001 - ₹16,00,000: 15% above ₹12,00,000
        // ₹16,00,001 - ₹20,00,000: 20% above ₹16,00,000
        // Above ₹20,00,000: 30% above ₹20,00,000

        double Tax;
        double Taxable = Annual_Gross;

        if(Taxable<=400000)
        {
             Tax = 0;
            System.out.println("No tax is applicable");
        } else if (Taxable>400000 && Taxable<=800000) {
            Tax = (Taxable * 5) / 100;
            System.out.println("Your Tax amount to be paid is Rs." + Tax);

        }
        else if (Taxable>800000 && Taxable<=1200000) {
            Tax = (Taxable * 10) / 100;

        }
        else if (Taxable>1200000 && Taxable<=1600000) {
            Tax = (Taxable * 15) / 100;
            System.out.println("Your Tax amount to be paid is Rs." + Tax);

        }
        else if (Taxable>1600000 && Taxable<=2000000) {
            Tax = (Taxable * 20) / 100;
            System.out.println("Your Tax amount to be paid is Rs." + Tax);

        }
        else
        {
            Tax = (Taxable * 30) / 100;
            System.out.println("Your Tax amount to be paid is Rs." + Tax);
        }

        // Monthly tax deduction
        double Month_Tax = Tax/12;

        // Net Salary Calculation
        double Net_Salary = Gross_Salary - Month_Tax;

        // Output the result
        System.out.println("\n--- Salary Slip ---");
        System.out.println("Basic Pay: Rs." + Basic_pay);
        System.out.println("HRA: Rs." + HRA);
        System.out.println("DA: Rs." +DA);
        System.out.println("Gross Salary (monthly):  Rs." + Gross_Salary);
        System.out.println("Tax deducted (monthly) Rs." + Month_Tax);
        System.out.println("Net Salary (monthly) Rs." + Net_Salary);

    }
}
