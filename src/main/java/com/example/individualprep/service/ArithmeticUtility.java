package com.example.individualprep.service;

import org.springframework.stereotype.Service;

@Service
public class ArithmeticUtility {

    public double add(double o1, double o2) {

        return o1 + o2;

    }

    public double subtract(double o1, double o2) {
        return o1 - o2;
    }

    public double multiply(double o1, double o2) {
        return o1*o2;
    }

    public double divide(double o1, double o2) {
        if (o2 == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed");
        }
        return o1 / o2;
    }

    public double exponent(double o1, int n) {
        if (n == 0) {
            return 1.0;
        }

        if (n < 0) {
            if (o1 == 0.0) {
                throw new IllegalArgumentException("Base cannot be zero for negative exponent");
            }
            return 1.0 / exponent(o1, -n);
        }

        double result = 1.0;
        for (int i = 0; i < n; i++) {
            result *= o1;
        }

        return result;
    }

}
