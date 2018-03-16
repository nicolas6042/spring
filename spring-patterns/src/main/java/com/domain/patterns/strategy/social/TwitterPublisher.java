package com.domain.patterns.strategy.social;

/**
 * @author mbaranowicz
 */
public class TwitterPublisher implements SocialPublisher {
    @Override
    public String share() {
        return "TWITTER";
    }
}
