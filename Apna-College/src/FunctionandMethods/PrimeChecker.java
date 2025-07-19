package FunctionandMethods;
import java.util.Scanner;

public class PrimeChecker {

    // Function to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to check if it is prime: ");
        int number = scanner.nextInt();

        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        scanner.close();
    }
}
/*Prime numbers have exactly two divisors: 1 and the number itself.

Logic: Check if the number has any divisors besides 1 and itself, up to its square root.

Return true if it has no such divisors; otherwise, return false.*/