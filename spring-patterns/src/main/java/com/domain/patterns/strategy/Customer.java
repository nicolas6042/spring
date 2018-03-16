package com.domain.patterns.strategy;

/**
 * @author mbaranowicz
 */
public class Customer {

    private final String name;
    protected BuyPredictor buyPredictor;

    public String getName() {
        return name;
    }

    public Customer(String name) {
        this.name = name;
    }

    public String predict() {
        return buyPredictor.predictWhatToBuy();
    }

    public void setBuyingStrategy(BuyPredictor buyPredictor) {
        this.buyPredictor = buyPredictor;
    }
}
