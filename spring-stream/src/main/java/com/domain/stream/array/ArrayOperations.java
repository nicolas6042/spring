package com.domain.stream.array;

import java.util.stream.IntStream;

/**
 * @author mbaranowicz
 */
public interface ArrayOperations {

    static double getAverage(int[] numbers) {

        IntStream.range(0, numbers.length)
                .map(x->numbers[x])
                .forEach(n-> System.out.println(n + " "));

        double avg = IntStream.range(0, numbers.length)
                .map(n->numbers[n])
                .average()
                .getAsDouble();

        System.out.println("Numbers avg: " + avg);

        return avg;
    }
}
