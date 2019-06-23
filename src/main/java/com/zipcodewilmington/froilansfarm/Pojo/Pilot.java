package com.zipcodewilmington.froilansfarm.Pojo;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.Interfaces.Rider;

public class Pilot extends Person implements Rider {




    public void mount(Rideable rideable) {
        ((CropDuster) rideable).addRider(this);
        printMount(rideable);
    }

    public void dismount(Rideable rideable) {
        ((CropDuster) rideable).land();
        printDismount(rideable);
    }

    public void operate(Rideable rideable) {
        ((CropDuster)rideable).fly();
        printOperate(rideable);
    }
    public void fertilizeAllCropRows(Farm farm) {
        Rideable rideable = farm.getCropDuster();
        mount(rideable);
        rideable.makeNoiseIT();
        operate(rideable);
        for(CropRow cropRow : farm.getField().getCropRow()) {
            cropRow.fertilize();
        }
        dismount(rideable);
    }
    public String makenoise() {
        return "Pilot Shouting";
    }

    private void printMount(Rideable mount){
        System.out.println("\nFroilanda Mounted: "+ mount);
    }

    private void printPlant(Crop crop){
        System.out.println("\nFroilanda Planted: " + crop);
    }

    private void printDismount(Rideable mount){
        System.out.println("\nFroilanda Dismounted: " + mount);
    }
    private void printOperate(Rideable operate){
        System.out.println(makenoise());
        System.out.println("\nFroilanda Operates: " + operate);
    }
}
