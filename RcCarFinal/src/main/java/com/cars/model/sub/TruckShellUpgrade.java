package com.cars.model.sub;

import com.cars.model.base.AbstractRc;
import com.cars.model.base.AbstractRcUpgrades;

import java.math.BigDecimal;

public class TruckShellUpgrade extends AbstractRcUpgrades {

    public TruckShellUpgrade(AbstractRc car) {
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
}
