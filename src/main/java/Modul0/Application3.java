package Modul0;

class Animal {

    private String name;
    private String rasa;

    public Animal(String name, String rasa) {
        this.name = name;
        this.rasa = rasa;
    }

    public String getName() {
        return this.name;
    }

    public String getRasa() {
        return this.rasa;
    }

    public static void jedzenie() {
    }

    public static void picie() {
    }

}

class Dog extends Animal {

    public Dog(String name, String rasa) {
        super(name, rasa);
    }
}

public class Application3 {
    public static void main(String[] args) {
        Animal dog = new Animal("Kanu", "owczarek niemiecki");
        String name = dog.getName();
        String rasa = dog.getRasa();
        System.out.println("zwierzak nazywa się: " + name + ", jest to: " + rasa);
        Animal.picie();
        Animal.jedzenie();
    }
}
