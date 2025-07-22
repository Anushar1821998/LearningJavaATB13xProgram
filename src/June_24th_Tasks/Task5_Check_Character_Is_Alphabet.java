package June_24th_Tasks;

import java.util.Scanner;

public class Task5_Check_Character_Is_Alphabet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character");
        char c = scanner.next().charAt(0);

        System.out.println(c + " " + "is the entered character");

        if((c >= 'a' && c<='z') || (c>='A' && c<= 'Z'))
        {
            System.out.println("Entered character is an Alphabet");
        }

        else
        {
            System.out.println("Entered character is not an Alphabet");
        }
    }
}
