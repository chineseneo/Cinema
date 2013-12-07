package com.ZDYX.cinema;

public class Cinema {
    private static final double UNIT_PRICE_2D = 30D;
    public static final double UNIT_PRICE_3D = 60D;
    public static final double DISCOUNT_FOR_CARD = 0.8;
    public static final String MOVIE_TYPE_2D = "2D";
    public static final String PAYMENT_TYPE_CASH = "cash";
    public static final int DISCOUNT_FOR_CASH = 1;

    public Double getPriceFor2DMovieAndCashPayment(int numberOfTicket) {
        return getPrice(numberOfTicket, "2D", "cash");
    }

    public Double getPriceForCashPayment(int numberOfTicket, String movieType) {
        return getPrice(numberOfTicket, movieType, "cash");
    }

    public Double getPrice(int numberOfTicket, String movieType, String card) {
        return getUnitPrice(movieType) * getDiscount(card) * numberOfTicket;
    }

    private double getUnitPrice(String movieType) {
        return MOVIE_TYPE_2D.equals(movieType)? UNIT_PRICE_2D: UNIT_PRICE_3D;
    }

    private double getDiscount(String paymentType) {
        return PAYMENT_TYPE_CASH.equals(paymentType)? DISCOUNT_FOR_CASH: DISCOUNT_FOR_CARD;
    }
}
