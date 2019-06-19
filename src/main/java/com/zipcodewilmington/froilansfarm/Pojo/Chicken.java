package com.zipcodewilmington.froilansfarm.Pojo;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Produce;

public class Chicken extends Animal implements Produce {
    Egg egg;

    public void eat(Edible food) {

    }

    public String  makenoise() {
        return null;
    }


    public Edible yields() {
        return new EdibleEgg();
    }

}
