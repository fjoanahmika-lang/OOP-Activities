package edu.slsu.it205.lab06;

public class Book extends LibraryItem {

    private final String title;

    // Composition: Book has-a TimestampService
    private final TimestampService timestampService;

    public Book(String id, String title) {
        super(id);
        this.title = title;
        this.timestampService = new TimestampService();
    }

    @Override
    public void displaySummary() {
        System.out.println(
            "Book: " + title +
            " | ID: " + id +
            " | Added: " + timestampService.getTimestamp()
        );
    }
}