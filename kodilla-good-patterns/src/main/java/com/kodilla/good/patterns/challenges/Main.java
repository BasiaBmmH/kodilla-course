package com.kodilla.good.patterns.challenges;


public class Main {
    public static void main(String[] args) {

        InformationService informationService = new EmailInformationService();
        OrderService orderService = new ProductService();
        OrderRepository orderRepository = new InMemoryOrderRepository();


        ProductOrderService productOrderService = new ProductOrderService(
                informationService, orderService, orderRepository);


//        User user = new User("Fox Mulder");
//        Product product = new Product("sunflower");
//        OrderRequest orderRequest = new OrderRequest(user, product);

        User user = new User("Ragnar Lothbrok ");
        Product product = new Product("axe");
        OrderRequest orderRequest = new OrderRequest(user, product);


        OrderDto orderDto = productOrderService.process(orderRequest);


        if (orderDto.isOrdered()) {
            System.out.println("Order successful for user: " + orderDto.getUser().getUsername() + " and product: " + orderDto.getProduct().getName());
        } else {
            System.out.println("Order failed for user: " + orderDto.getUser().getUsername() + " and product: " + orderDto.getProduct().getName());
        }
    }
}
