package com.kodilla.good.patterns.food2Door;

public class Main {
    public static void main(String[] args) {
        OrderProcessor orderProcessor = new OrderProcessor();
        orderProcessor.registerSupplier("ExtraFoodShop", new ExtraFoodShopOrderStrategy());
        orderProcessor.registerSupplier("HealthyShop", new HealthyShopOrderStrategy());
        orderProcessor.registerSupplier("GlutenFreeShop", new GlutenFreeShopOrderStrategy());


        boolean orderProcessed = orderProcessor.process("HealthyShop", "Organic Apples", 10);
        if (orderProcessed) {
            System.out.println("Order successfully processed!");
        } else {
            System.out.println("Order processing failed.");
        }
    }
}
