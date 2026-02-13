package com.example.individualprep.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArithmeticUtilitySubtractTest {

    private ArithmeticUtility arithmeticUtility;

    @BeforeEach
    void setUp() {
        arithmeticUtility = new ArithmeticUtility();
    }

    @Test
    @DisplayName("Should return the first number when subtracting zero")
    void subtractZero() {
        assertEquals(55.5, arithmeticUtility.subtract(55.5, 0));
    }

    @Test
    @DisplayName("Should return a negative result when subtracting a larger number from a smaller one")
    void subtractLargerFromSmaller() {
        assertEquals(-50, arithmeticUtility.subtract(50, 100));
    }

    @Test
    @DisplayName("Should result in zero when subtracting a number from itself")
    void subtractNumberFromItself() {
        assertEquals(0, arithmeticUtility.subtract(123.45, 123.45));
    }

    @ParameterizedTest
    @CsvSource({
            "100, 10, 90",      // Positive - Positive
            "-100, -10, -90",   // Negative - Negative
            "100, -50, 150",    // Positive - Negative (Addition)
            "-100, 50, -150"    // Negative - Positive
    })
    @DisplayName("Parameterized test for subtraction sign logic")
    void subtractParameterized(double a, double b, double expected) {
        // Using delta for floating point precision
        assertEquals(expected, arithmeticUtility.subtract(a, b), 0.0001);
    }

    @Test
    @DisplayName("Should handle very large double values")
    void subtractLargeValues() {
        double result = arithmeticUtility.subtract(Double.MAX_VALUE, Double.MAX_VALUE);
        assertEquals(0, result);
    }
}