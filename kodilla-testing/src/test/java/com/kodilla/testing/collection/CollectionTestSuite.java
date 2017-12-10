package com.kodilla.testing.collection;
import com.kodilla.testing.collection.OddNumbersExteminator;
import org.junit.*;

import java.util.ArrayList;

public class CollectionTestSuite {
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
    public void testOddNumbersExterminatorEmptyList(){
        //Given
        OddNumbersExteminator oddnumberexterminator = new OddNumbersExteminator();
        ArrayList <Integer> numbers = new ArrayList<Integer>();
        //When
        System.out.println("Test empty list " + numbers.size());
        //Then
        Assert.assertEquals(numbers, oddnumberexterminator.exterminate(numbers));
    }
    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        OddNumbersExteminator oddnumberexterminator = new OddNumbersExteminator();
        ArrayList <Integer> numbers = new ArrayList<Integer>();
        for(int i=0;i<10;++i) {
            numbers.add(1 + i);
        }
        //When
        System.out.println("Test normal list: ");
        for (int i:numbers) {
            System.out.println(i);
        }
        System.out.println(" ")
        //Then

        for (int i:oddnumberexterminator.exterminate(numbers)) {
            System.out.println(i);
            Assert.assertEquals(0,i%2);
        }

    }
}

