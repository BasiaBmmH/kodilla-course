package com.kodilla.spring.good.patterns.food2Door;

public class Product {
    private String productName;
    private String productCategory;
    private int productAmount;
    private double productPrise;
    private Shop shop;

    public Product(String productName, String productCategory, int productAmount, double productPrise, Shop shop) {
        this.productName = productName;
        this.productCategory = productCategory;
        this.productAmount = productAmount;
        this.productPrise = productPrise;
        this.shop = shop;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public int getProductAmount() {
        return productAmount;
    }

    public double getProductPrise() {
        return productPrise;
    }

    public Shop getShop() {
        return shop;
    }
}
