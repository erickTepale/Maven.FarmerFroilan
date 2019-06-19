package com.zipcodewilmington.froilansfarm.Pojo;

import com.zipcodewilmington.froilansfarm.Interfaces.Aircraft;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.FarmVehicle;
import com.zipcodewilmington.froilansfarm.Interfaces.Rider;

public class CropDuster extends Vehicle implements FarmVehicle, Aircraft {

    public void fly() {

    }

    public String makenoise() {
        return null;
    }

    public void ride(Rider rider) {

    }

    public void fertiilizes(Edible edible){
        //edible.hasBeemFertilized
    };
}
