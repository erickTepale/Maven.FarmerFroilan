package com.zipcodewilmington.froilansfarm.Interfaces;

import com.zipcodewilmington.froilansfarm.Pojo.Crop;
import com.zipcodewilmington.froilansfarm.Pojo.CropRow;

public interface Botanist {
    void plant(Crop crop, CropRow cropRow, Integer integer);
}
