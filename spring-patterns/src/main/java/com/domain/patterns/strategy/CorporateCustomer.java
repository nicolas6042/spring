package com.domain.patterns.strategy;

import com.domain.patterns.strategy.predictors.BalancedPredictor;

/**
 * @author mbaranowicz
 */
public class CorporateCustomer extends Customer {

    public CorporateCustomer(String name) {
        super(name);
        this.buyPredictor = new BalancedPredictor();
    }
}
