package com.cars.model.sub;

import com.cars.model.base.AbstractStreet;

import java.math.BigDecimal;

public class Classic extends AbstractStreet {

    public Classic() {

    }

    @Override
    public BigDecimal getSaleValue() {
        return BigDecimal.valueOf(197.99);
    }

    @Override
    public String getUPC() {
        return "315790";
    }

    @Override
    public int getStartingNumber() {
        return 7326;
    }

    @Override
    public String getModelNumber() {
        return "CLS4019";
    }

    @Override
    public String toString() {
        return "Classic Car";
    }
}
