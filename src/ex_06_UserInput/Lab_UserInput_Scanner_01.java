package ex_06_UserInput;

import java.util.Scanner;

public class Lab_UserInput_Scanner_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = scanner.nextInt();


        String CanIVote = (age >= 18) ? "Eligible to vote" : "Not eligible to vote";

        System.out.println(CanIVote);
    }
}
