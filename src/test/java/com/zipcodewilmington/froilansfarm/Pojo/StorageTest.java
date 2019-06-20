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

    @Before
    public void before() {
        storage.resetConainter();
    }
    @After
    public void after() {
        storage.resetConainter();
    }


    @Test
    public void addFood() {
        storage.addEdible(tomato);

        Integer expected = 1;
        Integer actual = storage.count(tomato);

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