package com.zipcodewilmington.froilansfarm.Pojo;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalTest {
    Storage tomatoStorage = Storage.getInstance();
    @Before
    public void before() {
        tomatoStorage.resetConainter();
    }
    @After
    public void after() {
        tomatoStorage.resetConainter();
    }


    @org.junit.Test
    public void eat() {
        Tomato tomato = new Tomato();
        Chicken chicken = new Chicken();

        tomatoStorage.addEdible(new Tomato());
        tomatoStorage.addEdible(new Tomato());
        chicken.eat(tomato);

        Integer expected = 1;
        Integer actual = tomatoStorage.count(tomato);

        Assert.assertEquals(expected,actual);
    }
}