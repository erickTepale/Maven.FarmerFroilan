package com.zipcodewilmington.froilansfarm.Pojo;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.Interfaces.Rider;

public class Horse extends Animal implements Rideable {
    Boolean isMoving = false;

    public void eat(Edible edible) {
    }

    public String makenoise() {
        return null;
    }


    public void ride(Rider rider) {
        isMoving = true;
    }
}
