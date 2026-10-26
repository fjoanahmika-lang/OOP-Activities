package edu.slsu.it205.lab11.service;

import edu.slsu.it205.lab11.domain.Book;
import edu.slsu.it205.lab11.domain.BookRepository;

import java.util.List;

public class BookService {

    private final BookRepository repository;

    public BookService(BookRepository repository) {
        this.repository = repository;
    }

    public void addBook(String id, String title, String author) {
        if (id == null || id.isBlank()) {
            throw new IllegalArgumentException("Book ID cannot be empty.");
        }

        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("Book title cannot be empty.");
        }

        if (author == null || author.isBlank()) {
            throw new IllegalArgumentException("Book author cannot be empty.");
        }

        repository.add(new Book(id, title, author));
    }

    public List<Book> listBooks() {
        return repository.findAll();
    }
}