package edu.slsu.it205.lab11.persistence;

import edu.slsu.it205.lab11.domain.Book;
import edu.slsu.it205.lab11.domain.BookRepository;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class InMemoryBookRepository implements BookRepository {

    private final Map<String, Book> books = new LinkedHashMap<>();

    @Override
    public void add(Book book) {
        books.put(book.getId(), book);
    }

    @Override
    public List<Book> findAll() {
        return new ArrayList<>(books.values());
    }
}