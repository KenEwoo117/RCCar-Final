package com.rc.cars.model.sub;

import com.rc.cars.model.base.AbstractStreetCar;

import java.math.BigDecimal;

public class Sport extends AbstractStreetCar {

    public Sport() {

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
        return "Sport Car";
    }
}
