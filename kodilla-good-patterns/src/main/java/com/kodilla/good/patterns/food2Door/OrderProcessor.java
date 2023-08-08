package com.kodilla.good.patterns.food2Door;

import java.util.HashMap;
import java.util.Map;

class OrderProcessor {
    private Map<String, OrderStrategy> strategies = new HashMap<>();

    public void registerSupplier(String supplier, OrderStrategy strategy) {
        strategies.put(supplier, strategy);
    }

    public boolean process(String supplier, String product, int quantity) {
        OrderStrategy strategy = strategies.get(supplier);
        if (strategy != null) {
            return strategy.process(supplier, product, quantity);
        } else {
            System.out.println("Unknown supplier: " + supplier);
            return false;
        }
    }
}
