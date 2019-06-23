package com.zipcodewilmington.froilansfarm.Pojo;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.Interfaces.Rider;

public class Pilot extends Person implements Rider {




    public void mount(Rideable rideable) {
        ((CropDuster) rideable).addRider(this);
    }

    public void dismount(Rideable rideable) {
        ((CropDuster) rideable).land();
    }

    public void operate(Rideable rideable) {
        ((CropDuster)rideable).fly();
    }

    public void fertilizeAllCropRows(Farm farm) {
        Rideable rideable = farm.getCropDuster();
        mount(rideable);
        operate(rideable);
        for(CropRow cropRow : farm.getField().getCropRow()) {
            cropRow.fertilize();
        }
        dismount(rideable);
    }
    public String makenoise() {
        return "Pilot Shouting";
    }
}
