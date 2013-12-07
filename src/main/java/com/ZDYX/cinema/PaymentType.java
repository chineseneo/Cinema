package com.ZDYX.cinema;

public class PaymentType {
    public static final double DISCOUNT_FOR_CARD = 0.8;
    public static final String PAYMENT_TYPE_CASH = "cash";
    public static final int DISCOUNT_FOR_CASH = 1;

    public double getDiscount(String paymentType) {
        return PAYMENT_TYPE_CASH.equals(paymentType)? DISCOUNT_FOR_CASH: DISCOUNT_FOR_CARD;
    }
}
