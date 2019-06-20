package com.zipcodewilmington.froilansfarm.Pojo;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChickenCoopTest {
    ChickenCoop chickenCoop = new ChickenCoop();
    @Test
    public void addChickenTest() {
        Chicken chicken = new Chicken();
        chickenCoop.addChicken(chicken);

        Chicken actual = chicken;
        Chicken expected = chickenCoop.getChicken(0);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void addChickenTest2() {
        chickenCoop.addChicken(new Chicken());
        chickenCoop.addChicken(new Chicken());


        Integer actual = 2;
        Integer expected = chickenCoop.chickenCount();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void addChickenTest3() {
        Chicken chicken = new Chicken();
        chickenCoop.addChicken(new Chicken());
        chickenCoop.addChicken(new Chicken());
        chickenCoop.addChicken(chicken);

        Chicken actual = chicken;
        Chicken expected = chickenCoop.getChicken(2);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void removeChickenTest() {
        chickenCoop.addChicken(new Chicken());
        chickenCoop.removeChicken(chickenCoop.getChicken(0));

        Integer actual = 0;
        Integer expected = chickenCoop.chickenCount();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void removeChickenTestMultible() {
        chickenCoop.addChicken(new Chicken());
        chickenCoop.addChicken(new Chicken());
        chickenCoop.addChicken(new Chicken());
        chickenCoop.addChicken(new Chicken());

        chickenCoop.removeChicken(chickenCoop.getChicken(0));

        Integer actual = 3;
        Integer expected = chickenCoop.chickenCount();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void chickenCountTest() {
        chickenCoop.addChicken(new Chicken());
        chickenCoop.addChicken(new Chicken());
        chickenCoop.addChicken(new Chicken());
        chickenCoop.addChicken(new Chicken());

        Integer actual = 4;
        Integer expected = chickenCoop.chickenCount();

        Assert.assertEquals(expected,actual);
    }


    @Test
    public void getChickenTest() {
        Chicken chicken = new Chicken();
        chickenCoop.addChicken(new Chicken());
        chickenCoop.addChicken(new Chicken());
        chickenCoop.addChicken(chicken);

        Chicken actual = chicken;
        Chicken expected = chickenCoop.getChicken(2);

        Assert.assertEquals(expected,actual);
    }
}