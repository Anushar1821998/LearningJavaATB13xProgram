package ex_07_Increment_Decrement_Op;

public class Lab070_ID_Op{
    public static void main(String[] args) {

        int a = 10;
        int b = ++a; //incremented first and then stored in the result.

        System.out.println(a);
        System.out.println(b);

        //6 | 10 | NA
        //7 | 11 | 11
        //9 | 11 | NA
        //10| NA | 11


        //  Exp and Result Table
        // Line No | a | Result b
        //  8 |  10 |  NA
        // 9 |  11 |  11
        // 10 | 11(NA) | 11
        // 11 | 11 | 11(NA)

    }
}
