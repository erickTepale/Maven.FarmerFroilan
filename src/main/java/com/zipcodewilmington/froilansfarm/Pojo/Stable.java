package com.zipcodewilmington.froilansfarm.Pojo;

import com.zipcodewilmington.froilansfarm.Pojo.Horse;

import java.util.ArrayList;
import java.util.List;

public class Stable {
    List<Horse> stable = new ArrayList<Horse>();


    public void addHorse(Horse horse) {
        this.stable.add(horse);
    }

    public void removeHorse(Horse horse) {
        this.stable.remove(horse);
    }

    public Integer horesCount() {
        return stable.size();
    }

    public Horse getHorse(Integer i) {
        return stable.get(i);
    }
}
