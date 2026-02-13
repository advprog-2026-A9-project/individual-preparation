package com.example.individualprep.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class ArithmeticUtilityMultiplyTest {

    @Test
    void testMultiplyPositiveNumbers() {
        ArithmeticUtility utils = new ArithmeticUtility();
        double result = utils.multiply(5, 4);
        assertEquals(20, result, "Perkalian 5 * 4 harus menghasilkan 20");
    }

    @Test
    void testMultiplyNegativeNumber() {
        ArithmeticUtility utils = new ArithmeticUtility();
        double result = utils.multiply(-5, 4);
        assertEquals(-20, result, "Perkalian -5 * 4 harus menghasilkan -20");
    }

    @Test
    void testMultiplyTwoNegativeNumbers() {
        ArithmeticUtility utils = new ArithmeticUtility();
        double result = utils.multiply(-5, -5);
        assertEquals(25, result, "Perkalian -5 * -5 harus menghasilkan 25");
    }

    @Test
    void testMultiplyWithZero() {
        ArithmeticUtility utils = new ArithmeticUtility();
        double result = utils.multiply(10, 0);
        assertEquals(0, result, "Perkalian dengan 0 harus menghasilkan 0");
    }
}