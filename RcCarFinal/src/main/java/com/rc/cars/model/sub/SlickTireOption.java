package com.rc.cars.model.sub;

import com.rc.cars.model.base.AbstractRCCar;
import com.rc.cars.model.base.AbstractRCUpgrades;

import java.math.BigDecimal;

public class SlickTireOption extends AbstractRCUpgrades {

    public SlickTireOption(AbstractRCCar car) {
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
