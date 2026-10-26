package edu.slsu.it205.lab10;

public class LibrarianObserver implements Observer {

    @Override
    public void update(String status) {
        System.out.println("Librarian notification: New status is " + status);
    }
}