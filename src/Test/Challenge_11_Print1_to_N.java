package Test;

import java.util.Scanner;

public class Challenge_11_Print1_to_N {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int N = scanner.nextInt();

        for(int i=1;i<=N;i++)
        {
            System.out.print(i + "\t");
        }
    }
}
