package Modul1.Zad4.Przyklady;

abstract class Person {

    /**
     * Attribute same as basic class
     */
    private String name;

    /**
     * Constructor same as basic class
     */
    public Person(String name) {
        this.name = name;
    }

    /**
     * Public method same as basic class
     */
    public String getName() {
        return this.name;
    }

    /**
     * Abstract method which requires implementation in class that
     * extends abstract class Person.
     */
    abstract public void voice();
}

class Male extends Person {

    public Male(String name) {
        super(name);
    }

    public void voice() {
        System.out.println("Hey there!");
    }
}

class Application {

    public static void main(String args[]) {
        Male male = new Male("John");
        String name = male.getName();

        System.out.println(name);
        male.voice();
    }
}