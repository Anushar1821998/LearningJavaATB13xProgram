package ex_17_OOPs;

public class person {

    // These are called properties, attributes, instance variables, member variables.
    String name;
    int age;
    String height;
    String gender;
    boolean is_married;

    // These are called as Behaviours, Member Functions, Functions, Methods.
    void walk(){
        System.out.println("Walking");
    }

    void eat(String food){
        System.out.println("Eating");
    }

    String sleep(){
        System.out.println("Sleeping");
        return null;
    }

    String food(int a){
        System.out.println("Food");
        return null;
    }
}
