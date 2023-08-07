package com.kodilla.spring.good.patterns.food2Door;

public class Shop {
    private String shopName;
    private String shopAddress;
    private Producer shopProducer;

    public Shop(String shopName, String shopAddress, Producer shopProducer) {
        this.shopName = shopName;
        this.shopAddress = shopAddress;
        this.shopProducer = shopProducer;
    }

    public String getShopName() {
        return shopName;
    }

    public String getShopAddress() {
        return shopAddress;
    }

    public Producer getShopProducer() {
        return shopProducer;
    }
}
