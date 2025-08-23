package ex_20_OOPs_Polymorphism.methodoverloading;

public class Calculator {
    public static void main(String[] args) {
        Add a = new Add();
        int result = a.addition(3, 6);
        int result1 = a.addition(4, 5, 6);

        System.out.println(result1);
        System.out.println(result);
    }
}

class Add
{
    int addition(int a, int b)
    {
        return a+b;
    }

    int addition (int a , int b, int c)
    {
        return a+b+c;
    }
}
