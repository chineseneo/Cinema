package com.ZDYX.cinema;

import java.util.HashMap;

public class PaymentType {
    private static HashMap<String, Double> discountList = new HashMap<String, Double>();

    static {
        discountList.put("cash", 1.0D);
        discountList.put("card", 0.8D);
    }

    public double getDiscount(String paymentType) {
        return discountList.get(paymentType);
    }
}
