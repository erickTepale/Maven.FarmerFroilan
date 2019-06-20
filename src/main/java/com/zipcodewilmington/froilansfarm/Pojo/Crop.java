package com.zipcodewilmington.froilansfarm.Pojo;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Produce;

public abstract class Crop implements Produce, Edible {
    Boolean hasBeenHavested;
    Boolean HasBeenFertilized;

    public void yields(Edible edible) {
    }
}
