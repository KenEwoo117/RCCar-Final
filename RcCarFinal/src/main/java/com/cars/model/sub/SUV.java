package com.cars.model.sub;

import com.cars.model.base.AbstractOffRoad;
import com.cars.model.base.AbstractOnRoad;

import java.math.BigDecimal;

public class SUV extends AbstractOnRoad {

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
    public String toString() {
        return "SUV";
    }
}
