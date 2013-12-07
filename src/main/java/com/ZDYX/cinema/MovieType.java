package com.ZDYX.cinema;

import java.util.HashMap;

public class MovieType {
    private static HashMap<String, Double> unitPriceList = new HashMap<String, Double>();

    static {
        unitPriceList.put("2D", 30D);
        unitPriceList.put("3D", 60D);
    }

    public double getUnitPrice(String movieType) {
        return unitPriceList.get(movieType);
    }
}
