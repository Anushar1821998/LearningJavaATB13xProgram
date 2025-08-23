package ex_24_OOPs_Abstraction_Abstract_Class;

public class Lab196_AB_Cars {
    public static void main(String[] args) {
        Wagnor car = new Wagnor();
        car.drive();
    }
}



abstract class Engine{
    abstract void StartEngine();
    abstract void StopEngine();

    void checkEngine()
    {
        System.out.println("Everything is good");
    }
}

class Wagnor extends Engine
{

    @Override
    void StartEngine() {
        System.out.println("Starting the car");
    }

    @Override
    void StopEngine() {
        System.out.println("Stopping the car");
    }

    void drive()
    {
        checkEngine();
        StartEngine();
        StopEngine();
    }
}