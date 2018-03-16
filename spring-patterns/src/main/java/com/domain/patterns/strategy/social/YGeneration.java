package com.domain.patterns.strategy.social;

/**
 * @author mbaranowicz
 */
public class YGeneration extends User {
    public YGeneration(String username) {
        super(username);
        this.socialPublisher = new FacebookPublisher();
    }
}
