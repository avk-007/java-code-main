package loops4;

import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        if (n <= 1) {
            System.out.println(n + " is not a prime number.");
        } else {
            boolean isPrime = true;
            // Only check up to square root of n for efficiency
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    isPrime = false; // n is divisible by i, so not prime
                    break;
                }
            }
            if (isPrime) {
                System.out.println(n + " is a prime number.");
            } else {
                System.out.println(n + " is not a prime number.");
            }
        }
        scanner.close();
    }
}

