package com.zipcodewilmington.froilansfarm.Pojo;

import com.zipcodewilmington.froilansfarm.Interfaces.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.Interfaces.Rider;

abstract class Vehicle implements NoiseMaker, Rideable {
    String engineSound = "vooRRRR, vooRRR, vooRRR";
    Boolean isOn = false;
    Boolean hasRider = false;
    Boolean isMoving = false;
    Rider rider = null;



    public String makenoise(){
        return engineSound;
    }


    public void ride(){
        isMoving = true;
    }

    public void stopRiding(){
        isMoving = false;
    }

    public Boolean getIsMoving(){
        return isMoving;
    }

    public void turnOn(){
        isOn = true;
    }

    public void turnOff(){
        isOn =false;
    }

    public Boolean getIsOn(){
        return isOn;
    }


    public void mountVehicle(){
        hasRider = true;

    }

    public void dismountVehicle(){
        hasRider = false;

    }

    public Boolean getHasRider(){
        return hasRider;
    }

    public void removeRider(){
        hasRider = false;
        rider = null;
    }

    public Rider getRider(){
        return rider;
    }






}
