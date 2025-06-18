package ex_07_Increment_Decrement_Op;

public class _13th_June_Task6_Interview_ID {
    public static void main(String[] args) {
        //🔹Program 6:  Interview Question

        int x = 5;
        int y = x++ + ++x + x++ + ++x;
        System.out.println("x = " + x + ", y = " + y);

        //7 | 5 |NA
        //8 | 9  | 5 + 7 + 7 + 9 = 28
        //9 | x=9, y=28
    }
}
