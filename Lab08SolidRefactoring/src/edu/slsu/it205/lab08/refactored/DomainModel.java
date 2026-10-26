package edu.slsu.it205.lab08.refactored;

public class DomainModel {

    private final int quantity;
    private final double price;

    public DomainModel(int quantity, double price) {
        this.quantity = quantity;
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }
}