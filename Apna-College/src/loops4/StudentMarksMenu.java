package loops4;

import java.util.Scanner;

public class StudentMarksMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.print("Enter 1 to input marks, 0 to stop: ");
            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter student's marks (out of 100): ");
                int marks = scanner.nextInt();

                if (marks >= 90 && marks <= 100) {
                    System.out.println("This is Good");
                } else if (marks >= 60 && marks <= 89) {
                    System.out.println("This is also Good");
                } else if (marks >= 0 && marks <= 59) {
                    System.out.println("This is Good as well");
                } else {
                    System.out.println("Invalid marks entered. Please enter marks between 0 and 100.");
                }
                System.out.println("Because marks don’t matter but our effort does.\n");
            }
        } while (choice != 0);

        System.out.println("Program exited.");
        scanner.close();
    }
}
