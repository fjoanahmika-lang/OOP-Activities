package edu.slsu.it205.lab08.refactored;

public class DomainService {

    public double calculateTotal(DomainModel model) {

        int quantity = model.getQuantity();
        double price = model.getPrice();

        if (quantity <= 0 || price < 0) {
            return 0;
        }

        double total = quantity * price;

        if (total >= 1000) {
            total = total * 0.90;
        }

        return total;
    }
}