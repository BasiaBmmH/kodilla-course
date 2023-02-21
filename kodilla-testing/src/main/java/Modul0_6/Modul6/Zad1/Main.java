package Modul0_6.Modul6.Zad1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

// Napisz program, który z podanego ciągu znaków znajdzie same samogłoski.
// Na przykład dla napisu “Adam” zwróci tylko “Aa”.
// Kluczowy algorytm zamknij w osobnej funkcji/metodzie, która będzie przyjmowała 1 argument wejściowy.
// Funkcja ta nie powinna wypisać niczego na ekran.

public class Main {
    public static void main(String[] args) {
        System.out.println(findVowels("Adam"));
    }

    private final static List<Character> vowelLetters = List.of('a', 'e', 'i', 'o', 'u', 'y');

    private static String findVowels(String word) {

        StringBuilder vowels = new StringBuilder();
        char[] arr = word.toLowerCase().toCharArray();
        for (char c : arr) {
            if (vowelLetters.contains(c)) {
                vowels.append(c);
            }
        }
        return vowels.toString();
    }

    public static String findVowelsTDD(String word) {
        return "";
    }

}
