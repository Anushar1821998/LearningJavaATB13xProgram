package ex_06_Ternary_Operator;

public class Lab065_TO {
    public static void main(String[] args) {
        // The maximum number between two numbers by using ternary operator.

        int num1 = 5;
        int num2 = 6;

        String result = (num1>num2) ? num1 + "is greater number" : num2 + "is greater number" ;

        System.out.println(result);
    }
}
