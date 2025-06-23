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


         string_reverse();

    }

    public static void  string_reverse() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String");
        String string_value = scanner.next();

        System.out.println("String value entered is:" + " " + string_value);

        String reverse = " ";

        //madam
        for (int i = 0; i < string_value.length(); i++) {

            reverse = string_value.charAt(i) + reverse;


        }
        System.out.println("Reversed string value is:" + " " + reverse);

        if (reverse.equals(string_value)) {

            System.out.println(reverse + " " + "is a Palindrome");

        }

        else

        {
            System.out.println(string_value + " " + "is not Palindrome");


        }


    }


}
