package com.ZDYX.cinema;

public class ShouPiaoChu {

    public Double getPriceFor2DMovieAndCashPayment(int numberOfTicket) {
        return getPrice(numberOfTicket, "2D", "cash");
    }

    public Double getPriceForCashPayment(int numberOfTicket, String movieType) {
        return getPrice(numberOfTicket, movieType, "cash");
    }

    public Double getPrice(int numberOfTicket, String movieType, String card) {
        return new MovieType().getUnitPrice(movieType) * new PaymentType().getDiscount(card) * numberOfTicket;
    }
}
