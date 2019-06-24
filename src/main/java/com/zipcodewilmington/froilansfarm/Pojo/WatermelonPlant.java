package com.zipcodewilmington.froilansfarm.Pojo;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;

import java.util.ArrayList;
import java.util.List;


public class WatermelonPlant extends Crop {
    private List<Watermelon> watermelonPlant;

    public WatermelonPlant(){
        super();

        watermelonPlant = new ArrayList<Watermelon>();
        addWaterMelon(1);
    }

    public void addWaterMelon(Integer amountOfAdds){
        if(amountOfAdds > 0) {
            for (int i = 0; i < amountOfAdds; i++) {
                watermelonPlant.add(new Watermelon());
            }
        }
    }

    public void clearStalk(){
        watermelonPlant.clear();
    }

    public Integer count(){
        return watermelonPlant.size();
    }

    @Override
    public Edible yields(Storage storage) {
        for (int i = 0; i <watermelonPlant.size() ; i++) {
            storage.addEdible(watermelonPlant.get(i));
        }
        System.out.println("Added " + watermelonPlant.size() + " Watermelons to Storage");
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

    @Override
    public String toString() {
        return "Watermelon Plant";
    }
}
