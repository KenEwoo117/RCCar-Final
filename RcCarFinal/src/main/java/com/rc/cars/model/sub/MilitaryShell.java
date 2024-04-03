package com.rc.cars.model.sub;

import com.rc.cars.model.base.AbstractRCCar;
import com.rc.cars.model.base.AbstractRCUpgrades;

import java.math.BigDecimal;

public class MilitaryShell extends AbstractRCUpgrades {

    public MilitaryShell(AbstractRCCar car) {
        super(car);
    }

    @Override
    public BigDecimal getOptionalAmount() {
        return BigDecimal.valueOf(85.99);
    }

    @Override
    public String getOptionName() {
        return "Military Shell Upgrade";
    }

    @Override
    public String toString() {
        return upgradedCar.toString();
    }


}
