package com.zipcodewilmington.froilansfarm.Pojo;

import com.zipcodewilmington.froilansfarm.Interfaces.Eater;
import com.zipcodewilmington.froilansfarm.Interfaces.NoiseMaker;

abstract class Animal implements Eater, NoiseMaker {
    Boolean isHungery = true;

    public void eat(Storage storage) {
        if (storage != null && isHungery) {
            storage.removeFoodByIndex(0);
            this.isHungery = false;
        }
    }
}