package ex_32_Collection_Framework_DSA.LIST;

import java.util.*;

public class Lab242_ArrayList {
    public static void main(String[] args) {

        ArrayList a = new ArrayList<>();

        a.add("Pramoda");
        a.add(null);
        a.add("Dutta");
        a.add("Dutta"); // duplicate is allowed
        a.add(123); // different data types are stored
        System.out.println(a);
        System.out.println(a.size());

        List l = new ArrayList(); //Dynamic dispatch
        l.add(123);
        l.add(768);
        System.out.println(l.size());
        System.out.println(l.isEmpty());
        System.out.println(l.contains(123));
        System.out.println(l.toArray());


    }
}
