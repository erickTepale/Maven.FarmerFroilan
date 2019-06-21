package com.zipcodewilmington.froilansfarm.Pojo;

import com.zipcodewilmington.froilansfarm.Interfaces.Botanist;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.Interfaces.Rider;


public class Farmer extends Person implements Botanist {

    public void plant(Crop crop) {

    }

    public void mount(Rideable rideable) {

public class Farmer extends Person implements Botanist, Rider {
    private Farm farm;

    public Farmer() {
        this.farm = new Farm();
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


    }

    public void dismount(Rideable rideable) {

    }

    public void operate(Rideable rideable) {


        rideable.ride();
    }

    public void rideAllHorses() {
        for (Stable stable : farm.stable) {
            for (Horse horse : stable.stable){
                mount(horse);
                operate(horse);
                dismount(horse);
            }
        }
    }
    public void harvestAllCropRows() {
        Tractor rideable = farm.tractor;
        for(CropRow cropRow : farm.field.getCropRow()) {
            rideable.harvest(cropRow);
        }

    }

    public String makenoise() {
        return null;
    }

}
