package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;


import java.util.OptionalDouble;

import static com.kodilla.stream.array.ArrayOperations.getAverage;

public class ArrayOperationsTestSuite {
    @Test
    public void testGe() {
        //Given
        double result2=0;
        //When
        int[] numbers = {5,5,5,5,5};


        //Then
        OptionalDouble result =  getAverage(numbers);

        for(int n :numbers) {
           result2+=n;
        }
        result2=result2/numbers.length;

        Assert.assertEquals(result2, result.getAsDouble(), 0);
    }


}
