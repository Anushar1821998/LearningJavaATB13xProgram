package Test;

public class Challenge_13_Tables {
    public static void main(String[] args) {
        // Outer loop for numbers 1 to 5
        for (int i = 1; i <= 5; i++) {
            System.out.println("Multiplication Table for " + i + ":");

            // Inner loop for multiplying with numbers 1 to 10
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }

            System.out.println(); // Blank line for better readability
        }
    }
}

