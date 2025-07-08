package ex_27_Static;

import java.sql.SQLOutput;

public class Lab206_Static {
    public static void main(String[] args) {
        A1 a1 = new A1(50);
        A1 a2 = new A1(90);

        System.out.println(a1.a);
        System.out.println(a1.b);
        System.out.println(a2.a);
        System.out.println(a2.b);

        a1.display();
        a2.display();

        A1.staticMethod();
    }

}

class A1
{
     int a = 70;
    static int b= 20;

    A1(int a)
    {
        this.a=a;//this.a will have the method constructor value
        //b=this.a;
        System.out.println("this.a from A1()" + this.a);
        System.out.println("This is b from A1()" +  b);
    }

    void display()
    {
        System.out.println("this.a from display()" + this.a);
        System.out.println("This is b from display()" + b); // static variable in instance method allowed
    }

    static void staticMethod()
    {
        System.out.println("It will be called when class is loaded");
//        System.out.println(this.a); //  Methods cannot access non-static variables in a static function.
    }
}