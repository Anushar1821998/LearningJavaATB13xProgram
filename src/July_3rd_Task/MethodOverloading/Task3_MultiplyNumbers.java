package July_3rd_Task.MethodOverloading;

public class Task3_MultiplyNumbers {
    public static void main(String[] args) {
 MathOperations m = new MathOperations();
  int r1 = m.multiply(1,2,3);
 int r2 =  m.multiply(4,6);

        System.out.println(r1);
        System.out.println(r2);
    }
}

class MathOperations
{
    int multiply(int a, int b)
    {
        return a*b;
    }

    int multiply(int a, int b, int c)
    {
        return a*b*c;
    }
}
