package Modul0_6.Modul3.Zad5.Przyklady;

import java.util.*;
import java.lang.*;
import java.io.*;

class ArrayListSpeedTest3 {

    public static void main (String[] args) throws java.lang.Exception {
        // Creating collection with 8000000 elements of type Integer
        List<Integer> list = new ArrayList<>();
        for (int n = 0; n < 8000000; n++) {
            list.add(n);
        }

        // Displaying quantity of elements
        System.out.println("Quantity of elements in the collection: " + list.size());

        //Adding element at the end of the collection
        long begin = System.nanoTime();
        list.add(list.size());
        long end = System.nanoTime();

        // Displaying time of the operation
        System.out.println("Adding element at the od of the collection has taken: " + (end - begin) + "ns");

        //Adding element at the beginning of the collection
        begin = System.nanoTime();
        list.add(0, list.size());
        end = System.nanoTime();

        // Displaying time of the operation
        System.out.println("Adding element at the beginning of the collection has taken: " + (end - begin) + "ns");
    }
}