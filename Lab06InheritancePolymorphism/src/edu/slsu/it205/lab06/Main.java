package edu.slsu.it205.lab06;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<LibraryItem> items = new ArrayList<>();

        items.add(new Book("B001", "Java Programming"));
        items.add(new DigitalResource("D001", "PDF"));

        for (LibraryItem item : items) {
            item.displaySummary();
        }
    }
}