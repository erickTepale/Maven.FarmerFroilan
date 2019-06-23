package com.zipcodewilmington.froilansfarm.Pojo;

import com.zipcodewilmington.froilansfarm.Interfaces.Eater;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.NoiseMaker;

abstract class Animal implements Eater, NoiseMaker {
    private Boolean isHungery = true;
    Storage storage = Storage.getInstance();

    public void eat(Edible edible , Integer integer) {
        for (int i = 0; i <integer ; i++) {
            storage.removeEdible(edible);

        }
    }
}
