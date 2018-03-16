package com.domain.patterns.strategy.social;

/**
 * @author mbaranowicz
 */
public class User {

    private final String username;
    protected SocialPublisher socialPublisher;

    public User(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public String sharePost(){
        return socialPublisher.share();

    }
    public void setSharePost(SocialPublisher socialPublisher){
        this.socialPublisher = socialPublisher;
    }
}
