package Modul3.Zad5.Przyklady;

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ArraySpeedTest2 {

    public static void main (String[] args) throws java.lang.Exception {
        // Creating collection with 30000 elements of type Integer
        List<Integer> list = new ArrayList<>();
        for (int n = 0; n < 30000; n++) {
            list.add(n);
        }

        // Displaying quantity of elements
        System.out.println("Quantity of elements in the collection: " + list.size());

        // Deleting last element from the collection
        long begin = System.currentTimeMillis();
        list.remove(list.size()-1);
        long end = System.currentTimeMillis();

        // Displaying time of the delete operation
        System.out.println("Removing last element has taken: " + (end - begin) + "ms");
    }
}
