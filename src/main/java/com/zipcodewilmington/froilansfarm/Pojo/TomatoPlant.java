package com.zipcodewilmington.froilansfarm.Pojo;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;

import java.util.ArrayList;
import java.util.List;

public class TomatoPlant extends Crop {
    private List<Tomato> tomatoPlant;

    public TomatoPlant(){
        super();
        tomatoPlant = new ArrayList<Tomato>();
        addTomato(5);
    }

    public void addTomato(Integer amountOfAdds){
        if(amountOfAdds > 0) {
            for (int i = 0; i < amountOfAdds; i++) {
                tomatoPlant.add(new Tomato());
            }
        }
    }

    public void clearStalk(){
        tomatoPlant.clear();
    }

    @Override
    public Edible yields(Storage storage) {
        return null;
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
