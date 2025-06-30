package ex_15_StringBuffer_Builder_StringFunctions;

import java.util.Scanner;

public class Interview_Vowels {
    public static void main(String[] args) {
        // Java Program to Count Vowels and Consonants
        // pramod -> a,i,e,o,u -> V- 2, C- 4

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name");
        String name = scanner.next();

        String Name = name.toLowerCase();
        System.out.println("Entered name is" + Name);

        int vowels = 0 ;
        int consonant = 0 ;

        for (int i = 0; i < Name.length(); i++)
        {
           char ch = Name.charAt(i);

           if (ch == 'a' || ch == 'e' || ch == 'i'|| ch == 'o' || ch == 'u')
           {

               vowels ++;
           }

           else
           {

               consonant ++;
           }
        }

        System.out.println("Vowels count is" +  " " + vowels) ;
        System.out.println("Consonant count is"  + " " + consonant);
    }
}
