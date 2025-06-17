package ex_06_Ternary_Operator;

public class Self_Task_Smallest_Number {
    public static void main(String[] args) {
        //Find the Smallest of Three Numbers

        int num1 =440;
        int num2 = 700;
        int num3 = 89;

        String Result = (num1<num2) ? (num1<num3) ? num1 + "is small number" : num3 + "is small number" : (num2<num3) ? num2 + "is small number" : num3 + "is small number";

        System.out.println(Result);
    }
}
