package com.zipcodewilmington.froilansfarm.Pojo;

import com.zipcodewilmington.froilansfarm.Interfaces.*;

import java.sql.SQLOutput;
import java.util.List;

public class Farmer extends Person implements Botanist, Rider {
    private Farm farm;

    public Farmer() {
        this.farm = Farm.getINSTANCE();
    }
    public Farmer(Farm farm) {
        this.farm = farm;
    }

    public Farm getFarm() {
        return this.farm;
    }

    public void setFarm(Farm farm) {
        this.farm = farm;
    }

    public void plant(Crop crop, CropRow cropRow, Integer integer) {
        for (int i = 0; i < integer ; i++) {
            cropRow.add(crop);
            printPlant(crop);
        }
    }

    public void mount(Rideable rideable) {
        if (rideable instanceof Vehicle) {
            ((Vehicle)rideable).mountVehicle();

        } else if (rideable instanceof Horse) {
            ((Horse)rideable).mountThis(this);
        }
        printMount(rideable);
    }

    public void dismount(Rideable rideable) {
        if(rideable instanceof Vehicle) {
            ((Vehicle)rideable).dismountVehicle();
        } else if (rideable instanceof Horse) {
            ((Horse)rideable).getOffThis();

        }

        printDismount(rideable);
    }

    public void operate(Rideable rideable) {
        rideable.ride();
        rideable.makeNoiseIT();
        printOperate(rideable);
    }

    public void rideAllHorses() {
        for (Stable stable : farm.getStables()) {
            for (Horse horse : stable.stable){
                mount(horse);
                operate(horse);
                dismount(horse);
            }
        }
    }

    public void feedAllHorses(Edible edible, Integer integer) {
        for (Stable stable : farm.getStables()) {
            for (Horse horse : stable.stable){
                horse.eat(edible, integer);
            }
        }
    }
    public void harvestAllCropRows() {
        Tractor rideable = farm.getTractor();
        rideable.harvest(farm.getField());
    }

    @Override
    public void eat(Edible edible, Integer integer) {
        super.eat(edible, integer);
        System.out.println("Farmer Ate " + integer + ": " + edible);
    }

    public String makenoise() {
        return "\nFarmer shouting!!";
    }


    private void printMount(Rideable mount){
        System.out.println("\nFroilen Mounted: "+ mount);
    }

    private void printPlant(Crop crop){
        System.out.println("\nFroilen Planted: " + crop);
    }

    private void printDismount(Rideable mount){
        System.out.println("\nFroilen Dismounted: " + mount);
    }
    private void printOperate(Rideable operate){
        System.out.println(makenoise());
        System.out.println("\nFroilen Operates: " + operate);
    }
}
