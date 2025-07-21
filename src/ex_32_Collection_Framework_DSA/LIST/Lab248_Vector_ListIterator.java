package ex_32_Collection_Framework_DSA.LIST;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Lab248_Vector_ListIterator {
    public static void main(String[] args) {
        Vector<String> v1 = new Vector<>();

        v1.add("Item1");
        v1.add("Item2");
        v1.add("Item3");
        v1.add("Item4");
        v1.add("Item5");

        ListIterator i = v1.listIterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }

        System.out.println("--------------------");

        //to get the elements in reverse order
        while(i.hasPrevious())
        {
            System.out.println(i.previous());
        }

        System.out.println("--------------------");

        Iterator i1 = v1.iterator();
        while(i1.hasNext())
        {
            System.out.println(i1.next());
        }



    }
}
