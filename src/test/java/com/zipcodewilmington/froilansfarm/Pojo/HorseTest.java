package com.zipcodewilmington.froilansfarm.Pojo;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class HorseTest {

    Horse horse = new Horse();
    Storage<Tomato> tomatoStorage = new Storage<Tomato>();

    @org.junit.Test
    public void eat() {
        tomatoStorage.addFood(new Tomato());
        tomatoStorage.addFood(new Tomato());
        horse.eat(tomatoStorage.getFood());

        Integer expected = 1;
        Integer actual = tomatoStorage.count();

        Assert.assertEquals(expected,actual);
    }


    @org.junit.Test
    public void makenoise() {
        String actual = "neigh";
        String expected = horse.makenoise();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void ride() {
    }
}