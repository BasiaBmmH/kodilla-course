package com.kodilla.good.patterns.challenges;

class InMemoryOrderRepository implements OrderRepository {
    @Override
    public void createOrder(User user, Product product) {
        System.out.println("Creating order recod for user: " + user.getUsername() + " and product: " + product.getName());
    }
}