package ex_16_Arrays;

public class Lab153_Arrays_Max_Min {
    public static void main(String[] args) {
        int[] array = {25, 24, 56, 15, 36, 56, 77, 18, 29, 49};

        int max_output = give_me_max(array);
        System.out.println(max_output);

        int min_output = give_me_min(array);
        System.out.println(min_output);

    }

    static int give_me_max(int[] array)
    {
        int max = array[0];
        //logic

        for (int i = 0; i < array.length; i++) {

            if(array[i]>max)
            {
                max=array[i];
            }
        }

        return max;
    }

    static int give_me_min(int[] array)
    {
        int min = array[0];
        for (int j = 0; j < array.length; j++) {
            if(array[j]<min)
            {
                min=array[j];
            }
        }


        return min;
    }
}
