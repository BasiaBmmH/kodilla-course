package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StremMain {
    public static void main(String[] args) {
        System.out.println("\nWelcome to module 7 - Stream");

        SaySomething saySomething = new SaySomething();
        saySomething.say();

        Processor processor = new Processor();
        ExecutorSaySomething executorSaySomething = new ExecutorSaySomething();
        processor.execute(executorSaySomething);

        Executor codeExecute = () -> System.out.println("example of Lambda Expression");
        processor.execute(codeExecute);

        Processor processor1 = new Processor();
        processor1.execute(() -> System.out.println("przypisane wprost do argumentu metody"));

        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("\nCalculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        /**
         Referencję do dowolnej metody statycznej klasy uzyskujemy poprzez użycie
         następującego zapisu:
         ClassName::methodName
         */

        System.out.println("\nCalculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);


        PoemBeautifier poemBeautifier = new PoemBeautifier();

        System.out.println("\nPoem Beautifier results:");
       // poemBeautifier.beautify("poem", " beatifier", (text1, text2) -> text1 + "ABC" + toUpperCase(text2));
        poemBeautifier.beautify("poem", " beatifier", (text1, text2) -> "ABC" + text1 + "ABC" + text2 + " aplication");
        poemBeautifier.beautify("poem", " beatifier", (text1, text2) -> "~~ " + text1 + " ~~" + text2 + " ~~");
        poemBeautifier.beautify("Hi", " Bye", (text1, text2) -> "(～￣▽￣)～ " + text1 + " and " + text2 + " ¬_¬");
        poemBeautifier.beautify("poem", " beatifier", (text1, text2) -> "^^" + text1 + text2 + "^^");


    }
}
