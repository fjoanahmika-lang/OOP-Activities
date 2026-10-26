package edu.slsu.it205.lab06;

public abstract class LibraryItem {

    protected final String id;

    public LibraryItem(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public abstract void displaySummary();
}