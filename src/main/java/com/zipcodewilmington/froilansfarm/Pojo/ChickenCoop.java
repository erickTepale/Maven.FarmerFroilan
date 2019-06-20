package com.zipcodewilmington.froilansfarm.Pojo;

import java.util.ArrayList;
import java.util.List;

public class ChickenCoop {
    private List<Chicken> chickenCoop = new ArrayList<Chicken>();


    public void addChicken(Chicken chicken) {
        this.chickenCoop.add(chicken);
    }

    public void removeChicken(Chicken chicken) {
        this.chickenCoop.remove(chicken);
    }

    public Integer chickenCount() {
        return chickenCoop.size();
    }

    public Chicken getChicken(Integer index) {
        return chickenCoop.get(index);
    }
}
