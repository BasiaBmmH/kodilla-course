package com.kodilla;

public class Main {
    public static void main(String[] args) {
        int[] arr2 = {-7, -7, -7, 7, -7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, -7};

        double sum = 0;
        for (int i = 0; i < arr2.length; i++) {
            sum += arr2[i];
        }

        System.out.println(sum/ arr2.length);

    }
}