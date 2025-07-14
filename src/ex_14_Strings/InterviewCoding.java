package ex_14_Strings;

import java.util.Scanner;


public class InterviewCoding {
    public static void main(String[] args) {
        //  Palindrome
        //  madam ->  reverse(madam) -> madam ==
        //  s1 = madam
        // s1_reverse = madam
        //  s1 == s1_reverse
        // G

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String");
        String string_value = scanner.next();

        System.out.println("String value entered is:" + " " + string_value);


        String reverse = string_reverse(string_value);

        if (reverse.equals(string_value)) {

            System.out.println(reverse + " " + "is a Palindrome");

        } else {
            System.out.println(string_value + " " + "is not Palindrome");


        }


    }

    public static String string_reverse(String input) {

        String reverse = " ";

        //madam
        for (int i = 0; i < input.length(); i++) {

            reverse = input.charAt(i) + reverse;


        }
        System.out.println("Reversed string value is:" + " " + reverse);
        return reverse;

    }
}


