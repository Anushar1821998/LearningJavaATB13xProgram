package ex_07_Increment_Decrement_Op;

public class Lab075_Exp1_Interview {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a++ + ++a);
        System.out.println(a);

        //10 + 12 = 22
        // 12

        // a++ -> A -> ExpA -> 10 , a ->  11
        // +
        // ++a -> B -> ExpB -> 12 , a -> 12
    }
}
