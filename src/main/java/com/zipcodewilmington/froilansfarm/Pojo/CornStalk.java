package com.zipcodewilmington.froilansfarm.Pojo;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class CornStalk extends Crop {
    private List<EarOfCorn> cornStalk;

    public CornStalk(){
        cornStalk = new ArrayList<EarOfCorn>();
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
       return null;
       // adds all the corn on the stalk to the container
        //then clears the array of cornStalk
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
}
