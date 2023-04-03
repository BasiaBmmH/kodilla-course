package com.kodilla.stream.lambda;

public class ExecutorSaySomething implements Executor {

    @Override
    public void process() {
        System.out.println("This is an exapl text");
    }
}
