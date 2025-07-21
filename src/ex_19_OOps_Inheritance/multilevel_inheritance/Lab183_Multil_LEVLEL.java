package ex_19_OOps_Inheritance.multilevel_inheritance;

public class Lab183_Multil_LEVLEL {
    public static void main(String[] args) {
        son Amit = new son();
        //son s1 = new Father();
        //son s2 = new Grandfather();

        Grandfather g1 = new son(); //Dynamic dispatch
        g1.gf();
        g1.home();

        Grandfather g2 = new Father();
        g2.gf();
        g2.home();

        Father s1 = new son();
        s1.f();
        s1.gf();
        s1.home();


    }
}
