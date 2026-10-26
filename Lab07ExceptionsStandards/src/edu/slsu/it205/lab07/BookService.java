package edu.slsu.it205.lab07;

import java.util.HashMap;
import java.util.Map;

public class BookService {

    private final Map<String, String> books = new HashMap<>();

    public BookService() {
        books.put("B001", "Java Programming");
        books.put("B002", "Object-Oriented Programming");
    }

    public String findBook(String id) {

        if (id == null || id.isBlank()) {
            throw new InvalidBookException("Book ID cannot be blank.");
        }

        String title = books.get(id);

        if (title == null) {
            throw new InvalidBookException(
                "Book with ID " + id + " was not found."
            );
        }

        return title;
    }
}