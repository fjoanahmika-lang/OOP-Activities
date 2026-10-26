package edu.slsu.it205.lab05;

public class Book {

    private final String id;
    private String title;
    private String status;

    public Book(String id, String title) {

        if (id == null || id.isBlank()) {
            throw new IllegalArgumentException("id required");
        }

        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("title required");
        }

        this.id = id;
        this.title = title;
        this.status = "AVAILABLE";
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getStatus() {
        return status;
    }

    public void borrow() {
        if (!status.equals("AVAILABLE")) {
            throw new IllegalStateException("Book is not available");
        }

        status = "BORROWED";
    }

    public void returnBook() {
        if (!status.equals("BORROWED")) {
            throw new IllegalStateException("Book is not currently borrowed");
        }

        status = "AVAILABLE";
    }
}