package com.domain.patterns.strategy.predictors;

import com.domain.patterns.strategy.BuyPredictor;

/**
 * @author mbaranowicz
 */
public class ConservativePredictor implements BuyPredictor {
    @Override
    public String predictWhatToBuy() {
        return "[Conservative predictor] Buy debentures of XYZ";
    }
}
