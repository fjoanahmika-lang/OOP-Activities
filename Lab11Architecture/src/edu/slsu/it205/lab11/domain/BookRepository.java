package edu.slsu.it205.lab11.domain;

import java.util.List;

public interface BookRepository {
    void add(Book book);

    List<Book> findAll();
}