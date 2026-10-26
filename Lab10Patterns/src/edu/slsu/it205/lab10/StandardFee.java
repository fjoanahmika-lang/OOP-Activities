package edu.slsu.it205.lab10;

public class StandardFee implements FeeStrategy {

    @Override
    public double calculateFee(double amount) {
        return amount;
    }
}