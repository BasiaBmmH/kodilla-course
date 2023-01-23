package Modul4.Zad4;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Cannon> cannons = new LinkedList<>(
                Arrays.asList(
                        new Cannon(true),
                        new Cannon(true),
                        new Cannon(false),
                        new Cannon(false),
                        new Cannon(true),
                        new Cannon(false)
                )
        );

        for (int i = 0; i < cannons.size() - 1; i++) {
            cannons.get(i).fire();
        }

    }
}

class Cannon {
    private boolean loaded;

    Cannon(boolean loaded) {
        this.loaded = loaded;
    }

    public void fire() {
        if (loaded) {
            System.out.println("Armata załadowana");
        } else {
            System.out.println("Brak kuli w armacie");
            System.out.println("ładowanie...");
            loaded = true;
            System.out.println("Armata załadowana");
            System.out.println();
        }
    }
}
