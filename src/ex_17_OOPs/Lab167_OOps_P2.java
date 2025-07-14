package ex_17_OOPs;

public class Lab167_OOps_P2 {
    public static void main(String[] args) {

        student s1 = new student();
        student s2;
        new student();

    }
}

class student{

    String name;

    student()
    {
        System.out.println("This is default constructor, will be called when object is created");
    }

    void sleep()
    {
        System.out.println("Dont sleep during the class");
    }
}

class A
{

}

class B
{

}
