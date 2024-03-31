package com.cars.model.sub;

import com.cars.model.base.AbstractRc;
import com.cars.model.base.AbstractRcUpgrades;

import java.math.BigDecimal;

public class MilitaryShellUpgrade extends AbstractRcUpgrades {

    public MilitaryShellUpgrade(AbstractRc car) {
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
