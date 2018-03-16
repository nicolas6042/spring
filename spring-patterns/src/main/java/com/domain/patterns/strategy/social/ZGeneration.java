package com.domain.patterns.strategy.social;

/**
 * @author mbaranowicz
 */
public class ZGeneration extends User {
    public ZGeneration(String username) {
        super(username);
        this.socialPublisher = new SnapchatPublisher();
    }
}
