package ex_06_Ternary_Operator;

public class Lab062_TO {
    public static void main(String[] args) {
        // Age to vote?
        int age = 19;

        String Vote = (age>=18) ? "Eligible to vote" : "Not eligible to vote";

        System.out.println(Vote);
    }
}
