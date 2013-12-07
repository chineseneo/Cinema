package com.ZDYX.cinema;

public class MovieType {
    private static final double UNIT_PRICE_2D = 30D;
    public static final double UNIT_PRICE_3D = 60D;
    public static final String MOVIE_TYPE_2D = "2D";

    public double getUnitPrice(String movieType) {
        return MOVIE_TYPE_2D.equals(movieType)? UNIT_PRICE_2D: UNIT_PRICE_3D;
    }
}
