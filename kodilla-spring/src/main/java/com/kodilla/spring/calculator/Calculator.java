package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator {
    @Autowired
    private Display display;
    private double result;

    public double add(double a, double b) {
        result = a + b;
        display.displayValue(result);
        return result;
    }

    public double sub(double a, double b) {
        result = a - b;
        display.displayValue(result);
        return result;
    }

    public double mul(double a, double b) {
        result = a * b;
        display.displayValue(result);
        return result;
    }

    public double div(double a, double b) {
        if (b != 0) {
            result = a / b;
            display.displayValue(result);
            return result;
        }
        display.displayValue(Double.NaN);
        return Double.NaN;
    }
}
