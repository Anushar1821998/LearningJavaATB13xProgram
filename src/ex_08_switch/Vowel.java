package ex_08_switch;

import java.util.Scanner;

class Vowel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println ("Enter the character");
        char ch = scanner.next().toLowerCase().charAt(0);

        if (ch == 'a' || ch =='e' || ch=='i' || ch == 'o' || ch == 'u' )
        {
            System.out.println ("Character is vowel");

        }

        else if (ch>='a' && ch<='z' )
        {
            System.out.println("Not a character. Invalid input");
        }

        else
        {
            System.out.println ("Character is consonant");
        }
    }
}
