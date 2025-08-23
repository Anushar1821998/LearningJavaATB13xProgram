package July_3rd_Task.MethodOverloading;

public class Task5_FinMaximum {
    public static void main(String[] args) {
        Utility u = new Utility();
        int m1 = u.max(45, 78);
        double m2 = u.max(678.90, 6758.9);
        int m3 = u.max(23,56,78);

        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);

    }
}

class Utility
{
    int max(int a, int b)
    {
        if(a>b)
        {
            return a;
        }
        else
            return b;
    }

    int max(int a, int b, int c)
    {
        int res = (a > b) ? (a > c) ? a : c : (b > c) ? b : c;
        return res;
    }

    double max(double a, double b)
    {
        if(a>b)
        {
            return a;
        }

        else
            return b;
    }
}
