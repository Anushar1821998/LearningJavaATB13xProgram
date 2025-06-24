package Test;

public class Challenge_14_Star {
    public static void main(String[] args) {
        int rows = 5; // Number of rows for the triangle

        for (int i = 1; i <= rows; i++) {
            // Print spaces for alignment
            for (int j = rows - i; j > 0; j--) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            // Move to the next line
            System.out.println();
        }
    }
}
