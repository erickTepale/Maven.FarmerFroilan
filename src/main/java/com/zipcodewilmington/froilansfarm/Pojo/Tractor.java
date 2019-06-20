package com.zipcodewilmington.froilansfarm.Pojo;

import com.zipcodewilmington.froilansfarm.Interfaces.FarmVehicle;
import com.zipcodewilmington.froilansfarm.Interfaces.Rider;

public class Tractor extends Vehicle implements FarmVehicle {
    Boolean isOn;
    Boolean hasRider;
    Boolean isMoving;
    Rider driver;

    public Tractor(){
        isOn = false;
        hasRider = false;
        isMoving = false;
        driver = null;
    }

    public String makenoise() {

        return "puhVRooPuhHoo puhVROOpuhHOO";
    }

    public void ride() {
        isMoving = true;
    }

    public void stopRiding(){
        isMoving = false;
    }

    public Boolean getIsMoving(){
        return isMoving;
    }

    public Crop harvest() {


        return null;
    }

    public Boolean getIsOn(){
        return isOn;
    }

    public void setIsOn(Boolean onOrOff){
        isOn = onOrOff;
    }


    public Boolean getHasRider() {
        return hasRider;
    }

    public void setHasRider(Boolean hasRider) {
        this.hasRider = hasRider;
    }

    public void mountThis(Rider driver){
        this.driver = driver;
    }

    public Rider getDriver(){
        return driver;
    }

    public void getOffThis(){
        this.driver = null;
    }
}
