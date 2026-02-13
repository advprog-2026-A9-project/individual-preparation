package com.example.individualprep.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class VectorUtilityNormTest {

    private VectorUtility vectorUtility;

    @BeforeEach
    void setUp() {
        vectorUtility = new VectorUtility();
    }

    @Test
    void testNormWithPositiveValues() {
        double[] v = {3, 4};
        double result = vectorUtility.norm(v);

        assertEquals(5.0, result, 0.0001);
    }

    @Test
    void testNormWithZeroVector() {
        double[] v = {0, 0, 0};
        double result = vectorUtility.norm(v);

        assertEquals(0.0, result, 0.0001);
    }

    @Test
    void testNormWithNegativeValues() {
        double[] v = {-3, -4};
        double result = vectorUtility.norm(v);

        assertEquals(5.0, result, 0.0001);
    }

    @Test
    void testNormWithMixedValues() {
        double[] v = {1, 2, 2};
        double result = vectorUtility.norm(v);

        assertEquals(3.0, result, 0.0001);
    }

    @Test
    void testNormWithEmptyArray() {
        double[] v = {};
        double result = vectorUtility.norm(v);

        assertEquals(0.0, result, 0.0001);
    }

    @Test
    void testNormWithNullArray() {
        assertThrows(NullPointerException.class, () -> {
            vectorUtility.norm(null);
        });
    }
}
