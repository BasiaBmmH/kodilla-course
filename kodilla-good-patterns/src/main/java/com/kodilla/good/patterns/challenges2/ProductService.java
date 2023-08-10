package com.kodilla.good.patterns.challenges2;

class ProductService implements OrderService {
    @Override
    public boolean order(User user, Product product) {

        System.out.println("Ordering " + product.getName() + " for user: " + user.getUsername());
        return true;
    }
}

