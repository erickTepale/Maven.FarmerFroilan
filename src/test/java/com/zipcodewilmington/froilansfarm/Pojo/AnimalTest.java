package com.zipcodewilmington.froilansfarm.Pojo;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalTest {
    Storage tomatoStorage = Storage.getInstance();
    Tomato tomato = new Tomato();
    EarOfCorn earOfCorn = new EarOfCorn();
    EdibleEgg edibleEgg = new EdibleEgg();
    @Before
    public void before() {
        tomatoStorage.resetConainter();
    }
    @After
    public void after() {
        tomatoStorage.resetConainter();
    }


    @Test
    public void eat() {

        Chicken chicken = new Chicken();

        tomatoStorage.addEdible(new Tomato());
        tomatoStorage.addEdible(new Tomato());
        chicken.eat(tomato,1);

        Integer expected = 1;
        Integer actual = tomatoStorage.count(tomato);

        Assert.assertEquals(expected,actual);
    }

    public void eat2() {
        Chicken chicken = new Chicken();

        tomatoStorage.addEdible(new EarOfCorn());
        tomatoStorage.addEdible(new EarOfCorn());
        chicken.eat(earOfCorn,1);

        Integer expected = 1;
        Integer actual = tomatoStorage.count(earOfCorn);

        Assert.assertEquals(expected,actual);
    }

    public void eat3() {
        Chicken chicken = new Chicken();

        tomatoStorage.addEdible(new EdibleEgg());
        tomatoStorage.addEdible(new EdibleEgg());
        chicken.eat(tomato,1);

        Integer expected = 1;
        Integer actual = tomatoStorage.count(edibleEgg);

        Assert.assertEquals(expected,actual);
    }
}