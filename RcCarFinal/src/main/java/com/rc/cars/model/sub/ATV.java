package com.rc.cars.model.sub;

import com.rc.cars.model.base.AbstractOffRoad;

import java.math.BigDecimal;

public class ATV extends AbstractOffRoad {

    public ATV() {

    }

    @Override
    public BigDecimal getSaleValue() {
        return BigDecimal.valueOf(99.99);
    }

    @Override
    public String getUPC() {
        return "113342";
    }

    @Override
    public int getStartingNumber() {
        return 8488;
    }

    @Override
    public String getModelNumber() {
        return "ORAT2400";
    }

    @Override
    public String toString() {
        return "ATV";
    }
}
