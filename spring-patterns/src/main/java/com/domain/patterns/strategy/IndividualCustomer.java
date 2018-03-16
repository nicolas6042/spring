package com.domain.patterns.strategy;

import com.domain.patterns.strategy.predictors.ConservativePredictor;

/**
 * @author mbaranowicz
 */
public class IndividualCustomer extends Customer {
    public IndividualCustomer(String name) {
        super(name);
        this.buyPredictor=new ConservativePredictor();
    }
}
