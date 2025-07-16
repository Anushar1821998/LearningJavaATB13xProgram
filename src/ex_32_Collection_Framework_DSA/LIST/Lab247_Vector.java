package ex_32_Collection_Framework_DSA.LIST;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Lab247_Vector {
    public static void main(String[] args) {
        Vector v = new Vector();
        Vector v1 = new Vector(10);

        v.add("Ansha");
        v.add("Anusha");
        v.add("Anu");

        System.out.println("Using for loop");
        for (int i = 0; i < v.size(); i++) {
            System.out.println(v.get(i));
        }

        System.out.println("Using for each loop");
        for(Object i : v)
        {
            System.out.println(i);
        }

        System.out.println("Using Iterator");
        Iterator i = v.iterator();

        while(i.hasNext())
        {
            System.out.println(i.next());
        }

        System.out.println(" ----  Enumeration ");

        Enumeration e =  v.elements();
        while (e.hasMoreElements())
        {
            System.out.println(e.nextElement());


        }

    }
}
