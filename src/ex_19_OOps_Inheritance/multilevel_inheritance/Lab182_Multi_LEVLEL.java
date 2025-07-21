package ex_19_OOps_Inheritance.multilevel_inheritance;

public class Lab182_Multi_LEVLEL {
    public static void main(String[] args) {
        Grandfather gf = new Grandfather();
        gf.gf();
        gf.home();
        int gf_Gold = gf.gold_gf;
        System.out.println(gf_Gold);

        Father f1 = new Father();
        //f1.gold_gf;
        f1.f();
        f1.home();
        f1.gf();
        System.out.println(" -- ");

        son s1 = new son();
        s1.s();
        s1.home();
        s1.gf();
        s1.f();


    }
}
