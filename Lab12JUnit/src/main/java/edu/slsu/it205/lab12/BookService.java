package edu.slsu.it205.lab12;

public class BookService {

    public String getBookLabel(Book book) {
        return book.getId() + " - " + book.getTitle();
    }

    public boolean isAvailable(boolean available) {
        return available;
    }

    public int calculateLateFee(int daysLate, int feePerDay) {
        if (daysLate < 0 || feePerDay < 0) {
            throw new IllegalArgumentException(
                    "Days late and fee per day cannot be negative."
            );
        }

        return daysLate * feePerDay;
    }
}