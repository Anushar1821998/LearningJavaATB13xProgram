package June_23rd_Tasks;

import java.util.Scanner;

public class Task4_Vowel_or_con {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the character:");
        char c = scanner.next().trim().charAt(0);

        System.out.println("Entered character : " + " " + c);

        if(c=='a' || c== 'e' || c=='i' || c=='o' || c=='u')
        {
            System.out.println("Entered character is vowel");
        }
        else
        {
            System.out.println("Entered character is consonant");
        }


    }
}
