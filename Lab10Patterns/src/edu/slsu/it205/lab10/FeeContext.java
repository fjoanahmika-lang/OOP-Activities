package edu.slsu.it205.lab10;

public class FeeContext {

    private FeeStrategy strategy;

    public FeeContext(FeeStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(FeeStrategy strategy) {
        this.strategy = strategy;
    }

    public double calculate(double amount) {
        return strategy.calculateFee(amount);
    }
}