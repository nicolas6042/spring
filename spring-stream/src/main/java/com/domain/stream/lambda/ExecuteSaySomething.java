package com.domain.stream.lambda;

public class ExecuteSaySomething implements Executor{

    @Override
    public void process() {
        System.out.println("Example text");
    }
}
