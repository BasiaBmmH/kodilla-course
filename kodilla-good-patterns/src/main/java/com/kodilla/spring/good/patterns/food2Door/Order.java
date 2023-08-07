package com.kodilla.spring.good.patterns.food2Door;

//dairy = nabiał; wheat = pszenny

public class Order {
    public static void main(String[] args) {

        Producer producer1 = new Producer("ExtraFoodShop", "Nowowiejska12");
        Producer producer2 = new Producer("HealthyShop", "Warszawska11");
        Producer producer3 = new Producer("GlutenFreeShop", "Krakowska17");

        /**TOASK

         - producent to sklep i dostawca


         - czy hashMapa, ktorej kluczem bedzie producent/Sklep moze jako wartosc przyjac wiele produktów (czy jest to dobre rozwiazanie(?))
         wtedy można by wykorzystać to w metodzie process(); która sprawdzi czy dany sklep posiada oczekiwany produkt

         - process() rozne sposoby realizacji

         producent interfejs -> shopy implementacje
         */

        Shop shop1 = new Shop("", "", producer1);
        Shop shop2 = new Shop("", "", producer2);
        Shop shop3 = new Shop("", "", producer3);

        Product product1 = new Product("cheese", "diary", 1, 20, shop1);
        Product product2 = new Product("milk", "diary", 2, 12, shop2);
        Product product3 = new Product("bread", "wheat", 1, 8, shop3);

        Producer.process(shop1, product1);
    }
}
