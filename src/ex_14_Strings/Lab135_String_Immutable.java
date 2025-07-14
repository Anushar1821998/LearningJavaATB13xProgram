package ex_14_Strings;

public class Lab135_String_Immutable {
    public static void main(String[] args) {
        String name = "Pramod"; // SCP
        String name2 = "Anusha"
;//        name.toUpperCase();
        name = name.toUpperCase(); // PRAMOD
        System.out.println(name);

      int t = name.compareTo(name2);
        System.out.println(t);


    }
}
