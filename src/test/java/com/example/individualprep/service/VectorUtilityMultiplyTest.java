package com.example.individualprep.service;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

class VectorUtilityMultiplyTest {

    @Test
    void testMultiplyPositiveScalar() {
        VectorUtility utils = new VectorUtility();
        double[] vector = {1.0, 2.0, 3.0};
        int scalar = 2;
        double[] expected = {2.0, 4.0, 6.0};

        assertArrayEquals(expected, utils.multiply(vector, scalar), "Setiap elemen vektor harus dikali 2");
    }

    @Test
    void testMultiplyNegativeScalar() {
        VectorUtility utils = new VectorUtility();
        double[] vector = {2.0, -4.0, 6.0};
        int scalar = -1;
        double[] expected = {-2.0, 4.0, -6.0};

        assertArrayEquals(expected, utils.multiply(vector, scalar), "Setiap elemen vektor harus dikali -1");
    }

    @Test
    void testMultiplyZeroScalar() {
        VectorUtility utils = new VectorUtility();
        double[] vector = {5.5, 10.0, 15.2};
        int scalar = 0;
        double[] expected = {0.0, 0.0, 0.0};

        assertArrayEquals(expected, utils.multiply(vector, scalar), "Dikalikan 0 harus menghasilkan vektor nol");
    }

    @Test
    void testMultiplyEmptyVector() {
        VectorUtility utils = new VectorUtility();
        double[] vector = {};
        int scalar = 5;
        double[] expected = {};

        assertArrayEquals(expected, utils.multiply(vector, scalar), "Vektor kosong dikali skalar harus tetap kosong");
    }
}