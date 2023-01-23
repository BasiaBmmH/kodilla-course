package Modul2.Zad2;

public class Main {

    public static void main(String[] args) {
        int number = 2;
        char character = '$';
        float floatNumber = 2.0f;

        Integer wrapNumber = number;
        Character wrapCharacter = character;
        Float wrapFloat = floatNumber;

        System.out.println(wrapFloat.equals(floatNumber));
        System.out.println(wrapNumber.equals(number));
        System.out.println(wrapCharacter.equals(character));
    }

}
