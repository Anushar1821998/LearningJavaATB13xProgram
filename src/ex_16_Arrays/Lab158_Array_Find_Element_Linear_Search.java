package ex_16_Arrays;

public class Lab158_Array_Find_Element_Linear_Search {
    public static void main(String[] args) {
        int[] arr_num = {12, 5, 67, 45, 90};

        int find = 45;
        boolean found = false;

        for (int i = 0; i < arr_num.length; i++) {
            if (arr_num[i] == find) {
                found = true;
                break;
            }

        }

        if(found)
        {
            System.out.println("Element is found");
        }
        else
        {
            System.out.println("Element is not found");
        }
    }
}
