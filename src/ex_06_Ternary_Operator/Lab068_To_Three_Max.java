package ex_06_Ternary_Operator;

public class Lab068_To_Three_Max {
    public static void main(String[] args) {
        // Find the maximum between the three numbers.
        // Now we will be using the logic building formula.

        int num1 = 99;
        int num2 = 97;
        int num3 = 77;

        String output = (num1>num2) ?  (num1>num3) ?  num1 + "is maximum number" :  num3 + "is maximum number" : (num2>num3) ? num2 + "is maximum number" : num3 + "is maximum number" ;

        System.out.println(output);
    }
}
