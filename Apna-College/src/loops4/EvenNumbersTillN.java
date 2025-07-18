package loops4;

import java.util.Scanner;

public class EvenNumbersTillN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        System.out.println("Even numbers till " + n + ":");
        for (int i = 2; i <= n; i += 2) {
            System.out.println(i);
        }

        scanner.close();
    }
}

