package Test;

public class Test_ID {
    public static void main(String[] args) {
        /*5
Output:
Original: 5
Pre-increment: 6
Post-increment: 6 (returned 6)
Pre-decrement: 5
Post-decrement: 5
(returned 5)*/

        int i =5;

        System.out.println("Original:" + i);
        System.out.println("Pre-increment:" + ++i);
        System.out.println("Pre-increment:" + i++);

        int j =5;
        System.out.println("Pre-decrement:" + --j);
        System.out.println("Post-decrement:" + j--);


    }
}
