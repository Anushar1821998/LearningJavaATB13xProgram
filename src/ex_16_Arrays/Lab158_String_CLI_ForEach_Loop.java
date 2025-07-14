package ex_16_Arrays;

public class Lab158_String_CLI_ForEach_Loop {
    public static void main(String[] args) {

        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);;
        }

        System.out.println("-----------------");

        for(String j : args)
        {
            System.out.println(j);
        }
    }
}
