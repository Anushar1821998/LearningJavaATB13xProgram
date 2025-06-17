package ex_06_Ternary_Operator;

public class Lab064_TO {
    public static void main(String[] args) {
        // The min number between two numbers by using ternary operator.
        int num1 = 6;
        int num2 = 5;

        String result = (num1<num2) ? num1 + "is minimum number" : num2 + "is minimum number";

        System.out.println(result);
    }
}
