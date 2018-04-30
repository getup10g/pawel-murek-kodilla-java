package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {
    private final String mentorname;
    private int updateCount;

    public Mentor(String mentorname) {
        this.mentorname = mentorname;
    }

    @Override
    public void update(Task task) {
        System.out.println(mentorname + ": New task " + task.getName() + "\n" +
                "(total : " + task.getParticipants().size() + " participants)");
        updateCount++;
    }

    public String getUsername() {
        return mentorname;
    }

    public int getUpdateCount() {
        return updateCount;
    }

}



