package com.domain.patterns.strategy.social;

/**
 * @author mbaranowicz
 */
public class Millenials extends User {
    public Millenials(String username) {
        super(username);
        this.socialPublisher = new TwitterPublisher();
    }
}
