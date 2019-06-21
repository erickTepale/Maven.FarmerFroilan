package com.zipcodewilmington.froilansfarm.Pojo;

import com.zipcodewilmington.froilansfarm.Interfaces.FarmVehicle;
import com.zipcodewilmington.froilansfarm.Interfaces.Rider;

public class Tractor extends Vehicle implements FarmVehicle {
    String tractorNoise = "puhVRooPuhHoo puhVROOpuhHOO";




    public Tractor(){

    }

    public String makenoise() {

        return tractorNoise;
    }

    public String engineNoise() {
        return super.makenoise();
    }


    public void harvest(Field field) {
        if (isOn == true && hasRider == true && isMoving == true) {
            field.harvestField();
        }
    }


    public void addRider(Rider theRider){
        rider = theRider;
    }





}
