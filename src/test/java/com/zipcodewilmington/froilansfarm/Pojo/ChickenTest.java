package com.zipcodewilmington.froilansfarm.Pojo;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import org.junit.Assert;

import java.util.List;

public class ChickenTest {
    Chicken chicken = new Chicken();
    Storage<EdibleEgg>eggStorage = new Storage<EdibleEgg>();


    @org.junit.Test
    public void makenoise() {
        String actual = "cluck";
        String expected = chicken.makenoise();

        Assert.assertEquals(expected,actual);
    }

    @org.junit.Test
    public void yields() {
        chicken.yields(eggStorage);

        Integer actual = 1;
        Integer expected = eggStorage.count();

        Assert.assertEquals(expected,actual);
    }
}