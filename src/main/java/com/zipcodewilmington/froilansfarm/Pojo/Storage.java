package com.zipcodewilmington.froilansfarm.Pojo;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;

import java.util.ArrayList;
import java.util.List;

public class Storage<E extends Edible> {
    private List<E> storage = new ArrayList<E>();

    public void addFood(E food) {
        storage.add(food);
    }
    public void removeFood(E food) {
        storage.remove(food);
    }
    public void removeFoodByIndex(Integer index) {

        if (storage.size() > 0){
            storage.remove(0);
        }
    }

    public E getFood() {
        if (storage.get(0) != null){
        return storage.get(0);
        }
        return null;
    }

    public Integer count() {
        return storage.size();
    }

}
