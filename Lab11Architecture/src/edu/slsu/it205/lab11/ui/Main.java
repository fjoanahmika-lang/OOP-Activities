package edu.slsu.it205.lab11.ui;

import edu.slsu.it205.lab11.domain.Book;
import edu.slsu.it205.lab11.persistence.InMemoryBookRepository;
import edu.slsu.it205.lab11.service.BookService;

public class Main {

    public static void main(String[] args) {

        InMemoryBookRepository repository =
                new InMemoryBookRepository();

        BookService service =
                new BookService(repository);

        service.addBook("B001", "Java Programming", "James Gosling");
        service.addBook("B002", "Python Basics", "Guido van Rossum");

        System.out.println("=== Library Books ===");

        for (Book book : service.listBooks()) {
            System.out.println(
                    book.getId() + " | "
                    + book.getTitle() + " | "
                    + book.getAuthor()
            );
        }
    }
}