package com.ZDYX.cinema;

public class Cinema {
    public Double getPriceFor(int numberOfTicket) {
        return 30D * numberOfTicket;
    }

    public Double getPriceFor(int numberOfTicket, String movieType) {
        if ("2D".equals(movieType)) {
            return 30D * numberOfTicket;
        }
        return 60D * numberOfTicket;
    }

    public Double getPriceFor(int numberOfTicket, String movieType, String card) {
        if ("cash".equals(card)) {
            if ("2D".equals(movieType)) {
                return 30D * numberOfTicket;
            }
            return 60D * numberOfTicket;
        }
        if ("2D".equals(movieType)) {
            return 24D * numberOfTicket;
        }
        return 48D * numberOfTicket;
    }
}
