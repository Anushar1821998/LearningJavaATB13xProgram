package ex_05_Type_Casting;

public class Lab060_TypeCasting {
    public static void main(String[] args) {
        long phone = 9876543210l;

        //short s = phone; //implicit narrowing not allowed
        short s = (short) phone; // explicit narrowing must be done

        System.out.println(s);
    }
}
