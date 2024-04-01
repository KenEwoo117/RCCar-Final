package com.cars.model.sub;

import com.cars.model.base.AbstractStreet;

import java.math.BigDecimal;

public class SUV extends AbstractStreet {

    public SUV() {

    }

    @Override
    public BigDecimal getSaleValue() {
        return BigDecimal.valueOf(210.99);
    }

    @Override
    public String getUPC() {
        return "642852";
    }

    @Override
    public int getStartingNumber() {
        return 8647;
    }

    @Override
    public String getModelNumber() {
        return "642852";
    }

    @Override
    public String toString() {
        return "SUV";
    }
}
