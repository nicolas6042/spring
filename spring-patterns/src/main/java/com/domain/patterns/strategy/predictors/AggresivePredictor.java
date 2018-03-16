package com.domain.patterns.strategy.predictors;

import com.domain.patterns.strategy.BuyPredictor;

/**
 * @author mbaranowicz
 */
public class AggresivePredictor implements BuyPredictor {
    @Override
    public String predictWhatToBuy() {
        return "[Aggressive predictor] Buy stock of XYZ";
    }
}
