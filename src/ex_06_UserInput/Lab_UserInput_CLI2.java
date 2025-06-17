package ex_06_UserInput;

public class Lab_UserInput_CLI2 {
 //if no values are passed, then we get 'ArrayIndexOutOfBoundsException'
    public static void main(String[] args) {
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);
        System.out.println(args[3]);
        //System.out.println(args[90]); //ArrayIndexOutOfBoundsException
    }
}
