package ex_20_OOPs_Polymorphism.methodoveridding;

public class Lab189_MOverriding {
    public static void main(String[] args) {

        Animal a = new Animal();
        a.sound();

        Animal a1 = new Dog();
        a1.sound();

    }


}

class Animal
{
    void sound()
    {
        System.out.println("Animal make sound");
    }
}

class Dog extends Animal
{
    @Override
    void sound()
    {
        System.out.println("Dog Barks!!");
    }
}