package Modul5;

import java.util.LinkedList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {

        integersDivisibleByX(2, 10, 5);
        //System.out.println(numbers.size());

        FunkcjaDzielaca.integersDivisibleByX(0,7,5);
        System.out.println(FunkcjaDzielaca.getNumbers());
        System.out.println(FunkcjaDzielaca.numbers.size());

    }

    public static void integersDivisibleByX(int zakresDolny, int zakresGorny, int mianownik) {
        List<Integer> numbers = new LinkedList<>();

        for (int i = zakresDolny; i <= zakresGorny; i++) {
            if (i % mianownik == 0) {
                numbers.add(i);
            }
        }
    }

}

class FunkcjaDzielaca {
    private int zakresDolny;
    private int zakresGorny;
    private int mianownik;
    static List<Integer> numbers = new LinkedList<>();


    public static void integersDivisibleByX(int zakresDolny, int zakresGorny, int mianownik) {

        for (int i = zakresDolny; i <= zakresGorny; i++) {
            if (i % mianownik == 0) {
                numbers.add(i);
            }
        }
    }

    public static List<Integer> getNumbers() {
        return numbers;
    }

}
