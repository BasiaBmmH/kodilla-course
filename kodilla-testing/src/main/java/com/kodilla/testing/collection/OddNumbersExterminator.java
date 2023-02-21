package com.kodilla.testing.collection;

import java.util.LinkedList;
import java.util.List;

public class OddNumbersExterminator {

    public static List<Integer> exterminate(List<Integer> numbers) {
        List<Integer> evenNumbers = new LinkedList<>();
        int evenIndex = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                evenNumbers.add(evenIndex++, numbers.get(i));
            }
        }
        return evenNumbers;
    }


}
