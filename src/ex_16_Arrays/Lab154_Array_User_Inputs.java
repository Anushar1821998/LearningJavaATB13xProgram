package ex_16_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Lab154_Array_User_Inputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array int only");
        int size = scanner.nextInt();

        int[] numbers_marks = new int[size];
        System.out.println("Enter the numbers");
        for (int i = 0; i < numbers_marks.length; i++) {
            numbers_marks[i] = scanner.nextInt();
        }

        System.out.println("Entered numbers for array are as below in sorted format");
        Arrays.sort(numbers_marks);
        for (int i = 0; i < numbers_marks.length; i++) {
            System.out.println(numbers_marks[i]);
        }
    }

}
