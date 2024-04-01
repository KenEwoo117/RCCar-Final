package com.cars.controller;

import com.cars.model.base.AbstractRc;
import com.cars.model.sub.SUV;
import com.cars.model.sub.Classic;
import com.cars.model.sub.Sports;
import com.cars.model.sub.Crawler;
import com.cars.model.sub.DuneBuggy;
import com.cars.model.sub.ATV;


import java.util.ArrayList;
import java.util.function.Supplier;

public class InventoryGenerator {
    private final ArrayList<AbstractRc> sportsCarList = new ArrayList<>();
    private final ArrayList<AbstractRc> suvList = new ArrayList<>();
    private final ArrayList<AbstractRc> classicCarList = new ArrayList<>();
    private final ArrayList<AbstractRc> atvList = new ArrayList<>();
    private final ArrayList<AbstractRc> crawlerList = new ArrayList<>();
    private final ArrayList<AbstractRc> duneBuggyList = new ArrayList<>();
    private final SerialNumberGenerator generator;


    public InventoryGenerator() {
        generator = SerialNumberGenerator.getInstance();
        buildRcInventory(sportsCarList, () -> new Sports());
        buildRcInventory(classicCarList,() -> new Classic());
        buildRcInventory(suvList,() -> new SUV());
        buildRcInventory(atvList,() -> new ATV());
        buildRcInventory(crawlerList,() -> new Crawler());
        buildRcInventory(duneBuggyList,() -> new DuneBuggy());
    }

    public InventoryGenerator(SerialNumberGenerator generator) {
        this.generator = generator;
    }

    public ArrayList<AbstractRc> getSuvList(){
        return suvList;
    }

    public ArrayList<AbstractRc> getSportsCarList() {
        return sportsCarList;
    }

    public ArrayList<AbstractRc> getClassicCarList() {
        return classicCarList;
    }

    public ArrayList<AbstractRc> getAtvList() {
        return atvList;
    }

    public ArrayList<AbstractRc> getCrawlerList() {
        return crawlerList;
    }

    public ArrayList<AbstractRc> getDuneBuggyList() {
        return duneBuggyList;
    }

    private void buildRcInventory(ArrayList<AbstractRc> carList, Supplier<AbstractRc> carSupply) {
        generator.startGeneration(carSupply.get().getUPC(),carSupply.get().getStartingNumber(),carSupply.get().getModelNumber());

        for (int i = 0; i < 100 ; i++) {
            AbstractRc car = carSupply.get();
            car.setSerialNumber(generator.getNextSerial());
            carList.add(i,car);
        }
    }
}