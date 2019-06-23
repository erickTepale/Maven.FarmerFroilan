package com.zipcodewilmington.froilansfarm.Pojo;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Rider;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HorseTest {
    Horse horse = new Horse();
    Storage storage = Storage.getInstance();
    Tomato tomato = new Tomato();
    Farmer farmer = new Farmer();

    @Before
    public void before() {
        storage.resetConainter();
    }
    @After
    public void after() {
        storage.resetConainter();
    }

    @org.junit.Test
    public void eat() {
        storage.addEdible(new Tomato());
        storage.addEdible(new Tomato());
        horse.eat(tomato,1);

        Integer expected = 1;
        Integer actual = storage.count(tomato);

        Assert.assertEquals(expected,actual);
    }


    @org.junit.Test
    public void makenoise() {
        String actual = "\nNeigh";
        String expected = horse.makenoise();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void ride() {
        horse.ride();
        Boolean actual = true;
        Boolean expected = horse.getIsMoving();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void stopRiding() {
        horse.ride();
        horse.stopRiding();
        Boolean actual = false;
        Boolean expected = horse.getIsMoving();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getIsMoving() {
        horse.ride();
        horse.stopRiding();
        Boolean actual = false;
        Boolean expected = horse.getIsMoving();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getHasRiderFalse() {

        Boolean actual = false;
        Boolean expected = horse.getHasRider();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getHasRiderTrue() {
        horse.setHasRider(true);
        Boolean actual = true;
        Boolean expected = horse.getHasRider();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setHasRider() {
        horse.setHasRider(true);

        assertTrue(horse.getHasRider());

    }

    @Test
    public void mountThis() {
            horse.mountThis(farmer);

            Rider actual = farmer;
            Rider expected = horse.getRider();

            Assert.assertEquals(expected,actual);
    }

    @Test
    public void getDriver() {
        horse.mountThis(farmer);

        Rider actual = farmer;
        Rider expected = horse.getRider();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getOffThis() {
        horse.mountThis(farmer);
        horse.getOffThis();
        Rider actual = null;
        Rider expected = horse.getRider();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void instanceAnimal () {
        assertTrue(horse instanceof Animal);
    }
}