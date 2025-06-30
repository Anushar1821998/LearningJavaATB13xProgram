package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab144_StringBuilder_Vs_Buffer {
    public static void main(String[] args) {
         String name = "Anusha";
         String name1 = new String("Deepak");

         StringBuffer name2 = new StringBuffer("Anu");
         StringBuilder name3 = new StringBuilder("Deepu");

         String out = name.toUpperCase();
         StringBuilder out2 = name3.append("sha");

        System.out.println(out);
        System.out.println(out2);

        System.out.println(name);
        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);

    }
}
