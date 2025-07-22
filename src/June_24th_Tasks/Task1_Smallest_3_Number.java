package June_24th_Tasks;

public class Task1_Smallest_3_Number {
    public static void main(String[] args) {
        int a = 100;
        int b = 200;
        int c = 300;

        String result = (a>b) ? (a>c) ? a+ "is the large number" : c + "is the large number" : (b>c) ? b + "is the larger number" : c + "is the large number";

        System.out.println(result);
    }
}
