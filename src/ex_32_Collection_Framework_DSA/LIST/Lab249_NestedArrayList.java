package ex_32_Collection_Framework_DSA.LIST;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lab249_NestedArrayList {
    public static void main(String[] args) {
        ArrayList Animals = new ArrayList();
        Animals.add("Lion");
        Animals.addFirst("Cheetah");
        Animals.addLast("Elephant");
        Animals.add("Tiger");

        ArrayList Birds = new ArrayList();
        Birds.add("Parrot");
        Birds.add("Koel");
        Birds.add("Peacock");
        Birds.addFirst("King Fisher");

        List vegatables = new ArrayList();
        vegatables.add("tamato");
        vegatables.add("patato");
        vegatables.add("onion");


        List all_list =  new ArrayList();

        all_list.add(Animals);
        all_list.add(Birds);
        all_list.add(vegatables);

        System.out.println(all_list);
        System.out.println(all_list.get(1));
        System.out.println(Arrays.toString(all_list.toArray()));



    }
}
