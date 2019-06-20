package com.zipcodewilmington.froilansfarm.Pojo;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import org.junit.Assert;

public class ChickenTest {
    Chicken chicken = new Chicken();
    Storage<Tomato> tomatoStorage = new Storage<Tomato>();

    @org.junit.Test
    public void eat() {
        tomatoStorage.addFood(new Tomato());
        tomatoStorage.addFood(new Tomato());
        chicken.eat(tomatoStorage.getFood());

        Integer expected = 1;
        Integer actual = tomatoStorage.count();

        Assert.assertEquals(expected,actual);
    }


    @org.junit.Test
    public void makenoise() {
        String actual = "cluck";
        String expected = chicken.makenoise();

        Assert.assertEquals(expected,actual);
    }

    @org.junit.Test
    public void yields() {
        Egg actual = new EdibleEgg();
        Edible expected = chicken.yields();

        Assert.assertEquals(expected,actual);
    }
}