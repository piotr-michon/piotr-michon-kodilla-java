package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.collection.OddNumbersExterminator;

import java.util.ArrayList;

public class TestingMain {
    public static void main(String[] args) {
        //Calculator test
        System.out.println("Test - pierwszy test jednostkowy");

        Calculator calculator = new Calculator();
        int addResult = calculator.add(4, 3);
        int subtractResult = calculator.subtract(4, 3);

        if(addResult == 7) {
            System.out.println("Add function test OK");
        } else {
            System.out.println("Add function test failed!");
        }
        if(subtractResult == 1) {
            System.out.println("Subtract function test OK");
        } else {
            System.out.println("Subtract function test failed!");
        }
    }
}
