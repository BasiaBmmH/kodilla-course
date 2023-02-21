package Modul0_6.Modul1.Zad6;

public class Main {
    public static void main(String[] args) {

        SomethingWhatNeedsHashCode newThing = new SomethingWhatNeedsHashCode();
        double result = newThing.hashCode();
        int result1 = newThing.hashCode();

        System.out.println(result);
        System.out.println(result1);

    }
}

class SomethingWhatNeedsHashCode {

}
