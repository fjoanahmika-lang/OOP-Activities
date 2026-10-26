package edu.slsu.it205.lab04;

public class Book {

    String id;
    String title;
    String status;

    public Book(String id, String title) {
        this.id = id;
        this.title = title;
        this.status = "AVAILABLE";

    }

    public void borrow() {
        if (status.equals("AVAILABLE")) {
            status = "BARROWED" ;
        }
    }

    public void returnBook() {
        status = "AVAILABLE";
    }

    public String toString() {
        return "Book ID: " + id +
                ", Title: " + title +
                ", Status: " + status;
    }

}
