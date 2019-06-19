package com.zipcodewilmington.froilansfarm.Pojo;

import com.zipcodewilmington.froilansfarm.Pojo.Horse;

import java.util.ArrayList;
import java.util.List;

public class Stable {
    List<Horse> stable = new ArrayList<Horse>();


    public void addHorse(Horse hores) {
        this.stable.add(hores);
    }

    public void removeHorse(Horse hores) {
        this.stable.remove(hores);
    }

    public Integer horesCount() {
        return stable.size();
    }

    public Horse getHorse(Integer i) {
        return stable.get(i);
    }
}
