package ex_04_Operator;

public class Lab_Assignment2_EvenOrOdd {
    public static void main(String[] args) {
        int A = 19;
        String result1 = (A % 2 == 0) ?  A + " " + "is Even" : A + " " + "is Odd";
        System.out.println(result1);

        A = 20;
        String result2 = (A % 2 == 0) ? A + " " + "is Even" : A + " " + "is Odd";
        System.out.println(result2);

    }

}
