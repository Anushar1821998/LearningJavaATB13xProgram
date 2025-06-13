package ex_04_Operator;

public class Lab_Assignment3_GradeCalculation {
    public static void main(String[] args) {
        //Marks 90 = A+, 75 = A, 60 = B, 40 = C, below 40 Fail.

        //input is Integer
        //output required in text/string

        int Mark = 7;

        //Logic
        //>=90 --> A+
        //75 to 89 --> A
        //60 to 74 --> B
        //40 to 59 --> C
        //<40 -->Fail

        String Grade = (Mark>=90) ? "A+" : (Mark>=75) ? "A" : (Mark>=60) ? "B" : (Mark>=40) ? "C" : "Fail";
        System.out.println(Grade);




    }
}
