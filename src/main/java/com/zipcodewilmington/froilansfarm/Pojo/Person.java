package com.zipcodewilmington.froilansfarm.Pojo;

import com.zipcodewilmington.froilansfarm.Interfaces.Eater;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Interfaces.Rider;

import java.util.ArrayList;
import java.util.List;

abstract class Person implements Eater, NoiseMaker {

    private List<Edible> stomach;

    public Person() {
        this.stomach = new ArrayList<Edible>();
    }

    public List<Edible> getStomach() {
        return stomach;
    }

    public void setStomach(List<Edible> stomach) {
        this.stomach = stomach;
    }


    public void eat(Edible food) {
        stomach.add(food);

    }

}
