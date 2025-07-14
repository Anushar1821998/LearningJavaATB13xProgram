package ex_16_Arrays;

public class LabArrayCopy {
    public static void main(String[] args) {
        int[] org = {1,2,3};
        System.out.println("Original Array is");
        for (int i = 0; i < org.length; i++) {
            System.out.print(org[i] + " | ");
        }

        System.out.println();

        System.out.println("Array after copying is");
        int[] copy = new int[org.length];

        System.arraycopy(org, 0, copy, 0, org.length);

        for (int i = 0; i < copy.length; i++) {
            System.out.print(copy[i] + " | ");
        }
    }
}
