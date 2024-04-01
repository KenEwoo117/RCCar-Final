package com.cars.model.base;

import com.cars.model.impl.forSale;

import java.math.BigDecimal;

public abstract class AbstractRc implements forSale {


private String serialNumber;


public abstract BigDecimal getSaleValue();
public abstract String getUPC();
public abstract String getWheelType();
public abstract int getStartingNumber();
public abstract String getModelNumber();



public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
}

public String getSerialNumber() {return serialNumber;}

public BigDecimal getOptionalAmount() {
    return BigDecimal.valueOf(0.0);
}

public String getOptionName() {
    return "";
}

}
