package ex_19_OOps_Inheritance.single_inheritance;

public class Lab181_real_si {
    public static void main(String[] args) {
    TestCase1 t1 = new TestCase1();
        t1.runningTC1();

        TestCase2 t2 = new TestCase2();
        t2.runningTC2();

        CommonToAll c1 = new CommonToAll();
        CommonToAll t3 = new TestCase1(); //Dynamic dispatch
        CommonToAll t4 =  new TestCase2();
        //TestCase2 t5 = new CommonToAll(); //not possible;

        // Webdriver driver = new ChromeDriver();
    }
}
