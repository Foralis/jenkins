package org.example.tmp.lambda;

import java.util.function.Function;

public class TestLambda {


    public static void main(String[] args) {
        Operation operation;
        operation = (x,y) -> x + y;
        System.out.println(operation.calculate(10,20));

        Function<Integer, String> function = str -> str + "";
        System.out.println(function.apply(5));
    }
}

interface Operation {
    int calculate(int x, int y);
}
