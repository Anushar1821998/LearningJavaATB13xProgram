package Test;

public class Challenge_5_ExpImp {
    public static void main(String[] args) {
        //Input:         10 3.5
        //Output:         Expression result: 23 Implicit casting: 13.5 Explicit casting: 13
        int a = 10;
        float d =  3.5f;
        System.out.println("integer value is:" + a);
        System.out.println("float value is:" + d);

        //Explicit type casting from float to integer

        int result = a+(int)d;
        System.out.println("Result of explicit casting for addition is" + " " + result);

        //implicit casting

        float sum = a + d;
        System.out.println("Result of implicit casting for addition is" + " " + sum);

     }
}
