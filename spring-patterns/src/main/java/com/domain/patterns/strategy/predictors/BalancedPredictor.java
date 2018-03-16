package com.domain.patterns.strategy.predictors;

import com.domain.patterns.strategy.BuyPredictor;

/**
 * @author mbaranowicz
 */
public class BalancedPredictor implements BuyPredictor {
    @Override
    public String predictWhatToBuy() {
        return "[Balanced Predictor] Buy shared unit of Fund XYZ";
    }
}
