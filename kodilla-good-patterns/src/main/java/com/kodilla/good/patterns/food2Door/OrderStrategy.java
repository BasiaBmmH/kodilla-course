package com.kodilla.good.patterns.food2Door;

interface OrderStrategy {
    boolean process(String supplier, String product, int quantity);
}

