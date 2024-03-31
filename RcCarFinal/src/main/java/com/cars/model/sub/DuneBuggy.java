package com.cars.model.sub;

import com.cars.model.base.AbstractOffRoad;

import java.math.BigDecimal;

public class DuneBuggy extends AbstractOffRoad{

    public DuneBuggy() {

    }

    @Override
    public BigDecimal getSaleValue() {
        return BigDecimal.valueOf(200.99);
    }

    @Override
    public String getUPC() {
        return "885532";
    }

    @Override
    public int getStartingNumber() {
        return 7446;
    }

    @Override
    public String toString() {
        return "DuneBuggy";
    }
}
