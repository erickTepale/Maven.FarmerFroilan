package com.zipcodewilmington.froilansfarm.Pojo;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Produce;

public abstract class Crop implements Produce, Edible {
    private Boolean hasBeenHavested;
    private Boolean hasBeenFertilized;

    public Crop(){
        hasBeenHavested = false;
        hasBeenFertilized = false;
    }

    public abstract Edible yields(Storage storage);

    public Boolean getHasBeenHavested() {
        return hasBeenHavested;
    }

    public void setHasBeenHavested(Boolean hasBeenHavested){
        this.hasBeenHavested = hasBeenHavested;
    };

    public Boolean getHasBeenFertilized(){
        return hasBeenHavested;
    };

    public void setHasBeenFertilized(Boolean hasBeenFertilized){
        this.hasBeenFertilized = hasBeenFertilized;
    }
}
