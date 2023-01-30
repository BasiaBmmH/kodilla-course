package Modul1.Zad2.przyklady;

interface Telephone2 {

    void callTo(String name);

    default void callToMom() {
        System.out.println("I am calling to my mom!");
    }

    static String getMyNumber() {
        return "+48 909 901 928";
    }

}

class Application3 {
    public static void main(String[] args) throws java.lang.Exception {
        System.out.println(Telephone2.getMyNumber());
    }
}
