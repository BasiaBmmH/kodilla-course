package com.kodilla.stream.array;

import java.util.Objects;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class ArrayOperations {

    static double getAverage(int[] numbers) {

        IntStream.range(0, numbers.length)
                .peek(value -> System.out.println("actual value: " + value));

        OptionalDouble average = IntStream.range(0, numbers.length)
                .map(index -> numbers[index])
                .filter(Objects::nonNull)
                .average();

        return average.orElse(0.0);
    }

}
