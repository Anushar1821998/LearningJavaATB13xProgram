package ex_09_Switch;

public class Task_Break {
    public static void main(String[] args) {
        int side1 = 10;
        int side2 = 20;
        int side3 =10;

        if (side1 != side2)
        {
            if (side1 == side3)
            {
                System.out.println("Triangle is Equilateral");
            }

            if (side1 == side3)
            {
                System.out.println("Triangle is isosceles ");
            }
        }

        else
        {
            System.out.println("Triangle is scalene ");
        }


    }
}
