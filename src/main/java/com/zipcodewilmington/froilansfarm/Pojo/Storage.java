package com.zipcodewilmington.froilansfarm.Pojo;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;

import java.util.List;

public class Storage<E extends Edible> {
    private List<E> storage;

    public void addFood(E food) {
        storage.add(food);
    }

    public void removeFood(E food) {
        storage.remove(food);
    }

}
