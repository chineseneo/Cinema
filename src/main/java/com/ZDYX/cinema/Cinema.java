package com.ZDYX.cinema;

public class Cinema {
    private static final double UNIT_PRICE_2D = 30D;
    public static final double UNIT_PRICE_3D = 60D;
    public static final double DISCOUNT_FOR_CARD = 0.8;
    public static final String MOVIE_TYPE_2D = "2D";
    public static final String PAYMENT_TYPE_CASH = "cash";

    public Double getPriceFor2DMovieAndCashPayment(int numberOfTicket) {
        return getPrice(numberOfTicket, "2D", "cash");
    }

    public Double getPriceForCashPayment(int numberOfTicket, String movieType) {
        return getPrice(numberOfTicket, movieType, "cash");
    }

    public Double getPrice(int numberOfTicket, String movieType, String card) {
        if (PAYMENT_TYPE_CASH.equals(card)) {
            if (MOVIE_TYPE_2D.equals(movieType)) {
                return UNIT_PRICE_2D * numberOfTicket;
            }
            return UNIT_PRICE_3D * numberOfTicket;
        }
        if (MOVIE_TYPE_2D.equals(movieType)) {
            return UNIT_PRICE_2D * DISCOUNT_FOR_CARD * numberOfTicket;
        }
        return UNIT_PRICE_3D * DISCOUNT_FOR_CARD * numberOfTicket;
    }
}
