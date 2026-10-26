package edu.slsu.it205.lab05;

public class Main {

    public static void main(String[] args) {

        Book book1 = new Book("B001", "Java Programming");

        System.out.println("Book ID: " + book1.getId());
        System.out.println("Title: " + book1.getTitle());
        System.out.println("Status: " + book1.getStatus());

        book1.borrow();

        System.out.println("\nAfter borrowing:");
        System.out.println("Status: " + book1.getStatus());

        book1.returnBook();

        System.out.println("\nAfter returning:");
        System.out.println("Status: " + book1.getStatus());

        try {
            Book invalidBook = new Book("", "Invalid Book");
        } catch (IllegalArgumentException e) {
            System.out.println("\nError: " + e.getMessage());
        }

        try {
            Book invalidBook2 = new Book("B002", "");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}