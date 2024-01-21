package assignment1.operators;

public class BreakTest {
    public static void main(String[] args) {
        System.out.println("Prime numbers from 1 to 100:");

        for (int i = 2; i <= 100; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                // If the number is divisible by any other number, it's not prime
                return false;
            }

            if (i > 2 && i % 2 == 0) {
                break;
            }
        }
        return true;
    }
}