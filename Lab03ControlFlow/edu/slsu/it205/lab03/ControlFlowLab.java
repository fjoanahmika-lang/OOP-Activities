package edu.slsu.it205.lab03;

import java.util.Scanner;

public class ControlFlowLab {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n===== CONTROL FLOW MENU =====");
            System.out.println("1. Grade Classifier");
            System.out.println("2. Counter Loop");
            System.out.println("3. Input Retry");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            if (input.hasNextInt()) {
                choice = input.nextInt();

                switch (choice) {

                    case 1:
                        gradeClassifier(input);
                        break;

                    case 2:
                        counterLoop(input);
                        break;

                    case 3:
                        inputRetry();
                        break;

                    case 0:
                        System.out.println("Program terminated.");
                        break;

                    default:
                        System.out.println("Invalid choice. Please try again.");
                }

            } else {
                System.out.println("Invalid input. Please enter a number.");
                input.next();
                choice = -1;
            }

        } while (choice != 0);

        input.close();
    }

    // Problem A - Grade Classifier
    public static void gradeClassifier(Scanner input) {

        System.out.print("Enter score (0-100): ");
        int score = input.nextInt();

        if (score < 0 || score > 100) {
            System.out.println("Invalid score. Score must be from 0 to 100.");
        } else if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else if (score >= 75) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }
    }

    // Problem B - Counter Loop
    public static void counterLoop(Scanner input) {

        System.out.print("Enter n: ");
        int n = input.nextInt();

        if (n < 1) {
            System.out.println("Invalid input. n must be at least 1.");
            return;
        }

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("Sum from 1 to " + n + " = " + sum);
    }

    // Problem C - Input Retry
    public static void inputRetry() {

        System.out.println("This option demonstrates input validation.");
        System.out.println("Invalid menu choices will return to the menu.");
    }
}