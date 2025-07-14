package ex_16_Arrays;

public class Star_pattern {
 /*        *
          ***
         *****
        *******
       ********* */

        public static void main(String[] args) {
            int rows = 5; // Number of rows for the triangle

            for (int i = 1; i <= rows; i++) {
                // Print leading spaces
                for (int space = 1; space <= rows - i; space++) {
                    System.out.print(" ");
                }

                // Print stars (2*i - 1 stars in each row)
                for (int star = 1; star <= 2 * i - 1; star++) {
                    System.out.print("*");
                }

                // Move to the next line
                System.out.println();
            }
        }
    }