package com.zipcodewilmington.froilansfarm.Pojo;

import com.zipcodewilmington.froilansfarm.Interfaces.Botanist;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.Interfaces.Rider;

<<<<<<< HEAD
public class Farmer extends Person implements Botanist {

    public void plant(Crop crop) {

    }

    public void mount(Rideable rideable) {
=======
import java.util.List;

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

>>>>>>> Implementation Updates

    }

    public void dismount(Rideable rideable) {

    }

    public void operate(Rideable rideable) {
<<<<<<< HEAD

    }

    public void eat(Edible edible) {
        //Storage.getInstance().removeEdible(edible);
=======

>>>>>>> Implementation Updates
    }

    public String makenoise() {
        return null;
    }

}
