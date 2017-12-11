package com.kodilla.testing.forum.statistics;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsTestSuite {
    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }
    @Test
    public void testCalcStatCase1(){
        /*
        gdy liczba postów = 0
        gdy liczba użytkowników = 100
        gdy liczba komentarzy = 0
         */
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> userNames = new ArrayList<String>();
        for(int i=0;i<100;++i) {
            userNames.add("Piotrek");
        }
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);

        CalcStat calcstat= new CalcStat();
        calcstat.calculateAdvStatistics(statisticsMock);
        //When

        //Then
        assertEquals(0,calcstat.getAvgNumberCommentsOnPost(),.1);
        assertEquals(0,calcstat.getAvgNumberCommentsPerUser(),.1);
        assertEquals(0, calcstat.getAvgNumberPostsPerUser(),.1);
        assertEquals(0, calcstat.getNumberOfComments());
        assertEquals(0, calcstat.getNumberOfPosts());
        assertEquals(100, calcstat.getNumberOfUsers());
    }

    @Test
    public void testCalcStatCase2(){
        /*
        dy liczba postów = 1000
        gdy liczba użytkowników = 0
        gdy liczba komentarzy < liczba postów
        gdy liczba komentarzy = 0
         */
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> userNames = new ArrayList<String>();
        for(int i=0;i<0;++i) {
            userNames.add("Piotrek");
        }
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(0);

        CalcStat calcstat= new CalcStat();
        calcstat.calculateAdvStatistics(statisticsMock);
        //When

        //Then
        assertEquals(0, calcstat.getAvgNumberCommentsOnPost(),.1);
        assertEquals(0, calcstat.getAvgNumberCommentsPerUser(),.1);
        assertEquals(0, calcstat.getAvgNumberPostsPerUser(),.1);
        assertEquals(0, calcstat.getNumberOfComments());
        assertEquals(1000, calcstat.getNumberOfPosts());
        assertEquals(0, calcstat.getNumberOfUsers());
    }
    @Test
    public void testCalcStatCase3(){
        /*
        gdy liczba komentarzy > liczba postów
         */
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> userNames = new ArrayList<String>();
        for(int i=0;i<100;++i) {
            userNames.add("Piotrek");
        }
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(1000);

        CalcStat calcstat= new CalcStat();
        calcstat.calculateAdvStatistics(statisticsMock);
        //When

        //Then
        assertEquals(10, calcstat.getAvgNumberCommentsOnPost(),.1);
        assertEquals(10, calcstat.getAvgNumberCommentsPerUser(),.1);
        assertEquals(1, calcstat.getAvgNumberPostsPerUser(),.1);
        assertEquals(1000, calcstat.getNumberOfComments());
        assertEquals(100, calcstat.getNumberOfPosts());
        assertEquals(100, calcstat.getNumberOfUsers());
    }
}
