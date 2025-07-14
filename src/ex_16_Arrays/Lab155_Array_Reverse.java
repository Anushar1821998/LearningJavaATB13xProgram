package ex_16_Arrays;

import java.util.Scanner;

public class Lab155_Array_Reverse {
    public static void main(String[] args) {
        int[] array_org = {1,2,3,4,5};

        for (int i = array_org.length-1; i >=0; i--) {
            System.out.println(array_org[i]);
        }

    }
}
