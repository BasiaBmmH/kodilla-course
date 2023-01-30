package Modul3.Zad4.przyklady;


import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class BigTestData {

    public static void main (String[] args) throws java.lang.Exception {
        List<Integer> theBigList = new ArrayList<>();            // [1]
        Random theGenerator = new Random();                      // [2]
        for (int n=0; n<2000000; n++) {                          // [3]
            theBigList.add(theGenerator.nextInt(50000));          // [4]
        }                                                        // [5]
        // Check the list size
        System.out.println("The Big List contains now " + theBigList.size() + " objects");  // [6]
    }
}