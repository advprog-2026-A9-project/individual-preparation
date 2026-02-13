package com.example.individualprep.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArithmeticUtilityAddTest {

    private ArithmeticUtility arithmeticUtility;

    @BeforeEach
    void setUp() {
        arithmeticUtility = new ArithmeticUtility();
    }

    @Test
    void testAddPositiveNumbers() {
        assertEquals(7.0, arithmeticUtility.add(3.0, 4.0), 0.0001);
    }

    @Test
    void testAddNegativeNumbers() {
        assertEquals(-7.0, arithmeticUtility.add(-3.0, -4.0), 0.0001);
    }

    @Test
    void testAddMixedNumbers() {
        assertEquals(1.0, arithmeticUtility.add(-3.0, 4.0), 0.0001);
    }

    @Test
    void testAddWithZero() {
        assertEquals(5.0, arithmeticUtility.add(0.0, 5.0), 0.0001);
    }
}
