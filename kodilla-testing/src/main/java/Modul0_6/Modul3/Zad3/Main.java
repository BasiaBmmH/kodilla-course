package Modul0_6.Modul3.Zad3;

import java.util.Random;

/*
Napisz program, który będzie posiadał:

pętlę while, wewnątrz której:
losujemy liczbę typu int z zakresu 0-9 i dodajemy ją do zmiennej sumaA,
losujemy liczbę typu int z zakresu 0-49 i dodajemy ją do zmiennej sumaB.
Pętlę wykonuj tak długo, jak długo spełniony jest warunek sumaA > sumaB.

W każdej iteracji wyświetl numer przebiegu pętli oraz aktualne wartości obu zmiennych.
 */

public class Main {
    public static void main(String[] args) {

        Random randomGenerator = new Random();

        int sumaA = 1000;
        int sumaB = 0;
        int counter = 0;

        while (sumaA > sumaB) {
            sumaA = randomGenerator.nextInt(10) + sumaA;
            sumaB = randomGenerator.nextInt(50) + sumaB;
            System.out.println("sumaA: " + sumaA);
            System.out.println("sumaB: " + sumaB);
            counter++;
            System.out.println("Numer przebiegu pętli: " + counter);
        }
        System.out.println("sumaA < sumaB " + sumaA + " < " + sumaB);


        //TODO Napisz program, który wypisze wszystkie liczby podzielne
        // przez 3 (bez reszty) z zakresu od 0 do 100 (obustronnie włącznie).
        System.out.println();

        for (int i = 0; i <= 100; i++) {
            if(i%3==0){
                System.out.print(i + " ");
            }
        }


    }
}
