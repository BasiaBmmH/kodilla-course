package Modul1.Zad2.przykłady;

interface Telephone {

    void callTo(String name);

    default void callToMom() {
        System.out.println("I am calling to my mom!");
    }

}

class Mobile implements Telephone2 {

    public void callTo(String name) {
        System.out.println("Calling to " + name);
    }

}

class Application2 {
    public static void main (String[] args) throws java.lang.Exception {
        Mobile mobile = new Mobile();

        mobile.callTo("Adam");
        mobile.callToMom();
    }
}