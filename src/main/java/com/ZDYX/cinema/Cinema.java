package com.ZDYX.cinema;

public class Cinema {
    public Double getPriceFor(int numberOfTicket) {
        //get price for one ticket
        if (numberOfTicket == 1) {
            return 30D;
        }
        //get price for two ticket
        else {
            return 60D;
        }
    }

    public Double getPriceFor(int numberOfTicket, String movieType) {
        if (numberOfTicket == 2) {
            //get price for 2D movie
            if ("2D".equals(movieType)) {
                return 60D;
            }
            //get price for 3D movie
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
            //get price for cash payment
            if ("cash".equals(card)) {
                if ("2D".equals(movieType)) {
                    return 60D;
                }
                return 120D;
            }
            //get price for card payment
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
