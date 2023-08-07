package com.kodilla.spring.good.patterns.challenges;

import java.util.HashMap;

public class Product implements Preordering {
    private String name;
    private String category;
    private double price;

    public HashMap<String, Product> productsList = new HashMap<>();


    public boolean isProductAvaliable() {
        boolean isAvaliable = false;

        //TODO sprawdza czy produkt jest na liscie

        return isAvaliable;
    }

    public void addProduct(String category, Product product) {
        productsList.put(category, product);
    }

    public Product(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void preorder() {
        // do nothing
        System.out.println("Standard product order.");
    }
}
