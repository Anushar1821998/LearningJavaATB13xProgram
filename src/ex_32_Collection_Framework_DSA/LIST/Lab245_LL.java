package ex_32_Collection_Framework_DSA.LIST;

import java.util.*;

public class Lab245_LL {
    public static void main(String[] args) {

        LinkedList<String> animals = new LinkedList();
        animals.add("Dog");
        animals.add("Cat");
        animals.addFirst("Lion");
        animals.addLast("Elephant");
        animals.addLast("Elephant");
        System.out.println(animals);

        // Accessing elements
        System.out.println(animals.getFirst());
        System.out.println(animals.getLast());

        //Removing the elements
        System.out.println("After removing first element");
        System.out.println(animals.removeFirst());
        System.out.println(animals);

        System.out.println(animals.removeLast());
        System.out.println(animals);

        System.out.println(animals.remove(0));
        System.out.println(animals);

        System.out.println(animals.size());
    }
}
