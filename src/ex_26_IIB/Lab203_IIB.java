package ex_26_IIB;

public class Lab203_IIB {
    // ```
    //IIB
    //Instance initialization Block == IIB
    //It will be executed when Object is created.
    //```
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A();

    }
}

    class A
    {
        void B()
        {
            System.out.println("DC. Its a constructor");
        }

        {
            System.out.println("Hi, I am IIB");
            System.out.println("If you want to execute or call something when object is created");
            // mysql connection
            // read a csv, xlsx file
            // read json, xml.
            // read a text file or env file
        }
        {
            System.out.println("This is IIB2");
        }
        {
            System.out.println("This is IIB3");
        }

        static{
            System.out.println("This is Static method and will be called/loaded first");
        }

}
