package edu.slsu.it205.lab08.refactored;

import java.util.Scanner;

public class ConsoleUI {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();

        System.out.print("Enter price: ");
        double price = scanner.nextDouble();

        DomainModel model = new DomainModel(quantity, price);

        DomainService service = new DomainService();

        double total = service.calculateTotal(model);

        System.out.println("Total: " + total);

        scanner.close();
    }
}