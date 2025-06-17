package ex_07_Increment_Decrement_Op;

public class Lab071_POST_ID {
    public static void main(String[] args) {

        //pre-increment - incremented first and then stored in the result.
        int a = 10;
        System.out.println(++a);
        System.out.println(a);

        //7 | 10 | NA
        //8 | 11 | 11
        //9 | NA | 11

        //post-increment - print first and then increase the value.
        int b = 10;
        System.out.println(b++);
        System.out.println(b);

        //16 | 10 | NA
        //17 | 10 | 10
        //18 | 11

    }
}
