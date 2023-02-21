package Modul0_6.Modul4.Zad7.records;

public class Main {
    public static void main(String[] args) {

        int numberX = 6;
        int numberY = 3;
        euklidesAddition(numberX, numberY);
        euklidesMultiplication(numberX, numberY);
        euklidesMultiplicationWithNWD(numberX, numberY);

        System.out.println();

        numberX = 678;
        numberY = 21;
        euklidesAddition(numberX, numberY);
        euklidesMultiplication(numberX, numberY);
        euklidesMultiplicationWithNWD(numberX, numberY);
    }

    private static void euklidesMultiplication(int numberX, int numberY) {
        int mod = numberX % numberY;
        while (mod!=0) {
            numberX = numberY;
            numberY = mod;
            mod = numberX % numberY;
            if (mod == 0) {
                System.out.println("Numberx: " + numberX + "numbery: "+ numberY + " modulo: " + mod);
            }
        }
        System.out.println("Without NWD: " + numberY);
    }

    private static void euklidesMultiplicationWithNWD(int numberX, int numberY) {
        int rest = -1;
        int NWD = 0;
        while (rest != 0) {
            if (numberX > numberY) {
                rest = numberX % numberY;
                NWD = numberY;
                numberX = numberY;
                numberY = rest;
            } else {
                rest = numberY % numberX;
                NWD = numberX;
                numberX = numberY;
                numberY = rest;
            }
        }
        System.out.println("   With NWD: " + NWD);
    }

    public static void euklidesAddition(int numberX, int numberY) {
        if (numberX <= 0 || numberY <= 0) {
            System.out.println("Podaj dodatnie liczby. Podano: " + numberX + ", " + numberY);
            return;
        }

        while (numberX != numberY) {
            if (numberX > numberY) {
                numberX -= numberY;

            } else {
                numberY -= numberX;
            }
            if (numberX == numberY) {
                System.out.println("NWD: " + numberX);
                return;
            }
        }
    }
}
