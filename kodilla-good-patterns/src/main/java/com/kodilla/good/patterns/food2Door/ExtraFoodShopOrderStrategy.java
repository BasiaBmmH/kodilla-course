package com.kodilla.good.patterns.food2Door;

// Konkretne strategie dla różnych producentów
class ExtraFoodShopOrderStrategy implements OrderStrategy {
    @Override
    public boolean process(String supplier, String product, int quantity) {

        System.out.println("Processing order for ExtraFoodShop...");

        return true;
    }
}
