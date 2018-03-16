package com.domain.patterns.strategy.social;

/**
 * @author mbaranowicz
 */
public class SnapchatPublisher implements SocialPublisher {
    @Override
    public String share() {
        return "SNAPCHAT";
    }
}
