package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HomeworkTestSuite {
    @Test
    public void testUpdate() {
        //Given
        Task task1 = new Task("task1");
        Task task2 = new Task("task2");
        Mentor johnSmith = new Mentor("John Smith");
        Mentor ivoneEscobar = new Mentor("Ivone Escobar");
        Mentor jessiePinkman = new Mentor("Jassie PinkMan");

        task1.registerObserver(johnSmith);
        task2.registerObserver(ivoneEscobar);
        task2.registerObserver(jessiePinkman);
        //when
        task1.addParticipant("Adrian");
        task2.addParticipant("Adrian");
        task1.addParticipant("Tomek");
        task2.addParticipant("Tomek");
        task2.addParticipant("Marcin");

        //then
        assertEquals(2,johnSmith.getUpdateCount());
        assertEquals(3,ivoneEscobar.getUpdateCount());
        assertEquals(3,jessiePinkman.getUpdateCount());

    }
}
