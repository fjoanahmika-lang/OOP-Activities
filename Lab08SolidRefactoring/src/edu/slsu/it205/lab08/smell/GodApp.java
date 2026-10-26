package edu.slsu.it205.lab08.smell;

import java.util.Scanner;

public class GodApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // UI
        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();

        System.out.print("Enter price: ");
        double price = scanner.nextDouble();

        // RULES
        double total = quantity * price;

        if (quantity <= 0 || price < 0) {
            total = 0;
        }

        if (total >= 1000) {
            total = total * 0.90;
        }

        // OUTPUT
        System.out.println("Total: " + total);

        scanner.close();
    }
}