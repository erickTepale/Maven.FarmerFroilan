package com.zipcodewilmington.froilansfarm.Pojo;

import java.util.ArrayList;
import java.util.List;

public class CropRow{
    private Boolean isFertilized;
    private List<Crop> cropRow;

    public CropRow(){
        isFertilized = false;
        cropRow = new ArrayList<>();
    }

    public void harvest(){
        for (Crop each : cropRow) {
            each.yields(Storage.getInstance());
        }
    }

    public Integer count(){
        return cropRow.size();
    }

    public void add(Crop crop){
        cropRow.add(crop);
    }

    public Boolean getFertilized() {
        return isFertilized;
    }

    public void fertilize() {
        isFertilized = true;
    }

    public List<Crop> getCropRow() {
        return cropRow;
    }
}
