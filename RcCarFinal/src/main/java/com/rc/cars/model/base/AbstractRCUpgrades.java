package com.rc.cars.model.base;

import java.math.BigDecimal;

public abstract class AbstractRCUpgrades extends AbstractRCCar {

    protected AbstractRCCar upgradedCar;

    public AbstractRCUpgrades(AbstractRCCar car) {
        upgradedCar = car;
    }

    @Override
    public BigDecimal getSaleValue() {
        return upgradedCar.getSaleValue();
    }

    @Override
    public String getUPC() {
        return upgradedCar.getUPC();
    }

    @Override
    public String getWheelType() {
        return upgradedCar.getWheelType();
    }

    @Override
    public int getStartingNumber() {
        return upgradedCar.getStartingNumber();
    }

    @Override
    public String getModelNumber() {
        return upgradedCar.getModelNumber();
    }
}
