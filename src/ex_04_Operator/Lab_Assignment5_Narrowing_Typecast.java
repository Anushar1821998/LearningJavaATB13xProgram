package ex_04_Operator;

public class Lab_Assignment5_Narrowing_Typecast {
    public static void main(String[] args) {
        //Casts a double to an int, cutting off decimals value.

        double A = 23.56;
        int B = (int) A;

        System.out.println("Typecasted value of Double  A to Integer is = " + B);
    }
}
