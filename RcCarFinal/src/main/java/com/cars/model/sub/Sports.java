package com.cars.model.sub;

import com.cars.model.base.AbstractStreet;

import java.math.BigDecimal;

public class Sports extends AbstractStreet {

    public Sports() {

    }
    @Override

    public BigDecimal getSaleValue() {
        return BigDecimal.valueOf(150.99);
    }

    @Override
    public String getUPC() {
        return "357901";
    }

    @Override
    public int getStartingNumber() {
        return 9753;
    }

    @Override
    public String getModelNumber() {
        return "SPT2019";
    }

    @Override
    public String toString() {
        return "Sports Car";
    }
}
