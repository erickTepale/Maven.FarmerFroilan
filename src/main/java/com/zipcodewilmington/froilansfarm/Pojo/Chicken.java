package com.zipcodewilmington.froilansfarm.Pojo;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Produce;

import java.util.List;

public class Chicken extends Animal implements Produce {
//

    public Chicken() {};

    public String  makenoise() {
        return "cluck";
    }


    public Edible yields(Storage storage){//List<Edible> storage) {
            EdibleEgg edibleEgg = new EdibleEgg();
            storage.addFood(edibleEgg);
            //storage.add(edibleEgg);
        return new EdibleEgg();
    }

}
