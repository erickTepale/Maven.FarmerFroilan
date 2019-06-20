package com.zipcodewilmington.froilansfarm.Pojo;

import com.zipcodewilmington.froilansfarm.Interfaces.Aircraft;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.FarmVehicle;
import com.zipcodewilmington.froilansfarm.Interfaces.Rider;

public class CropDuster extends Vehicle implements FarmVehicle, Aircraft {
    String planeSound = "nnneeaoowww";
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

    public void fertiilizes(CropRow cropRow) {
//        if(isFlying == true && isOn == true && hasRider == true && isMoving == true) {
//            cropRow.fertilize();
//        }
    }

    public void addRider(Pilot theRider){
        hasRider = true;
        rider = theRider;
    }







}
