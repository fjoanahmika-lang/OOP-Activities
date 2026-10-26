package edu.slsu.it205.lab07;

public class InvalidBookException extends RuntimeException {

    public InvalidBookException(String message) {
        super(message);
    }
}