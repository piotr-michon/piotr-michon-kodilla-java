package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.calculator");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double addResult = calculator.add(2, 2);
        double subResult = calculator.sub(4, 2);
        double mulResult = calculator.mul(3, 3);
        double divResult = calculator.div(6, 2);
        double divZeroResult = calculator.div(4, 0);
        //Then
        Assert.assertEquals(4, addResult, 0);
        Assert.assertEquals(2, subResult, 0);
        Assert.assertEquals(9, mulResult, 0);
        Assert.assertEquals(3, divResult, 0);
        Assert.assertEquals(Double.NaN, divZeroResult, 0);
    }
}
