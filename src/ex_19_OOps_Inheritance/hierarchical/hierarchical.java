package ex_19_OOps_Inheritance.hierarchical;

public class hierarchical {
    public static void main(String[] args) {
        Father1 f1 = new Father1();
        Ruhani r1 = new Ruhani();
        Pramod p1 = new Pramod();
        Father1 l1 = new Lucky();

        r1.home();
        p1.home();
        l1.home();
        r1.r1();
    }
}

class Father1
{
    void home(){
        System.out.println("3BHK");
    }
}

class Pramod extends Father1{
    void h2(){
        System.out.println("h2 - Pramod");
    }
}

class Lucky extends Father1
{
    void l2(){
        System.out.println("Lucky");
    }
}

class Ruhani extends Father1
{
    void r1(){
        System.out.println("ruhani");
    }
}
