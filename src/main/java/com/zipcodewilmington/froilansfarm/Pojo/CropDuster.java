package com.zipcodewilmington.froilansfarm.Pojo;

import com.zipcodewilmington.froilansfarm.Interfaces.Aircraft;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.FarmVehicle;
import com.zipcodewilmington.froilansfarm.Interfaces.Rider;

public class CropDuster extends Vehicle implements FarmVehicle, Aircraft {
    String planeSound = "\nnnneeaoowww";
    Boolean isFlying;

    public CropDuster() {
        isFlying = false;
    }


    public void fly() {
        isFlying = true;

    }

    public String engineNoise() {
        return super.makenoise();
    }

    public String makenoise() {
        return planeSound;
    }

    public void land() {
        isFlying = false;
    }

    public Boolean getIsFlying() {
        return isFlying;
    }

    public void fertiilizes(Field field) {
        if(isFlying == true && isOn == true && hasRider == true && isMoving == true) {
            field.fertilize();
        }
    }

    public void addRider(Pilot theRider){
        hasRider = true;
        rider = theRider;
    }

    @Override
    public String toString() {
        return "Crop Duster";
    }

    @Override
    public void makeNoiseIT() {
        System.out.println(makenoise());
    }
}
