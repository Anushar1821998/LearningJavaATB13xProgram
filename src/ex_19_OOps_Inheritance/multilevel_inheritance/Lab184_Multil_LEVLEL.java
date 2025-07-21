package ex_19_OOps_Inheritance.multilevel_inheritance;

import org.w3c.dom.ls.LSOutput;

public class Lab184_Multil_LEVLEL {
    public static void main(String[] args) {
        // son s1 = new Father();
        //  son s2 = new Grandfather();

        son amit = new son();
        System.out.println(amit.gold_gf);
        amit.gf();
        amit.f();
        int gold = amit.gold_s;
        amit.home();


        //Dynamic dispatch
        Grandfather gf1 = new son();
        gf1.home();

       // WebDriver driver = new ChromeDriver;

    }


    }

