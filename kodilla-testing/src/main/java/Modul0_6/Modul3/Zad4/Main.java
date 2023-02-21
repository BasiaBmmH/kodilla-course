package Modul0_6.Modul3.Zad4;

/*

Zadanie: Litery wężykiem!
Zadanie składa się z dwóch części. Należy je zrealizować przy pomocy wewnętrznego edytora Kodilla w ramach jednego projektu.

Część 2



Rozwiązane zadanie wyślij do Mentora.
 */

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Deque<String> aWordsDeque = new ArrayDeque<>();

        Random randomGenerator = new Random();
        for (int i = 0; i < 50; i++) {
            int randomNumber = randomGenerator.nextInt(1, 51);
            // TODO Zrealizować za pomocą pętli for
            aWordsDeque.offer("a".repeat(randomNumber));
        }
        AGroupHolder aGroupHolder = aWordsSeparator(aWordsDeque);
        System.out.println(aGroupHolder);
        System.out.println("Deque results: " + aWordsDeque);
    }

    public static AGroupHolder aWordsSeparator(Deque<String> aWordsDeque) {
        ArrayList<String> evenAWords = new ArrayList<>();
        ArrayList<String> oddAWords = new ArrayList<>();
        for (String word : aWordsDeque) {
// elvis operator           warunek ? jeśli warunek prawidłowy : jeśli nieprawdłowy
            if(word.length() % 2 == 0){
                evenAWords.add(word);
            }else {
                oddAWords.add(word);
            }
        }

        return new AGroupHolder(evenAWords, oddAWords);
    }
}

class AGroupHolder {
    ArrayList<String> evenAWords;
    ArrayList<String> oddAWords;

    public AGroupHolder(ArrayList<String> evenAWords, ArrayList<String> oddAWords) {
        this.evenAWords = evenAWords;
        this.oddAWords = oddAWords;
    }

    public ArrayList<String> getEvenAWords() {
        return evenAWords;
    }

    public ArrayList<String> getOddAWords() {
        return oddAWords;
    }
}