package Modul6.calculator;

public class Calculator {
    public Calculator() {
    }

    public static void main(String[] args) {
        add(7, 5);
        subtract(21, 7);
    }


    static int subtract(int num, int num1) {
        int result = num - num1;
        System.out.println(result);
        return result;
    }

    static int add(int num, int num2) {
        int result = num + num2;
        System.out.println(result);
        return result;
    }

}
