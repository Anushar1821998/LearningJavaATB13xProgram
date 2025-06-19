package Test;

public class Challenge_5_ExpImp {
    public static void main(String[] args) {
    //Write a program that demonstrates operator precedence and type casting in Java.
        // **Requirements:** - Show operator precedence with complex expressions -
        // Demonstrate implicit and explicit type casting - Print results with explanations

        //implicit type casting int to double
        int a = 300;
        double d =  a;
        System.out.println("integer value is:" + a);
        System.out.println("Double value is:" + d);

        //Explicit type casting from long to integer
        long numb = 9836546635l;
        int num = (int)numb;
        System.out.println("Float value of phone number is:" + numb);
        System.out.println("casted value of number from float to int is:" + num);

     }
}
