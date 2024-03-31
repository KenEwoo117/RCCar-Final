package com.cars.model.sub;

import com.cars.model.base.AbstractRc;
import com.cars.model.base.AbstractRcUpgrades;

import java.math.BigDecimal;

public class SlickTiresUpgrade extends AbstractRcUpgrades {

    public SlickTiresUpgrade(AbstractRc car) {
        super(car);
    }

    @Override
    public BigDecimal getOptionalAmount() {
        return BigDecimal.valueOf(24.99);
    }

    @Override
    public String getOptionName() {
        return "Slick Tires Upgrade";
    }

    @Override
    public String toString() {
        return upgradedCar.toString();
    }

}
