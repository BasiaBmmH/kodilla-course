package com.kodilla.spring.good.patterns.food2Door;

public class Producer {
    private String producentName;
    private String producentAddress;

    public Producer(String producentName, String producentAddress) {
        this.producentName = producentName;
        this.producentAddress = producentAddress;
    }

//TODO metoda process(), która pozwala na zrealizowanie zamówienia w danym sklepie.

    static boolean process(Shop shop, Product product) {
        boolean realisation = false;



        return realisation;
    }

    public String getProducentName() {
        return producentName;
    }

    public String getProducentAddress() {
        return producentAddress;
    }
}
