package com.kodilla.exception.test;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }


    /**
     * This main can throw an ArithmeticException!!!
     *
     * @param args
     */
    public static void main(String[] args) {
        FirstChallenge firstChallenge = new FirstChallenge();

        try {
            double result = firstChallenge.divide(3, 0);
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("you can't divide by zero");
        }

        System.out.println(power(2, 4));

    }

    public static int power(int podstawa, int wykladnik) {
        int wynik = 1;

        if (podstawa == 0) {
            wynik = 0;

        } else if (wykladnik == 0) {
            wynik = 1;

        }
        if (wykladnik == 1) {
            wynik = podstawa;

        } else {
            while (wykladnik > 0) {
                wynik *= podstawa;
                wykladnik--;
            }
        }
        return wynik;
    }
}

//done Potęgowanie zera (podstawa) z dowolną liczbą (wykładnik)
//done Potęgowanie dowolnej liczby (podstawa) z zerem (wykładnik)
//done Potęgowanie dowolnej liczby (podstawa) z jedynką (wykładnik)

/*
Napisz program, który obliczy wynik potęgowania z podanej podstawy i wykładnika.
Program powinien uwzględniać jedynie liczby naturalne (całkowite z uwzględnieniem 0), zarówno dla podstawy, jak i wykładnika.
Kluczowy algorytm zamknij w osobnej funkcji/metodzie a wynik zwróć (nie wyświetlaj niczego na ekranie).

Obsłuż w algorytmie następujące sytuacje:

Potęgowanie zera (podstawa) z dowolną liczbą (wykładnik)
Potęgowanie dowolnej liczby (podstawa) z zerem (wykładnik)
Potęgowanie dowolnej liczby (podstawa) z jedynką (wykładnik)
**UWAGA: ** Nie używaj żadnych gotowych funkcji/metod/bibliotek.
W zadaniu tym chodzi o to, żeby opracować algorytm, który dokona odpowiednich obliczeń we własnym zakresie, a następnie go zaimplementować.
 */


/*
Stwórz wewnątrz modułu kodilla-exception pakiet com.kodilla.exception.test, a w nim klasę FirstChallenge zawierającą poniższy kod:

package com.kodilla.exception.test;

public class FirstChallenge {

   public double divide(double a, double b) throws ArithmeticException {
      if (b == 0) {
         throw new ArithmeticException();
      }
      return a / b;
   }

   /**
    * This main can throw an ArithmeticException!!!
    * @param args
    */
//public static void main(String[] args) {
//    FirstChallenge firstChallenge = new FirstChallenge();
//    double result = firstChallenge.divide(3, 0);
//
//    System.out.println(result);
//}
//}
//Zauważ, że metoda divide(double a, double b) rzuci wyjątkiem, jeżeli będziemy chcieli podzielić przez 0. Wykorzystując blok try-catch-finally, obsłuż rzucany wyjątek.
// */
