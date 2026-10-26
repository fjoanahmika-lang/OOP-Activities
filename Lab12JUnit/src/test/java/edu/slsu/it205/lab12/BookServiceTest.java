package edu.slsu.it205.lab12;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookServiceTest {

    @Test
    void getBookLabel_returnsCorrectLabel() {
        // Arrange
        BookService service = new BookService();
        Book book = new Book("B-1", "Java Programming");

        // Act
        String label = service.getBookLabel(book);

        // Assert
        assertEquals("B-1 - Java Programming", label);
    }

    @Test
    void isAvailable_returnsTrueWhenAvailable() {
        // Arrange
        BookService service = new BookService();

        // Act
        boolean result = service.isAvailable(true);

        // Assert
        assertTrue(result);
    }

    @Test
    void isAvailable_returnsFalseWhenNotAvailable() {
        // Arrange
        BookService service = new BookService();

        // Act
        boolean result = service.isAvailable(false);

        // Assert
        assertFalse(result);
    }

    @Test
    void calculateLateFee_returnsCorrectFee() {
        // Arrange
        BookService service = new BookService();

        // Act
        int fee = service.calculateLateFee(5, 10);

        // Assert
        assertEquals(50, fee);
    }

    @Test
    void calculateLateFee_withNegativeDays_throwsException() {
        // Arrange
        BookService service = new BookService();

        // Act & Assert
        assertThrows(
                IllegalArgumentException.class,
                () -> service.calculateLateFee(-1, 10)
        );
    }
}