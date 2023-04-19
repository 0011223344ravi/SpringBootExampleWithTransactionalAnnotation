package com.example.springboottransactional.util;

import com.example.springboottransactional.exception.InsufficientAmountException;

import java.util.HashMap;
import java.util.Map;

public class CommonUtil {

    private static Map<Long, Double> paymentMap = new HashMap<>();

    static {
        paymentMap.put(1L, 12000.0);
        paymentMap.put(2L, 10000.0);
        paymentMap.put(3L, 5000.0);
        paymentMap.put(4L, 8000.0);
    }


    public static boolean validateCreditLimit(Long paymentId, double paidAmount) {
        if (paidAmount > paymentMap.get(paymentId)) {
            throw new InsufficientAmountException("insufficient fund..!");
        } else {
            return true;
        }
    }
}
