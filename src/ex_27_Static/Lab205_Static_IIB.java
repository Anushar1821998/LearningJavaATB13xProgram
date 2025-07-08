package ex_27_Static;

public class Lab205_Static_IIB {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A();
        System.out.println(A.a);
        A.a=12;
        System.out.println(A.a);
        System.out.println(a1.a);
        System.out.println(a2.a);
        //System.out.println(A.b); non-static variable cannot be accessed

        a1.b=30;
        a2.b=40;

        System.out.println(a1.b);
        System.out.println(a2.b);
    }

}

class A
{
    static int a = 10;
    int b= 20;

    static
    {
        System.out.println("This Static block");
    }

}
