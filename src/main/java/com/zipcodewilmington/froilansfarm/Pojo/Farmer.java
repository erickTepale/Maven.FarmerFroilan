package com.zipcodewilmington.froilansfarm.Pojo;

import com.zipcodewilmington.froilansfarm.Interfaces.*;

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

    public void plant(Crop crop, CropRow cropRow) {
        cropRow.add(crop);
    }

    public void mount(Rideable rideable) {
        if (rideable instanceof Vehicle) {
            ((Vehicle)rideable).mountVehicle();
        } else if (rideable instanceof Horse) {
            ((Horse)rideable).mountThis(this);
        }
    }

    public void dismount(Rideable rideable) {
        if(rideable instanceof Vehicle) {
            ((Vehicle)rideable).dismountVehicle();
        } else if (rideable instanceof Horse) {
            ((Horse)rideable).getOffThis();

        }
    }

    public void operate(Rideable rideable) {
        rideable.ride();
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
    public void harvestAllCropRows() {
        Tractor rideable = farm.getTractor();
        rideable.harvest(farm.getField());
    }

    public String makenoise() {
        return "Farmer shouting!!";
    }

}
