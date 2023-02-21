package Modul0_6.Modul3.Zad3.przyklad;

import java.util.*;

class WhileLoopTest {

    public static void main(String[] args) {
        boolean loggedIn = false;                                // [1]
        int tryCounter = 0;                                      // [2]
        Random randomGenerator = new Random();                   // [3]
        while (!loggedIn) {                                      // [4]
            tryCounter++;                                         // [5]
            System.out.println("Waiting for the User to sign in : [attempt # " + tryCounter + "]");   // [6]
            if (randomGenerator.nextInt(100) > 90) {              // [7]
                loggedIn = true;                                   // [8]
            }                                                     // [9]
        }
        System.out.println("User logged in!");                   // [10]
    }
}