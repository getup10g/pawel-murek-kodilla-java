package com.kodilla.stream.forumuser;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
//    zainicjuje strumień Stream przy pomocy metody stream() kolekcji
//    odfiltruje tylko tych użytkowników, którzy są mężczyznami
//    odfiltruje tylko tych użytkowników, którzy mają co najmniej 20 lat
//    odfiltruje tylko tych użytkowników, którzy mają co najmniej jeden opublikowany post
//    przy pomocy kolektora utworzy mapę par, w której rolę klucza będzie pełnił unikalny identyfikator użytkownika
//    wyświetli otrzymaną mapę wynikową

    public static void main (String args[]){
        ForumUser forumUser1=new ForumUser(01,"getup", 'M', LocalDate.of(1975,01,17),10);
        ForumUser forumUser2=new ForumUser(02,"getu", 'M', LocalDate.of(1975,01,17),10);
        ForumUser forumUser3=new ForumUser(03,"gup", 'M', LocalDate.of(1975,01,17),10);
        Forum forum = new Forum();
        forum.addUser(forumUser1);
        forum.addUser(forumUser2);
        forum.addUser(forumUser3);

        LocalDate now = LocalDate.of(2017, Month.OCTOBER, 11);


        Map<Integer,ForumUser> theResultForum =forum.getUserList().stream()
                .filter(forumuser ->forumuser.getSex()=='M')
                .filter(forumuser -> ChronoUnit.YEARS.between(forumuser.getDateOfBirth(), now) >= 20 )
                .filter(forumuser -> forumuser.getPosts()>=1 )
                .collect(Collectors.toMap(ForumUser::getId, forumUser-> forumUser));

        System.out.println("# elements: " + theResultForum.size());
        theResultForum.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);

    }
}
