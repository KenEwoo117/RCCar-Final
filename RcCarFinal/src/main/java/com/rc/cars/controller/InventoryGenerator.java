package com.rc.cars.controller;

import com.rc.cars.model.base.AbstractRCCar;
import com.rc.cars.model.sub.*;
import com.rc.cars.model.sub.DuneBuggy;


import java.util.ArrayList;
import java.util.function.Supplier;

public class InventoryGenerator {
    private final ArrayList<AbstractRCCar> sportsCarList = new ArrayList<>();
    private final ArrayList<AbstractRCCar> SUVList = new ArrayList<>();
    private final ArrayList<AbstractRCCar> classicList = new ArrayList<>();
    private final ArrayList<AbstractRCCar> ATVList = new ArrayList<>();
    private final ArrayList<AbstractRCCar> crawlerList = new ArrayList<>();
    private final ArrayList<AbstractRCCar> duneBuggyList = new ArrayList<>();
    private final SerialNumberGenerator generator;


    public InventoryGenerator() {
        generator = SerialNumberGenerator.getInstance();
        buildRcInventory(sportsCarList, () -> new Sport());
        buildRcInventory(classicList,() -> new Classic());
        buildRcInventory(SUVList,() -> new SUV());
        buildRcInventory(ATVList,() -> new ATV());
        buildRcInventory(crawlerList,() -> new Crawler());
        buildRcInventory(duneBuggyList,() -> new DuneBuggy());
    }

    public InventoryGenerator(SerialNumberGenerator generator) {
        this.generator = generator;
    }

    public ArrayList<AbstractRCCar> getSUVList(){
        return SUVList;
    }

    public ArrayList<AbstractRCCar> getSportList() {
        return sportsCarList;
    }

    public ArrayList<AbstractRCCar> getClassicList() {
        return classicList;
    }

    public ArrayList<AbstractRCCar> getATVList() {
        return ATVList;
    }

    public ArrayList<AbstractRCCar> getCrawlerList() {
        return crawlerList;
    }

    public ArrayList<AbstractRCCar> getDuneBuggyList() {
        return duneBuggyList;
    }

    private void buildRcInventory(ArrayList<AbstractRCCar> carList, Supplier<AbstractRCCar> carSupply) {
        generator.startGeneration(carSupply.get().getUPC(),carSupply.get().getStartingNumber(),carSupply.get().getModelNumber());

        for (int i = 0; i < 100 ; i++) {
            AbstractRCCar car = carSupply.get();
            car.setSerialNumber(generator.getNextSerial());
            carList.add(i,car);
        }
    }
}