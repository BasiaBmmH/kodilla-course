package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CalculatorTestSuite {

    @Test
    void testCalculations() {
        // Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.calculator");
        Calculator calculator = context.getBean(Calculator.class);

        // When
        double additionResult = calculator.add(10, 5);
        double subtractionResult = calculator.sub(10, 5);
        double multiplicationResult = calculator.mul(10, 5);
        double divisionResult = calculator.div(10, 5);

        // Then
        assertEquals(15, additionResult);
        assertEquals(5, subtractionResult);
        assertEquals(50, multiplicationResult, 0.01);
        assertEquals(2, divisionResult, 0.1);
    }
}
