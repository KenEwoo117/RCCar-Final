package com.cars.model.sub;

import com.cars.model.base.AbstractOffRoad;

import java.math.BigDecimal;

public class Crawler extends AbstractOffRoad {

    public Crawler() {

    }

    @Override
    public BigDecimal getSaleValue() {
        return BigDecimal.valueOf(250.99);
    }

    @Override
    public String getUPC() {
        return "756643";
    }

    @Override
    public int getStartingNumber() {
        return 3398;
    }

    @Override
    public String getModelNumber() {
        return "ORCR4600";
    }

    @Override
    public String toString() {
        return "Crawler";
    }
}
