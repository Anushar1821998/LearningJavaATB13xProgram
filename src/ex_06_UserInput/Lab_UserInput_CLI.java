package ex_06_UserInput;

public class Lab_UserInput_CLI {
    public static void main(String[] args) {
        //find the valid age for voting

        String age_value = args[0];
        int age = Integer.parseInt(age_value);

        System.out.println("Person's age is: " + " " + age);

        String Output = (age>=18) ? "Eligible to vote" : "Not eligible to vote";

        System.out.println(Output);
    }
}
