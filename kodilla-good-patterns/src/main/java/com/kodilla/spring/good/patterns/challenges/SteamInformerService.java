package com.kodilla.spring.good.patterns.challenges;

public class SteamInformerService {
    static void inform(GameProduct gameProduct) {
        System.out.println("SEND INFO ABOUT " + gameProduct.getName() + " to Steam.");
    }
}
