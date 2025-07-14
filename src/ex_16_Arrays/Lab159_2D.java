package ex_16_Arrays;

public class Lab159_2D {
    public static void main(String[] args) {
        // 1,2,3
        // 4,5,6
        // 7,8,9

        int[][] array_2d_old =
                {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                };
        // 10,20
        // 30,40
        // 50,60

        int[][] array = new int[][]
                {
                        {10, 20},
                        {30,40},
                        {50,60}

                };

        int[] [] array1 = new int[3][2];

        array1[0][0] = 1;
        array1[0] [1] = 2;
        array1[3][3] = 6; //// java.lang.ArrayIndexOutOfBoundsException

        System.out.println(array1[0][0]);

    }
}
