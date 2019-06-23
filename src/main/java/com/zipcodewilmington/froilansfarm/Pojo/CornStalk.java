package com.zipcodewilmington.froilansfarm.Pojo;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import java.awt.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class CornStalk extends Crop { // add harvested methods to crop rows and fields !!
    private List<EarOfCorn> cornStalk;
    private Boolean hasBeenHarvested;

    public CornStalk(){
        cornStalk = new ArrayList<EarOfCorn>();
        hasBeenHarvested = false;
        addEar(8);
    }

    public void addEar(Integer amountOfAdds){
        if(amountOfAdds > 0) {
            for (int i = 0; i < amountOfAdds; i++) {
                cornStalk.add(new EarOfCorn());
            }
        }
    }

    public void clearStalk(){
        cornStalk.clear();
    }

    @Override
    public Edible yields(Storage storage) {
        setHasBeenHavested(true);
        for (int i = 0; i < cornStalk.size() ; i++) {
            storage.addEdible(cornStalk.get(i));
        }
        System.out.println("\nAdded " + cornStalk.size()+ " Ears of Corn To Storage");
       return null;
    }

    public Integer count(){
       return cornStalk.size();
    }

    @Override
    public Boolean getHasBeenHavested() {
        return super.getHasBeenHavested();
    }

    @Override
    public void setHasBeenHavested(Boolean hasBeenHavested) {
        super.setHasBeenHavested(hasBeenHavested);
    }

    @Override
    public Boolean getHasBeenFertilized() {
        return super.getHasBeenFertilized();
    }

    @Override
    public void setHasBeenFertilized(Boolean hasBeenFertilized) {
        super.setHasBeenFertilized(hasBeenFertilized);
    }

    @Override
    public String toString() {
        return "Cornstalk";
    }
}


