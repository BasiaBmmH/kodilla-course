package Modul2.Zad4.przykłady;

public class Main {
    public static void main(String[] args) {

    }
}

class MyKey {
    int value;

    //constructor
    public MyKey(int value) {
        this.value = value;
    }

    //overriden method hashCode():
    @Override
    public int hashCode() {
        if (value >= 0 && value <= 9) {
            return 0; // bucket 0
        }
        if (value >= 10 && value <= 19) {
            return 1; // bucket 1
        }
        if (value >= 20 && value <= 29) {
            return 2; // bucket 2
        }
        return 0;
    }
}