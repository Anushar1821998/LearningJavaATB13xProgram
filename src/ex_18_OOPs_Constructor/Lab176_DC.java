package ex_18_OOPs_Constructor;

public class Lab176_DC {
    public static void main(String[] args) {
        car c1 = new car();
        car c2 = new car();

        c1.name = "Audi";
        System.out.println(c1.name);
        System.out.println(c1.model);
        System.out.println(c1.year);

        System.out.println(c2.name);
        c2.name= "Tesla";
        System.out.println(c2.name);
    }


}

class car
{
    String name;
    int year;
    String model;


    car()
    {
        name = "Unknown Car";
        year = 1991;
        model =  "XXX";
    }


}


