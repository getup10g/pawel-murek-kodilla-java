package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {

//    Stwórz w katalogu src/main/java pakiet com.kodilla.stream.forumuser, a w nim klasę ForumUser
//    Klasa ForumUser powinna mieć następujące pola (użyj odpowiednich nazw angielskich):
//    unikalny identyfikator użytkownika (typu int)
//    nazwa użytkownika (typu String)
//    płeć (typu char), z wartościami ‘M’/’F’
//    data urodzenia (typu LocalDate)
//    ilość opublikowanych postów (typu int)
//    W tym samym pakiecie napisz klasę Forum, która będzie zawierała listę użytkowników, czyli listę obiektów ForumUser.
//    Klasa Forum powinna udostępniać metodę getUserList(), która będzie zwracała kolekcję z użytkownika forum

    private final Integer id;
    private final String username;
    private final char sex;
    private final LocalDate dateOfBirth;
    private final int posts;

    public ForumUser(int id, String username, char sex, LocalDate dateOfBirth, int posts) {
        this.id = id;
        this.username = username;
        if(sex=='F')
        {this.sex=sex;}
        else
        {this.sex='M';}
        this.dateOfBirth = dateOfBirth;
        this.posts = posts;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getPosts() {
        return posts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", sex=" + sex +
                ", dateOfBirth=" + dateOfBirth +
                ", posts=" + posts +
                '}';
    }
}
