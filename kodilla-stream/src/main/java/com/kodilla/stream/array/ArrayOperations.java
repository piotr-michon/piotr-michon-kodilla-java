package com.kodilla.stream.array;

import java.util.stream.IntStream;

public interface ArrayOperations {
    static double getAverage(int[] numbers) {
        if (numbers == null) {
            return Double.NaN;
        }
        IntStream.range(0, numbers.length)
                .forEach(n -> System.out.println(numbers[n]));

        return IntStream.range(0, numbers.length)
                .mapToDouble(n -> numbers[n])
                .average().orElse(Double.NaN);
    }
}