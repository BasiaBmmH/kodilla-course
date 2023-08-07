package com.kodilla.spring.good.patterns.challenges;

public class GameProduct extends Product{

    public GameProduct(String name, double price, String category) {
        super(name, price, category);
    }

    @Override
    public void preorder() {
        SteamInformerService.inform(this);
    }
}
