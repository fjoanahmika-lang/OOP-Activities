package edu.slsu.it205.lab07;

public class Main {

    public static void main(String[] args) {

        BookService service = new BookService();

        try {
            String title = service.findBook("B001");
            System.out.println("Book found: " + title);

        } catch (InvalidBookException e) {
            System.out.println("Book error: " + e.getMessage());
        }

        try {
            String title = service.findBook("B999");
            System.out.println("Book found: " + title);

        } catch (InvalidBookException e) {
            System.out.println("Book error: " + e.getMessage());
        }

        try {
            String title = service.findBook("");
            System.out.println("Book found: " + title);

        } catch (InvalidBookException e) {
            System.out.println("Book error: " + e.getMessage());
        }
    }
}