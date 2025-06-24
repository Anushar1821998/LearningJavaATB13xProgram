package Test;

public class Challenge_15_Prime_Number {
    public static void main(String[] args) {
        int start = 10; // Starting number of the range
        int end = 50;   // Ending number of the range

        System.out.println("Prime numbers between " + start + " and " + end + ":");
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) return false; // 0 and 1 are not prime numbers
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false; // Divisible by other numbers
        }
        return true;
    }
}

