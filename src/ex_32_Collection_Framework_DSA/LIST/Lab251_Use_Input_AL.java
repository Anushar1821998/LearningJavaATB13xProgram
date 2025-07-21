package ex_32_Collection_Framework_DSA.LIST;

import java.util.*;

public class Lab251_Use_Input_AL {
    public static void main(String[] args) {

        List<String> l = new ArrayList<>();

        System.out.println("Enter the elements for ArrayList");
        Scanner scanner = new Scanner(System.in);

        String response = "Y";

        while (response.equals("Y"))
        {
            String input = scanner.next();
            l.add(input);


            scanner.nextLine();
            System.out.println("Do you wish to enter the next element? Please respond in Y:Yes or N: No");
            response = scanner.next();

        }

        for(Object o : l)
        {
            System.out.println(l);
        }
scanner.close();

    }
}
