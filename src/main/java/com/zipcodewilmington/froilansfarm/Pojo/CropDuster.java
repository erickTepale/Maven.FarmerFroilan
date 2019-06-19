package com.zipcodewilmington.froilansfarm.Pojo;

import com.zipcodewilmington.froilansfarm.Interfaces.Aircraft;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.FarmVehicle;
import com.zipcodewilmington.froilansfarm.Interfaces.Rider;

public class CropDuster extends Vehicle implements FarmVehicle, Aircraft {
    Boolean isOn;
    Boolean hasPilot;
    Boolean isMoving;
    Boolean isFlying;
    Rider pilot;


    public CropDuster(){
        isOn = false;
        hasPilot = false;
        isMoving = false;
        pilot = null;
        isFlying = false;
    }


    public void fly() {
        isFlying = true;

    }

    public void land(){
        isFlying = false;
    }

    public Boolean getIsFlying(){
        return isFlying;
    }

    public String makenoise() {

        return "nnneeaoowww";
    }

    public void ride() {
        isMoving = true;
    }

    public void stopRiding(){
        isMoving = false;
    }



    public void fertiilizes(Edible edible){
        //edible.hasBeemFertilized
    }

    public Boolean getIsOn() {
        return isOn;
    }

    public void setIsOn(Boolean on) {
        isOn = on;
    }

    public Boolean getHasPilot() {
        return hasPilot;
    }

    public void setHasPilot(Boolean hasPilot) {
        this.hasPilot = hasPilot;
    }

    public Boolean getMoving() {
        return isMoving;
    }


    public Rider getPilot() {
        return pilot;
    }

    public void setPilot(Pilot pilot) {
        this.pilot = pilot;
    }
}
