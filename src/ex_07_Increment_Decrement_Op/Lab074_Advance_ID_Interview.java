package ex_07_Increment_Decrement_Op;

public class Lab074_Advance_ID_Interview {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a++ + a);

        //10 + 11 = 21

        // A + B
        // A -> a++ -> ExpA -> 10 , a =11
        // +
        // B -> a -> ExpB , ExpB -> 11 , a = 11

        // Line No. |  a |  Exp
        // 5 | 10 | NA |
        // 6 | 11 | 10+11 -> 21
    }
}
