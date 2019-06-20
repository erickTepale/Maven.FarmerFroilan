package com.zipcodewilmington.froilansfarm.Pojo;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalTest {


    @org.junit.Test
    public void eat() {
        Storage tomatoStorage = new Storage<Tomato>();
        Chicken chicken = new Chicken();

        tomatoStorage.addFood(new Tomato());
        tomatoStorage.addFood(new Tomato());
        chicken.eat(tomatoStorage);

        Integer expected = 1;
        Integer actual = tomatoStorage.count();

        Assert.assertEquals(expected,actual);
    }
}