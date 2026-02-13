package com.example.individualprep.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class VectorUtilityDotProductTest {

    private VectorUtility vectorUtility;

    @BeforeEach
    void setUp() {
        vectorUtility = new VectorUtility();
    }

    @Test
    @DisplayName("Should correctly calculate the dot product of two equal-length vectors")
    void dotProductStandardCase() {
        double[] v1 = {1.0, 3.0, -5.0};
        double[] v2 = {4.0, -2.0, -1.0};
        // (1*4) + (3*-2) + (-5*-1) = 4 - 6 + 5 = 3
        assertEquals(3.0, vectorUtility.dotProduct(v1, v2), 0.0001);
    }

    @Test
    @DisplayName("Should return zero for orthogonal vectors")
    void dotProductOrthogonal() {
        double[] v1 = {1.0, 0.0};
        double[] v2 = {0.0, 1.0};
        assertEquals(0.0, vectorUtility.dotProduct(v1, v2), 0.0001);
    }

    @Test
    @DisplayName("Should return zero if one vector is a zero vector")
    void dotProductWithZeroVector() {
        double[] v1 = {0.0, 0.0, 0.0};
        double[] v2 = {1.2, 3.4, 5.6};
        assertEquals(0.0, vectorUtility.dotProduct(v1, v2), 0.0001);
    }

    @Test
    @DisplayName("Should handle single-element vectors")
    void dotProductSingleElement() {
        double[] v1 = {5.0};
        double[] v2 = {2.0};
        assertEquals(10.0, vectorUtility.dotProduct(v1, v2));
    }


}