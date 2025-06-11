package ex_02_Java_Basics;

public class LabExample1 {

    //int a;
    //static int s;

    public static void main(String[] args) {
        int a = 23;
        {
            int b = 56;
            System.out.println(b);
        }
        int b = 45;
        System.out.println(a);
        System.out.println(b);
    }


}
