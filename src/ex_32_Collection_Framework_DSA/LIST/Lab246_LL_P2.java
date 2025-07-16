package ex_32_Collection_Framework_DSA.LIST;

import java.util.*;

public class Lab246_LL_P2 {
    public static void main(String[] args) {
        List mylist = new ArrayList(5);
        List mylist0 =  new ArrayList();

        List mylist2 = new LinkedList();

        mylist2.add("Pramod");
        mylist2.add("Dutta");
        mylist2.add("Amit");
        mylist2.add("meenu");
        mylist2.add("ritwik");
        mylist2.add("ritwik");
        mylist2.add(null);
        mylist2.add(true);
        mylist2.add(123);

        System.out.println(mylist2);

        System.out.println(mylist2.size());
        System.out.println(mylist2.contains("Dutta"));
        System.out.println(mylist2.get(3));
        System.out.println(mylist2.isEmpty());
        System.out.println(mylist2.indexOf(123));

        System.out.println("--------------------");

        Iterator i = mylist2.iterator();
            while(i.hasNext())
            {
                System.out.println(i.next());
            }



    }
}
