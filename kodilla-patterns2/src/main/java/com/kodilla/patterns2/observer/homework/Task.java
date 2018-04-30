package com.kodilla.patterns2.observer.homework;


import java.util.ArrayList;
import java.util.List;

public class Task implements Observable {
    private final List<Mentor> mentors;
    private final List<String> participants;
    private final String name;

    public Task(String name) {
        mentors = new ArrayList<>();
        participants = new ArrayList<>();
        this.name = name;
    }

    public List<String> getParticipants() {
        return participants;
    }

    public String getName() {
        return name;
    }

    public void addParticipant(String Participant) {
        participants.add(Participant);
        notifyObservers();
    }
    @Override
    public void registerObserver(Mentor mentor) {
        mentors.add(mentor);
    }
    @Override
    public void notifyObservers() {
        for(Mentor mentor : mentors) {
            mentor.update(this);
        }
    }
    @Override
    public void removeObserver(Mentor mentor) {
        mentors.remove(mentor);
    }
}
