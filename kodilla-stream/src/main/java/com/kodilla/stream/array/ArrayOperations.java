package com.kodilla.stream.array;

import java.util.Objects;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class ArrayOperations {

    static double getAverage(int[] numbers) {

        IntStream.range(0, numbers.length)
                .peek(value -> System.out.println("actual value: "+value));

        OptionalDouble average = IntStream.range(0, numbers.length) // 0 1 2 3
                .map(index -> numbers[index])
                .filter(Objects::nonNull)
                .average();


//TODO przy pomocy strumienia IntStream oraz metody
// range(int startInclusive, int endExclusive) wyświetlić kolejne elementy tablicy,
// a następnie:
// przy pomocy drugiego strumienia IntStream oraz metody
// range(int startInclusive, int endExclusive), a także kolektora
// average() obliczyć średnią.
// Na końcu metoda powinna zwracać średnią jako wynik typu double.
//        Optional<Integer> optional = Optional.ofNullable(null);
//        return optional.orElse(0);
        return average.orElse(0.0);
    }

}
