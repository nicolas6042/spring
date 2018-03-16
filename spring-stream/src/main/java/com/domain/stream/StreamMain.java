package com.domain.stream;


import com.domain.stream.book.Book;
import com.domain.stream.book.BookDirectory;
import com.domain.stream.forumuser.Forum;
import com.domain.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {

        BookDirectory bookDirectory = new BookDirectory();

       String theResultStringOfBooks = bookDirectory.getList().stream()
               .filter(book -> book.getYearOfPublication() > 2005)
               .map(Book::toString)
               .collect(Collectors.joining(",\n","<<",">>"));

        System.out.println(theResultStringOfBooks);

        Forum forum = new Forum();

        Map<Integer, ForumUser> forumMap = forum.getForumUserList().stream()
                .filter(forumUser -> forumUser.getGender() == 'M' && forumUser.getPostsCount()>=1 && LocalDate.now().getYear() - forumUser.getBirthday().getYear() > 20)
                .collect(Collectors.toMap(ForumUser::getId, forumUser -> forumUser));

        System.out.println("# elements: " + forumMap.size());

        forumMap.entrySet().stream()
                .map(entry-> entry.getKey() + ": " + entry.getValue())
                .forEach(s -> System.out.println(s));
    }
}
