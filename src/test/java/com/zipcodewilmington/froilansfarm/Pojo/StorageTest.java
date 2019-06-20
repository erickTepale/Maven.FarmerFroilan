package com.zipcodewilmington.froilansfarm.Pojo;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class StorageTest {
    Storage<Tomato> storage = new Storage<Tomato>();

    Tomato tomato = new Tomato();

    @Test
    public void addFood() {
        storage.addFood(tomato);

        Integer expected = 1;
        Integer actual = storage.count();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void removeFood() {
        storage.addFood(tomato);
        storage.removeFood(tomato);

        Integer expected = 0;
        Integer actual = storage.count();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getFood() {
        storage.addFood(tomato);


        Tomato expected = tomato;
        Tomato actual = storage.getFood();

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void removeFoodByIndex() {
        storage.addFood(tomato);
        storage.removeFoodByIndex(0);

        Integer expected = 0;
        Integer actual = storage.count();

        Assert.assertEquals(expected,actual);
    }
}