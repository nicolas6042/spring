package com.domain.patterns.strategy;

import com.domain.patterns.strategy.predictors.AggresivePredictor;

/**
 * @author mbaranowicz
 */
public class IndividualYoungCustomer extends Customer {
    public IndividualYoungCustomer(String name) {
        super(name);
        this.buyPredictor = new AggresivePredictor();
    }
}
