package com.kodilla.testing.collection;

import java.util.ArrayList;

/*
W katalogu src/main/java utwórz pakiet com.kodilla.testing.collection
W utworzonym pakiecie stwórz klasę OddNumbersExterminator posiadającą metodę exterminate(ArrayList<Integer> numbers)
przyjmującą jako argument kolekcję ArrayList liczb typu Integer,
która zwraca również kolekcję ArrayList liczb typu Integer, stanowiącą podzbiór kolekcji wejściowej z pominięciem liczb nieparzystych.
 */
public class OddNumbersExteminator {
    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers){
       ArrayList<Integer> exterminatedNumbers = new ArrayList<Integer>();
        for (int i:numbers) {
            if(i%2==0){
                exterminatedNumbers.add(i);
            }
        }
        return exterminatedNumbers;
    }
}
