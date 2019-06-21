package com.zipcodewilmington.froilansfarm.Pojo;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class StorageTest {
    Storage storage = Storage.getInstance();
    Tomato tomato = new Tomato();
    EarOfCorn earOfCorn = new EarOfCorn();
    EdibleEgg edibleEgg = new EdibleEgg();

    @Before
    public void before() {
        storage.resetConainter();
    }
    @After
    public void after() {
        storage.resetConainter();
    }


    @Test
    public void addFoodTomato() {
        storage.addEdible(tomato);

        Integer expected = 1;
        Integer actual = storage.count(tomato);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void addFoodCorn() {
        storage.addEdible(earOfCorn);

        Integer expected = 1;
        Integer actual = storage.count(earOfCorn);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void Egg() {
        storage.addEdible(edibleEgg);

        Integer expected = 1;
        Integer actual = storage.count(edibleEgg);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void removeFood() {
        storage.addEdible(tomato);
        storage.removeEdible(tomato);

        Integer expected = 0;
        Integer actual = storage.count(tomato);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getFood() {
        storage.addEdible(tomato);


        Integer expected = 1;
        Integer actual = storage.count(tomato);

        Assert.assertEquals(expected,actual);

    }

}