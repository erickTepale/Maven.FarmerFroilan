package com.zipcodewilmington.froilansfarm.Pojo;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;

import java.util.List;

public class CornStalk extends Crop {
    EarOfCorn earOfCorn;

    @Override
    public Edible yields(Storage storage) {
        return earOfCorn;
    }
}
