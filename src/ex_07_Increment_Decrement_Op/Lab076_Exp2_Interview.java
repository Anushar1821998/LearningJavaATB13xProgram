package ex_07_Increment_Decrement_Op;

public class Lab076_Exp2_Interview {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + ++a);
        System.out.println(a);

        //11 + 12 = 23
        //12

        // ++a -> A -> ExpA -> 11 , a -> 11
        // +
        // ++a -> B -> ExpB -> 12 , a -> 12
    }
}
