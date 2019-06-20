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


    public Crop harvest() {


        return null;
    }


    public void addRider(Rider theRider){
        rider = theRider;
    }





}
