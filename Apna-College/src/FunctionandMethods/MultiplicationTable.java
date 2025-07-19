package FunctionandMethods;

import java.util.Scanner;

public class MultiplicationTable {

    // Function to print the multiplication table of n
    public static void printTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        printTable(number);  // Call the function to print the table

        scanner.close();
    }
}

