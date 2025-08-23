package July_3rd_Task.MethodOverriding;

public class Task1_AnimalSound {
    public static void main(String[] args) {

        Animal a1 = new Animal();
        a1.Sound();

        Animal a2 = new Cat();
        a2.Sound();

        Animal a3 = new Dog();
        a3.Sound();

        Animal a4 = new Cow();
        a4.Sound();

    }
}

class Animal
{
    void Sound()
    {
        System.out.println("Animal make sound");
    }
}

class Dog extends Animal
{
    @Override
    void Sound()
    {
        System.out.println("Dog Barks");
    }
}

class Cat extends Animal
{
    void Sound()
    {
        System.out.println("Cat meow");
    }
}

class Cow extends Animal
{
    @Override
    void Sound() {
        System.out.println("Cow Moo");
    }
}
