package com.rc.cars.view;

import com.rc.cars.controller.InventoryGenerator;
import com.rc.cars.model.base.AbstractRCCar;
import com.rc.cars.model.base.Accessory;
import com.rc.cars.model.sub.KnobbyTireOption;
import com.rc.cars.model.sub.SlickTireOption;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Program {

    public static void main(String[] args){
        Order myOrder = new Order();
        myOrder.welcomeMessage();
    }

    public static void receiptTest(){
        ArrayList<AbstractRCCar> carList = new ArrayList<>();
        ArrayList<AbstractRCCar> customUpgradesList = new ArrayList<>();
        InventoryGenerator generator = new InventoryGenerator();

        carList.add(generator.getSUVList().get(0));
        carList.add(generator.getSportList().get(0));
        carList.add(generator.getClassicList().get(0));
        carList.add(generator.getATVList().get(0));
        carList.add(generator.getCrawlerList().get(0));
        AbstractRCCar custom = generator.getDuneBuggyList().get(1);
        custom = new KnobbyTireOption(custom);
        custom = new SlickTireOption(custom);
        carList.add(custom);
        customUpgradesList.add(custom);

        ArrayList<Accessory> accessories = new ArrayList<>();
        accessories.add(0, new Accessory("Chassis Converter Kit", BigDecimal.valueOf(39.99)));
        new Receipt(carList, customUpgradesList, accessories);
    }
}