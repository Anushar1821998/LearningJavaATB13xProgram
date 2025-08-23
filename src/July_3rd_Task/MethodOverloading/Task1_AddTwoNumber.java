package July_3rd_Task.MethodOverloading;

public class Task1_AddTwoNumber {
    public static void main(String[] args) {
        Calculator c= new Calculator();
        int r1 = c.add(23, 89);
        double r2 = c.add(67.90,34.78);

        System.out.println(r1);
        System.out.println(r2
        );

    }

}

class Calculator
{
   public int add(int a, int b)
   {
       return a+b;
   }

    public double add(double a, double b)
    {
        return a+b;
    }
}

