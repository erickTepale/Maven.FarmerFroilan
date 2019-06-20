package com.zipcodewilmington.froilansfarm.Pojo;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;

public class TomatoPlant extends Crop {
    Tomato tomato;


    @Override
    public Edible yields(Storage storage) {
        return tomato;
    }
}
