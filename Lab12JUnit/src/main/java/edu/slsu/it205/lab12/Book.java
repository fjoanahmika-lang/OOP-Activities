package edu.slsu.it205.lab12;

public class Book {

    private final String id;
    private final String title;

    public Book(String id, String title) {

        if (id == null || id.isBlank()) {
            throw new IllegalArgumentException("Book ID cannot be empty.");
        }

        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("Book title cannot be empty.");
        }

        this.id = id;
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }
}