package com.rc.cars.model.sub;

import com.rc.cars.model.base.AbstractRCCar;
import com.rc.cars.model.base.AbstractRCUpgrades;

import java.math.BigDecimal;

public class KnobbyTireOption extends AbstractRCUpgrades {

    public KnobbyTireOption(AbstractRCCar car) {
        super(car);
    }

    @Override
    public BigDecimal getOptionalAmount() {
        return BigDecimal.valueOf(34.97);
    }

    @Override
    public String getOptionName() {
        return "Knobby Tires Upgrade";
    }

    @Override
    public String toString() {
        return upgradedCar.toString();
    }
}
