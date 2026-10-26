package edu.slsu.it205.lab10;

public class PremiumFee implements FeeStrategy {

    @Override
    public double calculateFee(double amount) {
        return amount * 0.90;
    }
}