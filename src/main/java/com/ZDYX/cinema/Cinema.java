package com.ZDYX.cinema;

public class Cinema {
    public Double getPriceFor(int numberOfTicket) {
        if (numberOfTicket == 1) {
            return 30D;
        }
        else {
            return 60D;
        }
    }

    public Double getPriceFor(int numberOfTicket, String movieType) {
        if (numberOfTicket == 2) {
            if ("2D".equals(movieType)) {
                return 60D;
            }
            return 120D;
        }
        else {
            if ("2D".equals(movieType)) {
                return 30D;
            }
            return 60D;
        }
    }

    public Double getPriceFor(int numberOfTicket, String movieType, String card) {
        if (numberOfTicket == 2) {
            if ("cash".equals(card)) {
                if ("2D".equals(movieType)) {
                    return 60D;
                }
                return 120D;
            }
            if ("2D".equals(movieType)) {
                return 48D;
            }
            return 96D;
        }
        if ("cash".equals(card)) {
            if ("2D".equals(movieType)) {
                return 30D;
            }
            return 60D;
        }
        if ("2D".equals(movieType)) {
            return 24D;
        }
        return 48D;
    }
}
