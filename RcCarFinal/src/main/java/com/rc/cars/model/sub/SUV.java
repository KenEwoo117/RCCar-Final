package com.rc.cars.model.sub;

import com.rc.cars.model.base.AbstractStreetCar;

import java.math.BigDecimal;

public class SUV extends AbstractStreetCar {

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
