package ex_04_Operator;

public class Lab_Assignment6_ASCII_Typecast {
    public static void main(String[] args) {
        //Typecasts a character to its ASCII integer value. Example Print A ASCII Int value.

        char letter = 'A';
        int value;

        value = (int) letter;
        System.out.println("ASCII value of letter 'A' is " + value);

    }
}
