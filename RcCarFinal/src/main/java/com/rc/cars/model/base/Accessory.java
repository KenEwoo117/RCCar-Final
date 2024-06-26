package com.rc.cars.model.base;

import com.rc.cars.model.impl.forSale;

import java.math.BigDecimal;

public class Accessory implements forSale {

    private final BigDecimal price;
    private final String name;

    public Accessory(String itemName, BigDecimal price) {
        name = itemName;
        this.price = price;
    }

    @Override
    public BigDecimal getSaleValue() {
        return price;
    }

    public String getItemName() {return name;}
}
