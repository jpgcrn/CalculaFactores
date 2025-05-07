package com.crngetafe.utils;

import java.util.ArrayList;
import java.util.List;

public class Factores {
    public static List<Integer> getFactors(int num) throws IllegalArgumentException {
        List<Integer> retVal = new ArrayList<Integer>();
        if (num <= 0 || num > 100) {
            throw new IllegalArgumentException("El número debe ser mayor que 0 y menor que 100.");
        } else {
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    retVal.add(i);
                }
            }
        }
        return retVal;
    }
}
