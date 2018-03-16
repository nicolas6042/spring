package com.domain.spiringfirst.forum;

import org.springframework.stereotype.Component;

/**
 * @author mbaranowicz
 */
@Component
public class ForumUser {

   private final String username;

    public ForumUser() {
        this.username ="John Smith";
    }

    public String getUsername() {
        return username;
    }
}
