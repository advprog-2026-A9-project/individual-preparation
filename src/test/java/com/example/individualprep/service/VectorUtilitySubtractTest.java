package com.example.individualprep.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class VectorUtilitySubtractTest {
    private VectorUtility vectorUtility;

    @BeforeEach
    void setUp() {
        vectorUtility = new VectorUtility();
    }

    @Test
    void subtractTwoPositiveVectors() {
        double[] vector1 = { 5.00, 3.00 };
        double[] vector2 = { 2.00, 1.00 };
        double[] hasil = { 3.00, 2.00 };

        assertArrayEquals(hasil, vectorUtility.subtract(vector1, vector2), 0.0001);
    }

    @Test
    void subtractTwoNegativeVectors() {
        double[] vector1 = { -5.00, -3.00 };
        double[] vector2 = { -2.00, -1.00 };
        double[] hasil = { -3.00, -2.00 };

        assertArrayEquals(hasil, vectorUtility.subtract(vector1, vector2), 0.0001);
    }

    @Test
    void subtractWithZeroVectors() {
        double[] vector1 = { -5.00, -3.00 };
        double[] vector2 = { 0.00, 0.00 };
        double[] hasil = { -5.00, -3.00 };

        assertArrayEquals(hasil, vectorUtility.subtract(vector1, vector2), 0.0001);
    }

    @Test
    void subtractDifferentLengthVectorsShouldThrowException() {
        double[] vector1 = { -5.00, -3.00 };
        double[] vector2 = { -2.00, -1.00, -12000.00 };

        assertThrows(IllegalArgumentException.class, () -> {
            vectorUtility.subtract(vector1, vector2);
        });
    }
}