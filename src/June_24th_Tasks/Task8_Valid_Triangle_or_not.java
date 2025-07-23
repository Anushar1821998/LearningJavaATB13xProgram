package June_24th_Tasks;

import java.util.Scanner;

public class Task8_Valid_Triangle_or_not {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Enter the side1:");
        int side1 = scanner.nextInt();

        System.out.println("Enter the side2:");
        int side2 = scanner.nextInt();

        System.out.println("Enter the side3:");
        int side3 = scanner.nextInt();

        if((side1+side2)>side3 && (side2+side3)>side1 && (side1+side3)>side2)
        {
            System.out.println("Triangle is  Valid");
        }
        else
        {
            System.out.println("Invalid Triangle");
        }
    }
}
