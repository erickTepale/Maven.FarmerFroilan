package com.zipcodewilmington.froilansfarm.Pojo;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Produce;

public class Crop implements Produce, Edible {
    Boolean hasBeenHavested;
    Boolean HasBeenFertilized;
    CornStalk cornStalk;
    TomatoPlant tomatoPlant;

    public Edible yields(Storage storage) {
        return null;
    }
}
