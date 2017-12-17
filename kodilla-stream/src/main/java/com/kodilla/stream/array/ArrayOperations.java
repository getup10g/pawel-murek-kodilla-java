package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class ArrayOperations {
    public static OptionalDouble getAverage(int[] numbers){
                IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .forEach( n -> System.out.print(n + " "));

        OptionalDouble avg = IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .average();

        return avg;
    }
}
