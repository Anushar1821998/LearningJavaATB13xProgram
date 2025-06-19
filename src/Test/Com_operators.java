package Test;

public class Com_operators {
    public static void main(String[] args) {
        /*10 5
    Output:
    a == b: false a > b: true a < b: false (a > b) && (a > 0): true (a < b) || (a > 0): true !(a > b): false*/

        int a = 10;
        int b =5;

        String r1 = (a==b) ? "true" : "false";
        String r2 = (a>b) ? "true" : "false";
        String r3 = (a<b) ? "false" : "true";
        String r4 = ((a > b) && (a > 0)) ? "true" : "false";
        String r5 = ((a < b) || (a > 0)) ? "true" : "false";
        String r6 = (!(a > b)) ? "false" : "true";

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);
        System.out.println(r6);

    }
    }
}
