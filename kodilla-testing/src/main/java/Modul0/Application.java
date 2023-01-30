package Modul0;

class CalculatorOdejmowanie {
    public double odejmowanie(double a, double b) {
        return a - b;
    }
}

public class Application {
    public static void main(String[] args) {

        CalculatorOdejmowanie simpleCalculator = new CalculatorOdejmowanie();

        double result = simpleCalculator.odejmowanie(7.1, 5.7);
        System.out.println(result);

    }
}
