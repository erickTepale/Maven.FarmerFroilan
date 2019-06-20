package com.zipcodewilmington.froilansfarm.Pojo;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.Interfaces.Rider;

public class Horse extends Animal implements Rideable {
    Boolean isMoving;
    Boolean hasRider;
    Rider rider;


    public Horse() {
        this.isMoving= false;
        this.hasRider = false;
        this.rider = null;
    }

    public String makenoise() {
        return "Neigh";
    }

    public void ride() {
        this.isMoving = true;
    }

    public void stopRiding(){
        isMoving = false;
    }

    public Boolean getIsMoving(){
        return isMoving;
    }


    public Boolean getHasRider() {
        return hasRider;
    }

    public void setHasRider(Boolean hasRider) {
        this.hasRider = hasRider;
    }

    public void mountThis(Rider driver){
        this.rider = driver;
    }

    public Rider getRider(){
        return rider;
    }

    public void getOffThis(){
        this.rider = null;
    }
}
