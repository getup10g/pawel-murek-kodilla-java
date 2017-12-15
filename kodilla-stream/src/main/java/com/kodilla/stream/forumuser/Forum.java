package com.kodilla.stream.forumuser;

import java.util.ArrayList;

public class Forum {
    private final ArrayList<ForumUser> userList= new ArrayList<>();

    public void addUser(ForumUser forumUser){
        userList.add(forumUser);
    }

    public ArrayList<ForumUser> getUserList() {
        return new ArrayList<>(userList);
    }
}
