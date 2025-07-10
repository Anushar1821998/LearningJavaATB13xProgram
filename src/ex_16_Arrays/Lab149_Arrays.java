package ex_16_Arrays;

import java.util.Arrays;

public class Lab149_Arrays {
    public static void main(String[] args) {
        int[] marks = {90,45,67,23,60,98}; //pre-defined array
        System.out.println(marks.length);
        System.out.println(marks[4]);
       // System.out.println(marks[7]); //ArrayIndexOutOfBoundsException
        String[] name = {"Anusha","Ansha", "Anu"};

        boolean[] b = {true, false, true};

        System.out.println(marks[3]);
        System.out.println(name[1]);

        System.out.println(marks.length);
        System.out.println(Arrays.toString(name.clone()));
    }

}
