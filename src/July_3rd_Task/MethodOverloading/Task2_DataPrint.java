package July_3rd_Task.MethodOverloading;

public class Task2_DataPrint {
    public static void main(String[] args) {
        Printer p = new Printer();
        p.printer("Hello...you can print anything you want");
        p.printer(2,4);
        p.printer(45.78f,34.78f);
    }

}

class Printer
{
    void printer(String data)
    {
        System.out.println(data);
    }

    void printer(int a, int b)
    {
        System.out.println(a+b);
    }

    void printer(float a, float b)
    {
        System.out.println(a+b);
    }
}
