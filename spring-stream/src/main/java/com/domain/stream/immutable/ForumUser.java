package com.domain.stream.immutable;

public class ForumUser {
    private final String username;
    private final String realName;

    public ForumUser(String username, String realName) {
        this.username = username;
        this.realName = realName;

    }

    public String getRealName() {
        return realName;
    }

    public String getUsername() {

        return username;
    }

}
