package com.example.individualprep.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ArithmeticUtilityDivideTest {

    private ArithmeticUtility arithmeticUtility;

    @BeforeEach
    void setUp() {
        arithmeticUtility = new ArithmeticUtility();
    }

    @Test
    void divideTwoPositiveNumbers() {
        assertEquals(10, arithmeticUtility.divide(100, 10));
    }

    @Test
    void divideTwoNegativeNumbers() {
        assertEquals(10, arithmeticUtility.divide(-100, -10));
    }

    @Test
    void dividePositiveByNegativeNumber() {
        assertEquals(-20, arithmeticUtility.divide(100, -5));
    }

    @Test
    void divideNegativeByPositiveNumber() {
        assertEquals(-20, arithmeticUtility.divide(-100, 5));
    }

    @Test
    void divideNumberByZero() {
        assertThrows(IllegalArgumentException.class, () -> arithmeticUtility.divide(100, 0));
    }

}