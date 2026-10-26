package edu.slsu.it205.lab12;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void createsBook_withValidId() {
        // Arrange
        Book book = new Book("B-1", "Object-Oriented Programming");

        // Act
        String id = book.getId();

        // Assert
        assertEquals("B-1", id);
    }

    @Test
    void createsBook_withValidTitle() {
        // Arrange
        Book book = new Book("B-2", "Java Programming");

        // Act
        String title = book.getTitle();

        // Assert
        assertEquals("Java Programming", title);
    }

    @Test
    void createsBook_withValidIdAndTitle() {
        // Arrange
        Book book = new Book("B-3", "Python Basics");

        // Act
        String label = book.getId() + " - " + book.getTitle();

        // Assert
        assertEquals("B-3 - Python Basics", label);
    }

    @Test
    void createsBook_withEmptyId_throwsException() {
        // Arrange, Act, Assert
        assertThrows(
                IllegalArgumentException.class,
                () -> new Book("", "Java Programming")
        );
    }

    @Test
    void createsBook_withEmptyTitle_throwsException() {
        // Arrange, Act, Assert
        assertThrows(
                IllegalArgumentException.class,
                () -> new Book("B-4", "")
        );
    }
}