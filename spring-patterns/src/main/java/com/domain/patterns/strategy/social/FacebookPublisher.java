package com.domain.patterns.strategy.social;

/**
 * @author mbaranowicz
 */
public class FacebookPublisher implements SocialPublisher {
    @Override
    public String share() {
        return "FACEBOOK";
    }
}
