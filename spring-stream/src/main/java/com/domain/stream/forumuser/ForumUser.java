package com.domain.stream.forumuser;

import java.time.LocalDate;

/**
 * @author mbaranowicz
 */
public final class ForumUser {

    private final Integer id;
    private final String username;
    private final char gender;
    private final LocalDate birthday;
    private final int postsCount;

    public ForumUser(Integer id, String username, char gender, LocalDate birthday, int postsCount) {
        this.id = id;
        this.username = username;
        this.gender = gender;
        this.birthday = birthday;
        this.postsCount = postsCount;
    }

    public Integer getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public char getGender() {
        return gender;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public int getPostsCount() {
        return postsCount;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", gender=" + gender +
                ", birthday=" + birthday +
                ", postsCount=" + postsCount +
                '}';
    }
}
