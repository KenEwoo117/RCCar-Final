package com.cars.model.sub;

import com.cars.model.base.AbstractRc;
import com.cars.model.base.AbstractRcUpgrades;

import java.math.BigDecimal;

public class KnobbyTiresUpgrade extends AbstractRcUpgrades {

    public KnobbyTiresUpgrade(AbstractRc car) {
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
