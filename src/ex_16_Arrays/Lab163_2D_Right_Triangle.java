package ex_16_Arrays;

import java.util.Scanner;

public class Lab163_2D_Right_Triangle {
    public static void main(String[] args) {
        // How the pattern we want
        //  n = 3
        // *
        // **
        // ***

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the n value");
        int n = scanner.nextInt();

        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {

                System.out.print("*");

            }
            System.out.println();

        }
    }
}
