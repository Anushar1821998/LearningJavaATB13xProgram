package ex_16_Arrays;

import java.util.Scanner;

public class Lab156_SUM_OF_ARRAYS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the array elements");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Array elements are");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("Find the sum of entered elements");
        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("Sum value is =" + " " + sum);
    }
}
