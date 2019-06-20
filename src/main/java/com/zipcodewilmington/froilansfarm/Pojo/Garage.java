package com.zipcodewilmington.froilansfarm.Pojo;

import java.util.ArrayList;
import java.util.List;

public class Garage<E extends Vehicle> {
    List<Vehicle> theGarage;


    Garage(){
        theGarage = new ArrayList<Vehicle>();
    }

    public void add(E vehicleToAdd){
        theGarage.add(vehicleToAdd);
    }

    public boolean remove(E vehicleToRemove){
        return theGarage.remove(vehicleToRemove);
    }

    public Integer sizeOfGarage(){
        return theGarage.size();
    }


}
