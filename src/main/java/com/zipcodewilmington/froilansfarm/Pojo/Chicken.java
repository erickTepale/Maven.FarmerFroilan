package com.zipcodewilmington.froilansfarm.Pojo;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Produce;

public class Chicken extends Animal implements Produce {
//

    public Chicken() {};

    public String  makenoise() {
        return "cluck";
    }

    public void yields(Edible edible) {
        super.storage.addEdible(edible);
    }

}
