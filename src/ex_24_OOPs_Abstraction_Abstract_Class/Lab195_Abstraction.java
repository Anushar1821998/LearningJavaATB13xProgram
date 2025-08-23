package ex_24_OOPs_Abstraction_Abstract_Class;

public class Lab195_Abstraction {
    public static void main(String[] args) {
        car o1 = new car();
        //object for abstract class cannot be created
        //father f1 = new father();

        child c1 = new child();
        father c2 = new child(); //dynamic dispatch
        c1.loan50k();
        c1.loan25k();
    }
}

class car
{
    //this is concrete class bcs it does not have the abstract method
    void done()
    {
        //its a complete method
    }
}

abstract class father
{
    //this is the abstract function
   abstract void loan50k();

   //complete class
   void loan25k()
{
    System.out.println("Given 25k loan already");
}
}

class child extends father
{

    @Override
    void loan50k() {
        System.out.println("Son have to give 50k loan");
    }
}
