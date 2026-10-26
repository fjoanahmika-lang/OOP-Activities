package edu.slsu.it205.lab04;

public class Main {

    public static void main(String[] args) {

        // Create three Book objects
        Book b1 = new Book("B001", "Java Programming");
        Book b2 = new Book("B002", "Introduction to Python");
        Book b3 = new Book("B003", "Data Structures");

        // Borrow books
        b1.borrow();
        b2.borrow();

        // Display books
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

        // Return book
        b1.returnBook();

        System.out.println("\nAfter returning B001:");
        System.out.println(b1);

        // Reference example
        System.out.println("\nReference Example:");

        Book a = b3;

        a.title = "Advanced Data Structures";

        System.out.println("a: " + a);
        System.out.println("b3: " + b3);
    }
}