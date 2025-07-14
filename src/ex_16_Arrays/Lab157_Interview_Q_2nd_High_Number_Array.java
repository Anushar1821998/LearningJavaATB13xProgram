package ex_16_Arrays;

public class Lab157_Interview_Q_2nd_High_Number_Array {
    public static void main(String[] args) {
        int[] num = {23, 45, 56746, 99, 12, 90, 45, 990, 1000};

        int lar = num[0];
        int pos =0;

        for (int i = 1; i < num.length; i++) {
            if(num[i] > lar)
            {
                lar=num[i];
                pos = i;

            }
        }
        System.out.println("Largest number is=" + " " + lar);
        System.out.println("Position index is = " + pos);

        int sec_large = num[0];
        for (int i = 1; i < num.length; i++) {

            {
                if (i!=pos)
                {
                    if(num[i]>sec_large)
                    {
                        sec_large=num[i];
                    }
                }

            }

            }
        System.out.println("Second largest number is: " + sec_large);
    }

}
