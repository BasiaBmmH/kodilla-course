package com.kodilla.good.patterns.food2Door;

class GlutenFreeShopOrderStrategy implements OrderStrategy {
    @Override
    public boolean process(String supplier, String product, int quantity) {

        System.out.println("Processing order for GlutenFreeShop...");

        return true;
    }
}
