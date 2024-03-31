package com.cars.model.base;

import com.cars.model.impl.forSale;

import java.math.BigDecimal;

public abstract class AbstractRc implements forSale {


private String modelNumber;


public abstract BigDecimal getSaleValue();
public abstract String getUPC();
public abstract String getWheelType();
public abstract int getStartingNumber();



public void setModelNumber(String modelNumber) {
    this.modelNumber = modelNumber;
}

public String getModelNumber() {return modelNumber;}

public BigDecimal getOptionalAmount() {
    return BigDecimal.valueOf(0.0);
}

public String getOptionName() {
    return "";
}

}
