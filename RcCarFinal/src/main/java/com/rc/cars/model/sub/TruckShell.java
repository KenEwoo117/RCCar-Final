package com.rc.cars.model.sub;

import com.rc.cars.model.base.AbstractRCCar;
import com.rc.cars.model.base.AbstractRCUpgrades;

import java.math.BigDecimal;

public class TruckShell extends AbstractRCUpgrades {

    public TruckShell(AbstractRCCar car) {
        super(car);
    }

    @Override
    public BigDecimal getOptionalAmount() {
        return BigDecimal.valueOf(70.99);
    }

    @Override
    public String getOptionName() {
        return "Truck Shell Upgrade";
    }

    @Override
    public String toString() {
        return upgradedCar.toString();
    }
}
