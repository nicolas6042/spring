package com.domain.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * @author mbaranowicz
 */
public class Forum {

   private final List<ForumUser> forumUserList = new ArrayList<>();

    public Forum() {
        forumUserList.add(new ForumUser(1,"username1", 'M', LocalDate.now().minusYears(15).minusMonths(2).minusDays(3),2));
        forumUserList.add(new ForumUser(2,"username12", 'F', LocalDate.now().minusYears(22).minusMonths(2).minusDays(4),0));
        forumUserList.add(new ForumUser(3,"username13", 'M', LocalDate.now().minusYears(26).minusMonths(2).minusDays(5),10));
        forumUserList.add(new ForumUser(4,"username3", 'F', LocalDate.now().minusYears(12).minusMonths(2).minusDays(7),2));
        forumUserList.add(new ForumUser(5,"username14", 'M', LocalDate.now().minusYears(33).minusMonths(2).minusDays(5),2));
        forumUserList.add(new ForumUser(6,"username5", 'M', LocalDate.now().minusYears(21).minusMonths(2).minusDays(8),0));
        forumUserList.add(new ForumUser(7,"username6", 'M', LocalDate.now().minusYears(19).minusMonths(2).minusDays(7),0));
        forumUserList.add(new ForumUser(8,"username7", 'F', LocalDate.now().minusYears(13).minusMonths(2).minusDays(9),4));
        forumUserList.add(new ForumUser(9,"username8", 'F', LocalDate.now().minusYears(20).minusMonths(2).minusDays(22),5));
        forumUserList.add(new ForumUser(10,"username9", 'M', LocalDate.now().minusYears(33).minusMonths(2).minusDays(4),0));
    }

    public List<ForumUser> getForumUserList() {
        return new ArrayList<>(forumUserList);
    }
}
