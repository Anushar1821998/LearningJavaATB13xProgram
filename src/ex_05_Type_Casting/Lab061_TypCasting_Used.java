package ex_05_Type_Casting;

public class Lab061_TypCasting_Used {
    public static void main(String[] args) {
        int course = 100;
        float GST = 18.45f;

       // int total = course+GST; //implicit conversion from float to int cannot be done
       // System.out.println(total);

        int total = course + (int) GST;
        System.out.println(total);

        float total1 = course + (float) GST;// Widening - auto - implicit
        float total3 = (float)course+GST; // Widening  - Explicit
        System.out.println(total1);
        System.out.println(total3);
    }
}
